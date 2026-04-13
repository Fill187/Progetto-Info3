public class Manganello extends Arma {

    public Manganello(String nome, String descrizione, int danno, int raggioAzione, int usura) {
        super("Manganello", "Arma molto famosa nella polizia utilizzabile negli scontri ravvicinati", 6, 1, 0);
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
