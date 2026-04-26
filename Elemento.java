public class Elemento {

    public String nome;
    public String descrizione;

    public Elemento(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void usa(Giocatore g, Nemico n) {
        // base empty behavior
    }

    public void raccogli() {
        System.out.println("You picked up: " + nome);
    }

    public String stampaDescrizione() {
        return nome + ", Description: " + descrizione;
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}
