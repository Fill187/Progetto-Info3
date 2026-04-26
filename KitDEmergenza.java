public class KitDEmergenza extends Pozione {

    public KitDEmergenza() {
        super("Emergency Kit", "A fast‑acting restorative mixture", 8, 0, "Defense Up");
    }

    public void potenzia(Giocatore g) {
        g.setDifesa(g.getDifesa() + 2);
        System.out.println("The Emergency Kit boosts your defense by 2.");
    }

    @Override
    public void usa(Giocatore g) {
        super.usa(g);
        if (!consumata) return;
        potenzia(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Potion: " + getNome() + ", Description: " + getDescrizione() + ", Heal: " + effettoCura + ", Poison: " + effettoVeleno + ", Buff: " + buffStatistiche + ", Consumed: " + consumata;
    }
}
