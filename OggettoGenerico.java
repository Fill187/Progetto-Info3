public class OggettoGenerico extends Elemento {
    public String utilita;
    public boolean difensivo;

    public OggettoGenerico(String nome, String descrizione, String utilita, boolean difensivo) {
        super(nome, descrizione);
        this.utilita = utilita;
        this.difensivo = difensivo;
    }

    public String getUtilita() {
        return utilita;
    }

    public void setUtilita(String utilita) {
        this.utilita = utilita;
    }

    public boolean isDifensivo() {
        return difensivo;
    }

    public void setDifensivo(boolean difensivo) {
        this.difensivo = difensivo;
    }

    public void raccogli(){
        System.out.println("Hai raccolto l'oggetto: " + nome);
    }

    public String stampaDescrizione(){
        return "oggetto: " + nome + ", " + descrizione + ", Utilita: " + utilita + ", Difensivo: " + difensivo;
    }

}