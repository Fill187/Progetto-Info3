public class Lavanderia extends Stanza {

    public Lavanderia() {
        super(-1, "Laundry", "A humid laundry room with the constant noise of spinning washing machines", new Bejerone());

        aggiungiOggetto(new CatenaDiFerro());
        aggiungiOggetto(new Lavatrice());
        aggiungiOggetto(new Candeggina());
    }

    @Override
    public void entra(){
        super.entra();
        System.out.println("A huge figure eyes you greedily. Hold tight to your inventory.");
    }
}
