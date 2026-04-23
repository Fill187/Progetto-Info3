public class Nemico {

    public String nome;
    public int vita;
    public boolean stordito = false;
    public boolean sbilanciato = false;
    public int distanza = 0;

    public Nemico(String nome, int vita) {
        this.nome = nome;
        this.vita = vita;
    }

    public String getNome() {
        return nome;
    }

    public int getVita() {
        return vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public boolean isStordito() {
        return stordito;
    }

    public void setStordito(boolean stordito) {
        this.stordito = stordito;
    }

    public boolean isSbilanciato() {
        return sbilanciato;
    }

    public void setSbilanciato(boolean sbilanciato) {
        this.sbilanciato = sbilanciato;
    }

    public int getDistanza() {
        return distanza;
    }

    public void setDistanza(int distanza) {
        this.distanza = distanza;
    }

    public String stampaDescrizione() {
        return "Nemico: " + nome + ", Vita: " + vita + ", Stordito: " + stordito + ", Sbilanciato: " + sbilanciato + ", Distanza: " + distanza;
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}
