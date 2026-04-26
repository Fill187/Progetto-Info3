public class Shampoo extends Pozione {

    public Shampoo() {
        super("Magic Shampoo", "A fragrant shampoo that refreshes the mind", 0, 0, "Focus Up");
    }

    public void rinfresca(Giocatore g) {
        System.out.println("The Magic Shampoo refreshes your mind, increasing focus.");
    }

    @Override
    public void usa(Giocatore g) {
        super.usa(g);
        if (!consumata) return;
        rinfresca(g);
    }

    @Override
    public String stampaDescrizione() {
        return "Potion: " + getNome() + ", Description: " + getDescrizione() + ", Heal: " + effettoCura + ", Poison: " + effettoVeleno + ", Buff: " + buffStatistiche + ", Consumed: " + consumata;
    }
}
