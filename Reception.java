public class Reception extends Stanza {

    public Reception() {
        super(0, "Reception", "The hotel reception area with a desk and scattered items");

        aggiungiOggetto(new TagliaCarte());
        aggiungiOggetto(new Ventilatore());
        aggiungiOggetto(new Antiruggine());
        aggiungiOggetto(new AntiRom());
    }

    @Override
    public void entra(){
        super.entra();
        System.out.println("The reception desk is deserted, but something glimmers on the floor.");
    }
}
