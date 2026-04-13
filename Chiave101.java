public class Chiave101 extends OggettoGenerico {
    
    public Chiave101(String nome, String descrizione, String utilita, boolean difensivo) {
        super("Chiave della stanza N101", "Chiave per aprire la porta 101 dell'albergo", "Apre la porta della camera 101", false);
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getNome() {
        return nome;
    }

    public String getUtilita() {
        return utilita;
    }
    
    public String stampaDescrizione(){
        return "Nome: "+nome+", Descrizione: "+descrizione+", Utilita:"+utilita;
    }
}   
