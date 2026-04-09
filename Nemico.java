public class Nemico {
    public String nome;
    public int vita;
    public int attacco;
    public int difesa;

    public Nemico(String nome, int vita, int attacco, int difesa) {
        this.nome = nome;
        this.vita = vita;
        this.attacco = attacco;
        this.difesa = difesa;
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



    public String stampaDescrizione(){
        return "nemico: " + nome + ", Vita: " + vita + ", Attacco: " + attacco + ", Difesa: " + difesa;
    }
}
