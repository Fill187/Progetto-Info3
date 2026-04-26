public class ZuppaIndiana extends Pozione {

    public ZuppaIndiana() {
        super("Indian Soup", "A spicy magical soup that warms the spirit", 6, 0, "Attack Up");
    }

    public void riscalda(Giocatore g) {
        g.setAttacco(g.getAttacco() + 1);
        System.out.println("The Indian Soup warms your spirit, granting +1 Attack.");
    }

    @Override
    public void usa(Giocatore g) {
        super.usa(g);
        if (!consumata) return;
        riscalda(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Potion: " + getNome() + ", Description: " + getDescrizione() + ", Heal: " + effettoCura + ", Poison: " + effettoVeleno + ", Buff: " + buffStatistiche + ", Consumed: " + consumata;
    }
}
