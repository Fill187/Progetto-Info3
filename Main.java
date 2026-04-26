import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int MAX_INVENTORY = 10;
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------");
        System.out.println("              The Lotus Exile");
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        System.out.println("Description: New York, 1984. The Lotus Exile is a place suspended in time, a facility where nothing is as it seems. The protagonist awakens in the building's lobby: the stairs have collapsed, and the only possible escape route is a helicopter on the roof. However, the elevator is unusable because its buttons are missing. Thirteen twisted entities—from the ruthless Uncle Pino to the seductive Vigliacca—guard the brass buttons needed to activate the elevator. The rooms oscillate between decadent luxury and decay, as the player must survive threats such as the sirens' songs, the bar's poisons, and the technological follies of Zen. During exploration, unusual items can be collected, such as numbing Bibles or testosterone shakes. Each floor represents a challenge against time and the protagonist's mental stability. Only by recovering the soul codes and the missing buttons will it be possible to reach the helicopter and escape. If they fail, the player's MAC address will be \"cultivated\" for eternity in the underground garden. Time is running out: the helicopter won't wait.");
        System.out.println();

       //scelta dei giocatori
        System.out.println("Available characters:");
        System.out.println();

        Atleta atleta = new Atleta();
        System.out.println("  1. " + atleta.stampaDescrizione());
        atleta.trasportaTutto();
        System.out.println();

        Infermiera infermiera = new Infermiera();
        System.out.println("  2. " + infermiera.stampaDescrizione());
        infermiera.curaCostante();
        System.out.println();

        ScienziatoPazzo scienziato = new ScienziatoPazzo();
        System.out.println("  3. " + scienziato.stampaDescrizione());
        Pozione testPozione = new ElisirAlMontenegro();
        scienziato.potenziaPozione(testPozione);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        Giocatore player = null;
        while(player == null){
            System.out.print("Choose your character (1, 2 or 3): ");
            String input = scanner.nextLine().trim();
            switch(input){
                case "1": player = new Atleta();          break;
                case "2": player = new Infermiera();      break;
                case "3": player = new ScienziatoPazzo(); break;
                default:  System.out.println("Invalid choice, try again.");
            }
        }
        scanner.close();

        System.out.println("-------------------------------------------------------------");
        System.out.println(">> Playing as: " + player.stampaDescrizione());
        System.out.println("--------------------------------------------------------------");
        System.out.println();

        Stanza reception = new Reception();
        Stanza bar = new Bar();
        Stanza ristorante = new Ristorante();
        Stanza palestra = new Palestra();
        Stanza biblioteca = new Biblioteca();
        Stanza spa = new Spa();

        Stanza corridoio = new Stanza("Dark Corridor, A long dark hallway that creaks with every step. Something moves in the shadows.");
        corridoio.aggiungiOggetto(new LanternaAOlio());
        corridoio.aggiungiOggetto(new CatenaDiFerro());
        corridoio.aggiungiOggetto(new PulsanteDiOttone());

        Stanza teatro = new Stanza("Theatre, An abandoned theatre. The stage lights are still on, illuminating empty seats.");
        teatro.aggiungiOggetto(new MascheraDellaTragedia());
        teatro.aggiungiOggetto(new Pugnale());
        teatro.aggiungiOggetto(new PulsanteDiOttone());

        Stanza suite = new Stanza("Royal Suite, A luxury suite torn apart. Broken mirrors and chaos everywhere.");
        suite.aggiungiOggetto(new AnelloNuziale());
        suite.aggiungiOggetto(new PulsanteDiOttone());

        Stanza cucina = new Stanza("Kitchen, The hotel kitchen. Smell of smoke and strange noises from within.");
        cucina.aggiungiOggetto(new PadellaDiFerro());
        cucina.aggiungiOggetto(new ZuppaIndiana());
        cucina.aggiungiOggetto(new Mannaia());
        cucina.aggiungiOggetto(new PulsanteDiOttone());

        Stanza lavanderia = new Stanza("Laundry Room, Steam, machines and darkness. Something got trapped in here long ago.");
        lavanderia.aggiungiOggetto(new Lavatrice());
        lavanderia.aggiungiOggetto(new Manganello());
        lavanderia.aggiungiOggetto(new PulsanteDiOttone());

        Stanza giardino = new Stanza("Zen Garden, A rooftop garden with rocks and raked sand. Far too quiet.");
        giardino.aggiungiOggetto(new PulsanteDiOttone());

        // stanza finale, senza chiavi e casco non si scappa
        Stanza eliporto = new Stanza("Heliport, The roof. The helicopter is right there. Wind howling. You are almost free.");
        eliporto.aggiungiOggetto(new ChiaviDellElicottero());
        eliporto.aggiungiOggetto(new CascoDaPilota());

        //sequenza stanze d'hotel
        List<Stanza> percorso = new ArrayList<>();
        percorso.add(reception);   // 0
        percorso.add(bar);         // 1
        percorso.add(ristorante);  // 2
        percorso.add(palestra);    // 3
        percorso.add(biblioteca);  // 4
        percorso.add(spa);         // 5
        percorso.add(corridoio);   // 6
        percorso.add(teatro);      // 7
        percorso.add(suite);       // 8
        percorso.add(cucina);      // 9
        percorso.add(lavanderia);  // 10
        percorso.add(giardino);    // 11
        percorso.add(eliporto);    // 12

        //creazione nemici, posizionati in stanze specifiche
        Nemico[] nemici = new Nemico[percorso.size()];
        nemici[6]  = new LaVigliacca();
        nemici[7]  = new LaSirena();
        nemici[9]  = new TheEternalDiner();
        nemici[10] = new Bejerone();
        nemici[11] = new ZioPino();
        nemici[12] = new Zen();

        
        for(int i = 0; i < percorso.size(); i++){
            Stanza stanza = percorso.get(i);
            Nemico custode = nemici[i];

            System.out.println("--------------------------------------------------------------");
            System.out.println("  ROOM " + (i + 1) + "/" + percorso.size()
                    + "  —  " + stanza.getNome().toUpperCase());
            System.out.println("---------------------------------------------------------------");
            System.out.println(stanza.getDescrizione());
            System.out.println();

            if(custode != null){
                System.out.println("!!! " + custode.getNome().toUpperCase() + " BLOCKS YOUR WAY !!!");
                System.out.println("    " + custode.stampaDescrizione());
                System.out.println();

                combatti(player, custode);
                System.out.println();

                if(player.getVita() <= 0){
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("  GAME OVER — " + player.getNome() + " has fallen.");
                    System.out.println("  Defeated in: " + stanza.getNome());
                    System.out.println("----------------------------------------------------------------");
                    return;
                }
            }

            if(player.inventario.getOggetti().size() >= MAX_INVENTORY){
                System.out.println(">> Inventory full! Dropping all items to make room...");
                player.inventario.getOggetti().clear();
                System.out.println(">> Inventory cleared.");
                System.out.println();
            }

            List<Elemento> oggetti = stanza.getOggetti();
            if(!oggetti.isEmpty()){
                System.out.println("Items found in this room:");
                for(Elemento e : new ArrayList<>(oggetti)){
                    System.out.println("  + " + e.getNome() + " — " + e.getDescrizione());
                    e.raccogli();
                    player.inventario.aggiungi(e);
                }
                System.out.println();
            }

            if(player instanceof Infermiera){
                System.out.println(">> [Infermiera] Passive healing triggers:");
                ((Infermiera) player).curaCostante();
                System.out.println();
            }

            if(stanza == eliporto){
                boolean haChiavi = false;
                boolean haCasco  = false;
                for(Elemento e : player.inventario.getOggetti()){
                    if (e instanceof ChiaviDellElicottero) haChiavi = true;
                    if (e instanceof CascoDaPilota)        haCasco  = true;
                }
                System.out.println("---------------------------------------------------------------");
                if(haChiavi && haCasco){
                    System.out.println("  YOU REACHED THE HELIPORT!");
                    System.out.println("  You grab the Helicopter Keys and put on the Pilot Helmet.");
                    System.out.println("  The rotor spins up. YOU ARE FREE!");
                    System.out.println();
                    System.out.println("  FINAL STATS: " + player.stampaDescrizione());
                    System.out.println();
                    System.out.println("  FINAL INVENTORY:");
                    player.inventario.mostra();
                    System.out.println();
                    System.out.println(" CONGRATULATIONS — YOU ESCAPED THE LOTUS ELIXE!");
                }else{
                    System.out.println("  YOU REACHED THE ROOF... but you cannot take off!");
                    if (!haChiavi) System.out.println("  MISSING: Helicopter Keys!");
                    if (!haCasco)  System.out.println("  MISSING: Pilot Helmet!");
                    System.out.println("  GAME OVER — The helicopter stays grounded.");
                }
                System.out.println("----------------------------------------------------------------");
                return;
            }

            boolean haBottone = false;
            for(Elemento e : player.inventario.getOggetti()){
                if(e instanceof PulsanteDiOttone){
                    haBottone = true;
                    break;
                }
            }

            if(haBottone){
                System.out.println(">> You press the Brass Button embedded in the wall.");
                System.out.println(">> A lock clicks. The door to the next room swings open.");
            }else{
                System.out.println(">> The door ahead is locked.");
                System.out.println(">> You search your inventory — no Brass Button found.");
                System.out.println(">> Without it, you cannot open the next door.");
                System.out.println("=============================================================");
                System.out.println("  GAME OVER — Trapped in: " + stanza.getNome());
                System.out.println("=============================================================");
                return;
            }

            System.out.println();
            System.out.println("Current status: " + player.stampaDescrizione());
            System.out.println();
        }
    }

    
    private static void combatti(Giocatore giocatore, Nemico nemico){
        int turno = 1;
        int turniIpnosi = 0;

        while(giocatore.getVita() > 0 && nemico.getVita() > 0){

            System.out.println("  --- Turn " + turno + " ---");
            System.out.println("  " + giocatore.getNome() + " HP:" + giocatore.getVita() + " ,  " + nemico.getNome() + " HP:" + nemico.getVita());

            // turno giocatore
            if(turniIpnosi > 0){
                System.out.println("  " + giocatore.getNome() + " is hypnotised and cannot act this turn!");
                turniIpnosi--;
            }else{
                Arma arma = trovaMiglioreArma(giocatore);
                if(arma != null){
                    System.out.println("  > Attacking with: " + arma.getNome());
                    arma.usa(nemico);
                }else{
                    giocatore.attacca(nemico);
                }

                if(giocatore.getVita() < 40){
                    Pozione pozione = trovaPozione(giocatore);
                    if(pozione != null){
                        System.out.println("  > Drinking potion: " + pozione.getNome());
                        pozione.usa(giocatore);
                        if(pozione.consumata){
                            giocatore.inventario.rimuovi(pozione);
                        }
                    }
                }

                if(giocatore.getVita() < 60){
                    OggettoGenerico obj = trovaOggettoUtile(giocatore);
                    if(obj != null){
                        System.out.println("  > Using item: " + obj.getNome());
                        obj.usa(giocatore, nemico);
                    }
                }
            }

            if(nemico.getVita() <= 0){
                break;
            }

            System.out.println();
            if(nemico instanceof LaVigliacca){
                // Always attacks from behind
                ((LaVigliacca) nemico).attaccoAlleSpalle(giocatore);

            }else if(nemico instanceof LaSirena){
                // Even turns: hypnotic song; odd turns: normal attack
                if(turno % 2 == 0){
                    int ipnosi = ((LaSirena) nemico).cantoIpnotico(giocatore);
                    turniIpnosi += ipnosi;
                    if(ipnosi == 0){
                        nemico.attacca(giocatore);
                    }
                }else{
                    nemico.attacca(giocatore);
                }

            }else if(nemico instanceof TheEternalDiner){
                if(turno % 2 == 0){
                    ((TheEternalDiner) nemico).furiaFame();
                }
                nemico.attacca(giocatore);

            }else if(nemico instanceof Bejerone){
                nemico.attacca(giocatore);
                if(turno % 3 == 0){
                    System.out.println("  " + nemico.getNome() + " attempts to steal from your inventory! You hold on tight.");
                }

            }else if(nemico instanceof ZioPino){

                if(turno % 3 == 0){
                    ((ZioPino) nemico).difesaAssoluta();
                }else{
                    nemico.attacca(giocatore);
                }

            }else if(nemico instanceof Zen){
                
                if(turno % 2 == 0){
                    ((Zen) nemico).lanciaMacAddress(giocatore);
                }else{
                    nemico.attacca(giocatore);
                }

            }else{
                nemico.attacca(giocatore);
            }

            turno++;
            System.out.println();

            if(turno > 40){
                System.out.println("  [Combat] Stalemate — both sides disengage.");
                break;
            }
        }

        if(nemico.getVita() <= 0){
            System.out.println(nemico.getNome() + " has been defeated!");
        }else if(giocatore.getVita() <= 0) {
            System.out.println( giocatore.getNome() + " has been defeated...");
        }
    }

    
    private static Arma trovaMiglioreArma(Giocatore g){
        for(Elemento e : g.inventario.getOggetti()){
            if(e instanceof Arma && !((Arma) e).eRotta()){
                return (Arma) e;
            } 
        }
        return null;
    }

    private static Pozione trovaPozione(Giocatore g){
        for(Elemento e : g.inventario.getOggetti()){
            if (e instanceof Pozione && !((Pozione) e).consumata){
                return (Pozione) e;
            } 
        }
        return null;
    }

    private static OggettoGenerico trovaOggettoUtile(Giocatore g){
        for(Elemento e : g.inventario.getOggetti()){
            if(e instanceof OggettoGenerico && !(e instanceof PulsanteDiOttone)){
                return (OggettoGenerico) e;
            }
        }
        return null;
    }
}
