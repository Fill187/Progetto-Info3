public class CorridoioScuro extends Stanza {

    public CorridoioScuro() {
        super(-1, "Dark Corridor", "A narrow dark corridor with dripping walls and distant unsettling noises");

        aggiungiOggetto(new TuboAffilato());
        aggiungiOggetto(new LanternaAOlio());
        aggiungiOggetto(new SlurpNera());
    }

    @Override
    public void entra() {
        super.entra();
        System.out.println("Darkness is almost total. Light the lantern before moving forward.");
    }
}
