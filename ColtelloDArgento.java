public class ColtelloDArgento extends Arma {

    public ColtelloDArgento(String nome, String descrizione, int danno, int raggioAzione, int usura) {
        super("Coltello D'Argento", "Coltello simile al tagliacarte utilizzato in incontri ravvicinati", 5, 1, 0);
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
