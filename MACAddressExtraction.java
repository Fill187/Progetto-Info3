public class MACAddressExtraction extends Pozione {

    public MACAddressExtraction() {
        super("MAC Extraction Serum", "A digital alchemical serum that reveals hidden data", 0, 0, "Enemy Scan");
    }

    public void scansiona(Nemico n) {
        System.out.println("The MAC Extraction Serum reveals hidden data about " + n.getNome() + ".");
    }

    @Override
    public void usa(Giocatore g) {
        super.usa(g);
    }

    public void usa(Giocatore g, Nemico n) {
        super.usa(g);
        scansiona(n);
    }

    @Override
    public String stampaDescrizione() {
        return "Potion: " + getNome() + ", Description: " + getDescrizione() + ", Heal: " + effettoCura + ", Poison: " + effettoVeleno + ", Buff: " + buffStatistiche + ", Consumed: " + consumata;
    }
}
