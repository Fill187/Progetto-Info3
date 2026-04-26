public class Eliporto extends Stanza {

    public Eliporto() {
        super(3, "Heliport", "A rooftop heliport with strong winds and a helicopter ready for takeoff");

        aggiungiOggetto(new ChiaviDellElicottero());
        aggiungiOggetto(new CascoDaPilota());
        aggiungiOggetto(new KitDEmergenza());
    }

    @Override
    public void entra(){
        super.entra();
        System.out.println("The wind is fierce up here. The helicopter is right there — but do you have the keys?");
    }
}
