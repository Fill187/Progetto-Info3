public class Candeggina extends Pozione {

    public Candeggina() {
        super("Pure Bleach Essence", "A powerful cleansing essence that purifies the body", 3, 0, "Debuff Cleanse");
    }

    public void purifica(Giocatore g) {
        System.out.println("The Pure Bleach Essence cleanses your body of impurities.");
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
