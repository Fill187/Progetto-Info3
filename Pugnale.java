public class Pugnale extends Arma{

    public Pugnale(String nome, String descrizione, int danno, int raggioAzione, int usura) {
        super("Pugnale", "Molto forte negli scontri ravvicinati", 5, 1, 0 );
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
