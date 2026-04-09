public class Arma extends Elemento {
    public int danno;
    public int raggioAzione;
    public int usura;

    public Arma(String nome, String descrizione, int danno, int raggioAzione, int usura) {
        super(nome, descrizione);
        this.danno = danno;
        this.raggioAzione = raggioAzione;
        this.usura = usura;
    }

    public int getDanno() {
        return danno;
    }

    public void setDanno(int danno) {
        this.danno = danno;
    }

    public int getRaggioAzione() {
        return raggioAzione;
    }

    public void setRaggioAzione(int raggioAzione) {
        this.raggioAzione = raggioAzione;
    }

    public int getUsura() {
        return usura;
    }

    public void setUsura(int usura) {
        this.usura = usura;
    }

    public void raccogli(){
        System.out.println("Hai raccolto l'arma: " + nome);
    }

    public String stampaDescrizione(){
        return "arma: " + nome + ", " + descrizione + ", Danno: " + danno + ", Raggio: " + raggioAzione + ", Usura: " + usura;
    }
}
