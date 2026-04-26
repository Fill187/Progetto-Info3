public class Atleta extends Giocatore {

    public Atleta() {
        super("Atleta", 110, 20, 12);
    }

    public void trasportaTutto(){
        System.out.println(nome + " trasporta tutto senza penalita di peso. Inventario:");
        inventario.mostra();
    }

    public String stampaDescrizione() {
        return "atleta: " + nome + ", health: " + vita + ", attack: " + attacco + ", defense: " + difesa;
    }
    
}
