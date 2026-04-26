public class GiardinoZen extends Stanza {

    public GiardinoZen() {
        super(0, "Zen Garden", "A peaceful garden with raked sand and blinking server lights hidden among the stones", new Zen());

        aggiungiOggetto(new Mikrotik());
        aggiungiOggetto(new SchedaMadreRotta());
        aggiungiOggetto(new MACAddressExtraction());
    }

    @Override
    public void entra(){
        super.entra();
        System.out.println("The garden guardian cultivates MAC addresses in silence. Do not disturb him.");
    }
}
