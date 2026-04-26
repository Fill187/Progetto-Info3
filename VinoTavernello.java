public class VinoTavernello extends Pozione {

    public VinoTavernello() {
        super("Tavern Brew", "A cheap magical brew with unpredictable effects", 5, 3, "Random Buff");
    }

    public void effettoCasuale(Giocatore g) {
        int r = (int)(Math.random() * 3);
        if (r == 0) {
            g.setAttacco(g.getAttacco() + 1);
            System.out.println("The Tavern Brew grants +1 Attack.");
        } else if (r == 1) {
            g.setDifesa(g.getDifesa() + 1);
            System.out.println("The Tavern Brew grants +1 Defense.");
        } else {
            g.setVita(g.getVita() + 2);
            System.out.println("The Tavern Brew restores 2 HP.");
        }
    }

    @Override
    public void usa(Giocatore g) {
        super.usa(g);
        if (!consumata) return;
        effettoCasuale(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Potion: " + getNome() + ", Description: " + getDescrizione() + ", Heal: " + effettoCura + ", Poison: " + effettoVeleno + ", Buff: " + buffStatistiche + ", Consumed: " + consumata;
    }
}
