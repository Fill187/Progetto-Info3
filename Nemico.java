public class Nemico {

    public String nome;
    public int vita;
    public int difesa = 0;
    public int attacco = 0;
    public boolean stordito = false;
    public boolean sbilanciato = false;
    public int distanza = 0;

    public Nemico(String nome, int vita, int difesa, int attacco) {
        this.nome = nome;
        this.vita = vita;
        this.difesa = difesa;
        this.attacco = attacco;
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

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
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

    public void attacca(Giocatore g) {
        if (stordito) {
            System.out.println(nome + " is stunned and cannot attack.");
            return;
        }

        int danno = attacco - g.getDifesa();
        if (danno < 0) danno = 0;

        g.setVita(g.getVita() - danno);
        System.out.println(nome + " attacks and deals " + danno + " damage to the player.");
    }

    public String stampaDescrizione() {
        return "Nemico: " + nome +", Vita: " + vita +", Difesa: " + difesa + ", Attacco: " + attacco + ", Stordito: " + stordito +", Sbilanciato: " + sbilanciato + ", Distanza: " + distanza;
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}
