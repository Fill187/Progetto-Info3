public class Spa extends Stanza {

    public Spa() {
        super(1, "Spa", "A relaxing spa with warm lights and scented steam floating in the air", new LaSirena());

        aggiungiOggetto(new Ciabatta());
        aggiungiOggetto(new Sdraio());
        aggiungiOggetto(new Shampoo());
    }

    @Override
    public void entra(){
        super.entra();
        System.out.println("A hypnotic melody echoes between the pools. Best not to get close to the water.");
    }
}
