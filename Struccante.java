public class Struccante extends Pozione {

    public Struccante() {
        super("Purifying Cleanser", "A gentle magical cleanser that removes negative effects", 0, 0, "Debuff Cleanse");
    }

    public void purifica(Giocatore g) {
        System.out.println("The Purifying Cleanser removes negative effects from your body.");
    }

    @Override
    public void usa(Giocatore g) {
        super.usa(g);
        if (!consumata) return;
        purifica(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Potion: " + getNome() + ", Description: " + getDescrizione() + ", Heal: " + effettoCura + ", Poison: " + effettoVeleno + ", Buff: " + buffStatistiche + ", Consumed: " + consumata;
    }
}
