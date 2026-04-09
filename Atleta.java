public class Atleta extends Giocatore {

    public Atleta(String nome) {
        super(nome, 110, 20, 12);
    }

    public void trasportaTutto(){
        System.out.println(nome + " trasporta tutto senza penalita di peso. Inventario:");
        inventario.mostra();
    }

    @Override
    public String stampaDescrizione() {
        return "atleta " + nome + ", Vita: " + vita + ", Attacco: " + attacco + ", Difesa: " + difesa;
    }
    
}
