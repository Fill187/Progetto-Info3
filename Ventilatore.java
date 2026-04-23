public class Ventilatore extends OggettoGenerico {

    private boolean smontato = false;

    public Ventilatore() {
        super("Fan", "A portable fan that, when dismantled, becomes surprisingly dangerous", "Used to push enemies away", true);
    }

    public void smonta() {
        if (!smontato) {
            smontato = true;
            System.out.println("You dismantle the Fan. The blades become sharp and deadly.");
        } else {
            System.out.println("The Fan is already dismantled.");
        }
    }

    public void usa(Giocatore g, Nemico n) {
        if (!smontato) {
            System.out.println("You use the Fan to push " + n.getNome() + " backwards.");
            n.setDistanza(n.getDistanza() + 2);
        } else {
            System.out.println("You slash " + n.getNome() + " with the dismantled Fan blades dealing 3 damage.");
            n.setVita(n.getVita() - 3);
        }
    }

    @Override
    public String stampaDescrizione() {
        return "Name: " + getNome() + ", Description: " + getDescrizione() + ", Utility: " + getUtilita() + ", Dismantled: " + smontato;
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}
