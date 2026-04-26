public class InchiostroDellaConoscenza extends Pozione {

    public InchiostroDellaConoscenza() {
        super("Ink of Knowledge", "A mystical ink that expands the mind", 0, 0, "Intelligence Up");
    }

    public void espandi(Giocatore g) {
        System.out.println("The Ink of Knowledge expands your mind, increasing intelligence.");
    }

    @Override
    public void usa(Giocatore g) {
        super.usa(g);
        if (!consumata) return;
        espandi(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Potion: " + getNome() + ", Description: " + getDescrizione() + ", Heal: " + effettoCura + ", Poison: " + effettoVeleno + ", Buff: " + buffStatistiche + ", Consumed: " + consumata;
    }
}
