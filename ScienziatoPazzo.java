public class ScienziatoPazzo extends Giocatore {
    public ScienziatoPazzo(String nome) {
        super(nome, 80, 15, 8);
    }
    
    public void potenziaPozione(Pozione p){
        p.effettoCura *= 2;
        p.effettoVeleno *= 2;
        System.out.println(nome + " potenzia " + p.nome + "! Cura: " + p.effettoCura + ", Veleno: " + p.effettoVeleno);
    }

    public String stampaDescrizione() {
        return "scienziato pazzo " + nome + ", Vita: " + vita + ", Attacco: " + attacco + ", Difesa: " + difesa;
    }
}
