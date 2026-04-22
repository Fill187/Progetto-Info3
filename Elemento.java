public abstract class Elemento {
    public String nome;
    public String descrizione;

    public Elemento(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getNome() {
        return nome;
    }

    public abstract void raccogli();

    public abstract String stampaDescrizione();
}
