public class Giocatore {
    public String nome;
    public int vita;
    public int attacco;
    public int difesa;
    public Inventario inventario;

    public Giocatore(String nome, int vita, int attacco, int difesa) {
        this.nome = nome;
        this.vita = vita;
        this.attacco = attacco;
        this.difesa = difesa;
        this.inventario = new Inventario();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVita() {
        return vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public void attacca(Nemico nemico){
        int danno = Math.max(0, attacco - nemico.difesa);
        nemico.vita -= danno;
        System.out.println(nome + " attacks " + nemico.nome + " causing " + danno + " damage. Enemies health now: " + nemico.vita);
    }

    public void usaOggetto(Elemento elemento){
        if(elemento instanceof Pozione){
            Pozione p = (Pozione) elemento;
            vita += p.effettoCura;
            vita -= p.effettoVeleno;
            System.out.println(nome + " Uses " + p.nome + ". Health: " + vita + ". Buff: " + p.buffStatistiche);
            inventario.rimuovi(p);
        }else if(elemento instanceof Arma){
            Arma a = (Arma) elemento;
            attacco += a.danno;
            System.out.println(nome + " equippes " + a.nome + ". attaccks: " + attacco);
        }else{
            System.out.println(nome + " usa " + elemento.nome + ": " + elemento.descrizione);
        }
    }

    public String stampaDescrizione(){
        return "giocatore " + nome + ", health: " + vita + ", attack: " + attacco + ", defense: " + difesa;
    }
}
