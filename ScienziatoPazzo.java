public class ScienziatoPazzo extends Giocatore {
    public ScienziatoPazzo() {
        super("Scienziato Pazzo", 80, 15, 8);
    }
    
    public void potenziaPozione(Pozione p){
        p.effettoCura *= 2;
        p.effettoVeleno *= 2;
        System.out.println(nome + " potenzia " + p.nome + "! Cura: " + p.effettoCura + ", Veleno: " + p.effettoVeleno);
    }

    public String stampaDescrizione() {
        return "scienziato pazzo: " + nome + ", health: " + vita + ", attack: " + attacco + ", defense: " + difesa;
    }
}
