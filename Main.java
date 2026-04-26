import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. TRAMA E INTRODUZIONE
        System.out.println("---------------------------------------------------------------");
        System.out.println("                     THE LOTUS EXILE                           ");
        System.out.println("---------------------------------------------------------------");
        System.out.println("New York, 1984. The Lotus Exile is a place suspended in time...");
        System.out.println("The stairs have collapsed, and the only possible escape route");
        System.out.println("is a helicopter on the roof. You must find the missing elevator");
        System.out.println("buttons guarded by twisted entities to reach the top.");
        System.out.println("If you fail, your MAC address will be cultivated forever...");
        System.out.println("---------------------------------------------------------------\n");

        // 2. SELEZIONE DEL PERSONAGGIO
        Giocatore giocatore = null;
        while (giocatore == null) {
            System.out.println("Choose your character:");
            System.out.println("1. Athlete (High Health & Attack)");
            System.out.println("2. Nurse (Balanced, Good Defense)");
            System.out.println("3. Mad Scientist (Low Health, High Utility)");
            System.out.println("4. Veteran (Very High Stats, Hardened)");
            System.out.print("> ");
            
            String scelta = scanner.nextLine().trim();
            switch (scelta) {
                case "1": giocatore = new Atleta(); break;
                case "2": giocatore = new Infermiera(); break;
                case "3": giocatore = new ScienziatoPazzo(); break;
                case "4": giocatore = new Veterano(); break;
                default: System.out.println("Invalid choice. Please type 1, 2, 3, or 4.");
            }
        }
        
        System.out.println("\nYou selected: " + giocatore.getNome() + "! Let the nightmare begin.\n");

        // 3. COSTRUZIONE DELLA MAPPA (Grafo Ortogonale)
        Reception reception = new Reception();
        Bar bar = new Bar();
        Ristorante ristorante = new Ristorante();
        Cucina cucina = new Cucina();
        GiardinoZen giardino = new GiardinoZen();
        CorridoioScuro corridoio = new CorridoioScuro();
        Lavanderia lavanderia = new Lavanderia();
        Palestra palestra = new Palestra();
        Spa spa = new Spa();
        Biblioteca biblioteca = new Biblioteca();
        Teatro teatro = new Teatro();
        Suite suite = new Suite();
        Eliporto eliporto = new Eliporto();

        // Collegamenti: Nord, Sud, Est, Ovest
        reception.impostaUscite(corridoio, null, bar, cucina);
        bar.impostaUscite(null, null, ristorante, reception);
        ristorante.impostaUscite(null, null, null, bar);
        cucina.impostaUscite(null, null, reception, giardino);
        giardino.impostaUscite(null, null, cucina, null);
        
        corridoio.impostaUscite(palestra, reception, lavanderia, null);
        lavanderia.impostaUscite(null, null, null, corridoio);
        
        palestra.impostaUscite(suite, corridoio, spa, biblioteca);
        spa.impostaUscite(null, null, null, palestra);
        biblioteca.impostaUscite(teatro, null, palestra, null);
        teatro.impostaUscite(null, biblioteca, null, null);
        
        suite.impostaUscite(eliporto, palestra, null, null);
        eliporto.impostaUscite(null, suite, null, null); // Finale

        // 4. GAME LOOP
        Stanza stanzaCorrente = reception;
        boolean inGioco = true;

        while (inGioco) {
            stanzaCorrente.entra();
            
            // Stampa opzioni di movimento disponibili
            System.out.print("Available paths: ");
            if (stanzaCorrente.nord != null) System.out.print("[North] ");
            if (stanzaCorrente.sud != null) System.out.print("[South] ");
            if (stanzaCorrente.est != null) System.out.print("[East] ");
            if (stanzaCorrente.ovest != null) System.out.print("[West] ");
            System.out.println();

            System.out.print("\nWhat do you want to do? (Type 'help' for commands)\n> ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("help")) {
                System.out.println("\nCOMMANDS:");
                System.out.println("- move <north/south/east/west> : Move to another room");
                System.out.println("- take <item name>             : Pick up an item");
                System.out.println("- attack                       : Attack the enemy in the room");
                System.out.println("- inventory                    : Check your items");
                System.out.println("- stats                        : Check your health and stats");
                System.out.println("- quit                         : Give up and die");
                continue;
            }

            if (input.equals("quit")) {
                System.out.println("You gave up. Your MAC Address has been harvested for the Zen Garden.");
                break;
            }

            if (input.equals("stats")) {
                System.out.println("\n--- Player Stats ---");
                System.out.println("HP: " + giocatore.getVita() + "/" + giocatore.vitaMassima);
                System.out.println("ATK: " + giocatore.getAttacco());
                System.out.println("DEF: " + giocatore.getDifesa());
                System.out.println("Level: " + giocatore.livello + " (XP: " + giocatore.esperienza + "/50)");
                continue;
            }

            if (input.equals("inventory")) {
                System.out.println("\n--- Inventory ---");
                giocatore.getInventario().mostra();
                continue;
            }

            if (input.startsWith("take ")) {
                String nomeOggetto = input.substring(5).trim();
                boolean trovato = false;
                for (int i = 0; i < stanzaCorrente.getBottino().size(); i++) {
                    Elemento obj = stanzaCorrente.getBottino().get(i);
                    if (obj.getNome().toLowerCase().contains(nomeOggetto)) {
                        giocatore.getInventario().aggiungi(obj);
                        stanzaCorrente.getBottino().remove(i);
                        trovato = true;
                        break;
                    }
                }
                if (!trovato) {
                    System.out.println("Item not found here.");
                }
                continue;
            }

            if (input.equals("attack")) {
                Nemico nemico = stanzaCorrente.getCustode();
                if (nemico == null || nemico.getVita() <= 0) {
                    System.out.println("There is no one to attack here.");
                } else {
                    gestisciCombattimento(giocatore, nemico, scanner);
                }
                continue;
            }

            if (input.startsWith("move ")) {
                Nemico nemico = stanzaCorrente.getCustode();
                if (nemico != null && nemico.getVita() > 0) {
                    System.out.println("You cannot leave! " + nemico.getNome() + " is blocking the way. Defeat them first!");
                    continue;
                }

                String direzione = input.substring(5).trim();
                Stanza prossima = null;
                switch (direzione) {
                    case "north": prossima = stanzaCorrente.nord; break;
                    case "south": prossima = stanzaCorrente.sud; break;
                    case "east":  prossima = stanzaCorrente.est; break;
                    case "west":  prossima = stanzaCorrente.ovest; break;
                    default: System.out.println("Invalid direction."); continue;
                }

                if (prossima != null) {
                    stanzaCorrente = prossima;
                    if (stanzaCorrente instanceof Eliporto) {
                        System.out.println("\n*** YOU REACHED THE HELIPAD! YOU ESCAPED THE LOTUS EXILE! ***");
                        inGioco = false;
                    }
                } else {
                    System.out.println("There is no door in that direction.");
                }
                continue;
            }

            System.out.println("Command not recognized. Type 'help'.");
        }
        
        scanner.close();
    }

    private static void gestisciCombattimento(Giocatore giocatore, Nemico nemico, Scanner scanner) {
        System.out.println("\nCOMBAT STARTED against " + nemico.getNome() + "!");
        
        while (giocatore.getVita() > 0 && nemico.getVita() > 0) {
            System.out.println("\nYour HP: " + giocatore.getVita() + " | " + nemico.getNome() + " HP: " + nemico.getVita());
            System.out.println("1. Basic Attack");
            System.out.println("2. Use Item/Weapon");
            System.out.print("Action > ");
            
            String azione = scanner.nextLine();
            
            // Turno Giocatore
            if (azione.equals("1")) {
                giocatore.attacca(nemico);
            } else if (azione.equals("2")) {
                System.out.println("Choose item to use (type exact name, or 'cancel'): ");
                giocatore.getInventario().mostra();
                String itemChoice = scanner.nextLine().trim();
                
                boolean usato = false;
                for (Elemento e : giocatore.getInventario().getOggetti()) {
                    if (e.getNome().equalsIgnoreCase(itemChoice)) {
                        if (e instanceof Arma) {
                            System.out.println("Equipping and using " + e.getNome() + "...");
                            ((Arma) e).usa(nemico);
                        } else if (e instanceof Pozione) {
                            ((Pozione) e).usa(giocatore);
                        } else {
                            System.out.println("You can't use this in combat right now.");
                        }
                        usato = true;
                        break;
                    }
                }
                if (!usato) System.out.println("Item not found, you wasted your turn!");
            } else {
                System.out.println("Invalid action. You stumbled and wasted your turn.");
            }

            // Turno Nemico
            if (nemico.getVita() > 0) {
                System.out.println("\n--- Enemy Turn ---");
                nemico.attacca(giocatore);
            }
        }

        if (giocatore.getVita() <= 0) {
            System.out.println("\nYOU DIED. Your MAC Address has been extracted.");
            System.exit(0);
        } else {
            System.out.println("\n" + nemico.getNome() + " is defeated! You obtained an Elevator Button!");
            giocatore.guadagnaEsperienza(25); // Ogni nemico dà 25 XP (2 nemici = Livello su)
        }
    }
}