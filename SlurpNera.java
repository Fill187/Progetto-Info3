public class SlurpNera extends Pozione {

    public SlurpNera() {
        super("Black Slurp", "A dark swirling liquid filled with shadow energy", 0, 0, "Shadow Boost");
    }

    public void potenzia(Giocatore g) {
        g.setAttacco(g.getAttacco() + 3);
        g.setDifesa(g.getDifesa() - 1);
        System.out.println("The Black Slurp grants +3 Attack but reduces Defense by 1.");
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
