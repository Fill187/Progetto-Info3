

public class Ventilatore extends OggettoGenerico{
    public Ventilatore(String nome, String descrizione, String utilita, boolean difensivo) {
        super("Ventilatore", "Ventilatore che se smontato diventa mortale", "Serve per allontanare gli avversari nemici", true);
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
