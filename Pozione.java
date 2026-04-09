public class Pozione extends Elemento {
    public int effettoCura;
    public int effettoVeleno;
    public String buffStatistiche;

    public Pozione(String nome, String descrizione, int effettoCura, int effettoVeleno, String buffStatistiche) {
        super(nome, descrizione);
        this.effettoCura = effettoCura;
        this.effettoVeleno = effettoVeleno;
        this.buffStatistiche = buffStatistiche;
    }

    public int getEffettoCura() {
        return effettoCura;
    }

    public void setEffettoCura(int effettoCura) {
        this.effettoCura = effettoCura;
    }

    public int getEffettoVeleno() {
        return effettoVeleno;
    }

    public void setEffettoVeleno(int effettoVeleno) {
        this.effettoVeleno = effettoVeleno;
    }

    public String getBuffStatistiche() {
        return buffStatistiche;
    }

    public void setBuffStatistiche(String buffStatistiche) {
        this.buffStatistiche = buffStatistiche;
    }

    public void raccogli() {
        System.out.println("Hai raccolto la pozione: " + nome);
    }

    @Override
    public String stampaDescrizione() {
        return "pozione: " + nome + ", " + descrizione + ", Cura: " + effettoCura + ", Veleno: " + effettoVeleno + ", Buff: " + buffStatistiche;
    }
}