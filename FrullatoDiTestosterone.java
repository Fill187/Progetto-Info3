public class FrullatoDiTestosterone extends Pozione {

    public FrullatoDiTestosterone() {
        super("Power Shake", "A magical shake that boosts physical strength", 0, 0, "Attack Up");
    }

    public void potenzia(Giocatore g) {
        g.setAttacco(g.getAttacco() + 2);
        g.setDifesa(g.getDifesa() + 1);
        System.out.println("The Power Shake grants +2 Attack and +1 Defense.");
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
