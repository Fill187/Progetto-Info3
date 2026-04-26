import java.util.ArrayList;
import java.util.List;

public class Stanza {

    public int numeroPiano;
    public String nome;
    public String descrizione;
    public Nemico custode;
    public List<Elemento> bottino = new ArrayList<>();

    public Stanza(int numeroPiano, String nome, String descrizione) {
        this.numeroPiano = numeroPiano;
        this.nome = nome;
        this.descrizione = descrizione;
    }

    public Stanza(int numeroPiano, String nome, String descrizione, Nemico custode) {
        this.numeroPiano = numeroPiano;
        this.nome = nome;
        this.descrizione = descrizione;
        this.custode = custode;
    }

    public void aggiungiOggetto(Elemento e) {
        bottino.add(e);
    }


    public List<Elemento> getBottino() {
        return bottino;
    }

    public int getNumeroPiano() {
        return numeroPiano;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public Nemico getCustode() {
        return custode;
    }

    public void setCustode(Nemico custode) {
        this.custode = custode;
    }

    public void entra(){
        System.out.println("You entered: " + nome + " (Floor " + numeroPiano + ")");
        System.out.println("Description: " + descrizione);
        if (custode != null) {
            System.out.println("Warning! " + custode.getNome() + " blocks your way!");
        }
        if (!bottino.isEmpty()) {
            System.out.println("Items found: " + bottino);
        }
    }

    public String stampaDescrizione(){
        return "Room: " + nome + ", Floor: " + numeroPiano + ", Description: " + descrizione + ", Guardian: " + (custode != null ? custode.getNome() : "none") + ", Loot: " + bottino;
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}