public class ElisirAlMontenegro extends Pozione {

    public ElisirAlMontenegro() {
        super("Mountain Elixir", "A warm mystical brew that boosts inner strength", 10, 0, "Attack Up");
    }

    public void potenzia(Giocatore g) {
        g.setAttacco(g.getAttacco() + 2);
        System.out.println("The Mountain Elixir increases your attack by 2.");
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
