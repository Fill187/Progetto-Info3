public class Giocatore {
    public String nome;
    public int vita;
    public int vitaMassima;
    public int attacco;
    public int difesa;
    public int esperienza;
    public int livello;
    public Inventario inventario;

    public Giocatore(String nome, int vita, int attacco, int difesa) {
        this.nome = nome;
        this.vita = vita;
        this.vitaMassima = vita;
        this.attacco = attacco;
        this.difesa = difesa;
        this.esperienza = 0;
        this.livello = 1;
        this.inventario = new Inventario();
    }

    public void guadagnaEsperienza(int exp) {
        this.esperienza += exp;
        System.out.println("You gained " + exp + " XP! [Total: " + esperienza + "]");
        if (this.esperienza >= 50) {
            livella();
        }
    }

    private void livella() {
        this.livello++;
        this.esperienza -= 50;
        this.vitaMassima = (int)(this.vitaMassima * 1.2);
        this.attacco = (int)(this.attacco * 1.2);
        this.difesa = (int)(this.difesa * 1.2);
        this.vita = this.vitaMassima; // Ripristina la salute
        System.out.println("\n*** LEVEL UP! You are now level " + livello + " ***");
        System.out.println("Your stats increased by 20% and your health has been fully restored!\n");
    }

    // Getters and Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getVita() { return vita; }
    public void setVita(int vita) { this.vita = vita; }
    public int getAttacco() { return attacco; }
    public void setAttacco(int attacco) { this.attacco = attacco; }
    public int getDifesa() { return difesa; }
    public void setDifesa(int difesa) { this.difesa = difesa; }
    public Inventario getInventario() { return inventario; }
    public void setInventario(Inventario inventario) { this.inventario = inventario; }

    void attacca(Nemico nemico) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}