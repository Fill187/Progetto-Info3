public class Antiruggine extends Pozione{

    public Antiruggine(String nome, String descrizione, int effettoCura, int effettoVeleno, String buffStatistiche) {
        super("Pozione Antiruggine", "Pozione antiruggine per evitare di venire arrugginito da oggetti vecchi e pericolosi e cura 2", 2, 0, "Rimuove la ruggine di torno");
    }

    public String getBuffStatistiche() {
        return buffStatistiche;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getEffettoCura() {
        return effettoCura;
    }

    public int getEffettoVeleno() {
        return effettoVeleno;
    }

    public String getNome() {
        return nome;
    }
    
    public String stampaDescrizione(){
        return "Nome: "+nome+", Descrizione: "+descrizione+", Cura:"+effettoCura+", Danno: "+effettoCura+", Effetto generale: "+buffStatistiche;
    }
}
