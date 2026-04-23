public class Antiruggine extends Pozione {

    private boolean consumata = false;

    public Antiruggine() {
        super("Anti-Rust Potion", "Anti-rust potion that prevents corrosion from old and dangerous objects and heals 2 HP", 2, 0, "Removes rust effects");
    }

    public void rimuoviRuggine(Giocatore g) {
        System.out.println("The anti-rust potion removes all rust effects from the player.");
    }

    public void usa(Giocatore g) {
        if (consumata) {
            System.out.println(nome + " has already been consumed.");
            return;
        }

        System.out.println("You drink the " + nome + ".");

        int cura = getEffettoCura();
        int veleno = getEffettoVeleno();

        if (cura > 0) {
            g.setVita(g.getVita() + cura);
            System.out.println("You recover " + cura + " HP.");
        }

        if (veleno > 0) {
            g.setVita(g.getVita() - veleno);
            System.out.println("The potion deals " + veleno + " damage.");
        }

        rimuoviRuggine(g);

        consumata = true;
        System.out.println(nome + " has been consumed.");
    }

    public String stampaDescrizione() {
        return "Potion: " + nome + ", Description: " + descrizione + ", Heal: " + getEffettoCura() + ", Poison: " + getEffettoVeleno() + ", Effect: " + getBuffStatistiche() + ", Consumed: " + consumata;
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}
