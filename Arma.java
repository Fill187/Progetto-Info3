public class Arma extends Elemento {

    public int danno;
    public int raggioAzione;
    public int usura;
    private int usuraMassima = 100;

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

    public boolean eRotta() {
        return usura >= usuraMassima;
    }

    public void usa(Nemico n) {
        if (eRotta()) {
            System.out.println(nome + " It is broken, so it can't be used.");
            return;
        }

        n.setVita(n.getVita() - danno);
        usura += 10;

        if (eRotta()) {
            System.out.println(nome + "It broke");
        }
    }

    public void ripara(int quantita) {
        usura -= quantita;
        if (usura < 0) usura = 0;
    }

    public void raccogli() {
        System.out.println("You picked up a weapon: " + nome);
    }

    public String stampaDescrizione() {
        return "Weapon: " + nome + ", " + descrizione + ", Damage: " + danno + ", Range: " + raggioAzione + ", Wear: " + usura;
    }
}
