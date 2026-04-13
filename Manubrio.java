public class Manubrio extends Arma{

    public Manubrio(String nome, String descrizione, int danno, int raggioAzione, int usura) {
        super("Manubrio", "Manubrio da 5kg che si può usare siamo come spada sia come lanciabile ma è molto pesante", 4, 3, 0);
    }

    public int getDanno() {
        return danno;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getNome() {
        return nome;
    }

    public int getRaggioAzione() {
        return raggioAzione;
    }

    public int getUsura() {
        return usura;
    }
    
    public String stampaDescrizione(){
        return nome+", Descrizione: "+descrizione+", Danno: "+danno+", Raggio di Azione: "+raggioAzione+", Usura: "+usura; 
    }
}
