public abstract class Elemento {
    public String nome;
    public String descrizione;

    public Elemento(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public abstract void raccogli();
    public abstract String stampaDescrizione();
}
