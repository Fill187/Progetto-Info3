public class Bibbia extends Arma {

    public Bibbia(String nome, String descrizione, int danno, int raggioAzione, int usura) {
        super("Bibbia", "Libro sacro che può venire lanciato oppure dato in testa", 4, 2, 0);
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
