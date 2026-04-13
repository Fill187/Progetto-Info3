public class BottigliaRotta extends Arma{

    public BottigliaRotta(String nome, String descrizione, int danno, int raggioAzione, int usura) {
        super("Bottiglia Rotta", "Viene lanciata contro gli avversari", 4, 5, 0);
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
