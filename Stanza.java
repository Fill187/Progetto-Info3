import java.util.ArrayList;
import java.util.List;

public class Stanza {

    public int numeroPiano;
    public String nome;
    public String descrizione;
    public Nemico custode;
    public List<Elemento> bottino = new ArrayList<>();
    
    // Direzioni per il grafo
    public Stanza nord, sud, est, ovest;

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

    public void impostaUscite(Stanza n, Stanza s, Stanza e, Stanza o) {
        this.nord = n;
        this.sud = s;
        this.est = e;
        this.ovest = o;
    }

    public void aggiungiOggetto(Elemento e) {
        bottino.add(e);
    }

    public List<Elemento> getBottino() { return bottino; }
    public int getNumeroPiano() { return numeroPiano; }
    public String getNome() { return nome; }
    public String getDescrizione() { return descrizione; }
    public Nemico getCustode() { return custode; }
    public void setCustode(Nemico custode) { this.custode = custode; }

    public void entra() {
        System.out.println("\n--- [ Floor " + numeroPiano + " - " + nome + " ] ---");
        System.out.println(descrizione);
        if (custode != null && custode.getVita() > 0) {
            System.out.println("WARNING! " + custode.getNome() + " is here and looks dangerous!");
        }
        if (!bottino.isEmpty()) {
            System.out.print("Items in the room: ");
            for (Elemento e : bottino) {
                System.out.print("[" + e.getNome() + "] ");
            }
            System.out.println();
        }
    }
}