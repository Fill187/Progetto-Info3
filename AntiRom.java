public class AntiRom extends Pozione {

    public AntiRom() {
        super("Anti-ROM Serum", "A stabilizing serum that clears mental interference", 0, 0, "Mind Cleanse");
    }

    public void purifica(Giocatore g) {
        System.out.println("The Anti-ROM Serum clears your mind from interference.");
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
