public class Pozione extends Elemento {

    public int effettoCura;
    public int effettoVeleno;
    public String buffStatistiche;
    public boolean consumata;

    public Pozione(String nome, String descrizione, int effettoCura, int effettoVeleno, String buffStatistiche) {
        super(nome, descrizione);
        this.effettoCura = effettoCura;
        this.effettoVeleno = effettoVeleno;
        this.buffStatistiche = buffStatistiche;
        this.consumata = false;
    }

    public int getEffettoCura() {
        return effettoCura;
    }

    public void setEffettoCura(int effettoCura) {
        this.effettoCura = effettoCura;
    }

    public int getEffettoVeleno() {
        return effettoVeleno;
    }

    public void setEffettoVeleno(int effettoVeleno) {
        this.effettoVeleno = effettoVeleno;
    }

    public String getBuffStatistiche() {
        return buffStatistiche;
    }

    public void setBuffStatistiche(String buffStatistiche) {
        this.buffStatistiche = buffStatistiche;
    }

    public boolean isConsumata() {
        return consumata;
    }

    public void usa(Giocatore g) {
        if (consumata) {
            System.out.println(getNome() + " has already been consumed.");
            return;
        }

        if (effettoCura > 0) {
            System.out.println("The potion heals " + effettoCura + " HP.");
            g.setVita(g.getVita() + effettoCura);
        }

        if (effettoVeleno > 0) {
            System.out.println("The potion deals " + effettoVeleno + " damage to the player.");
            g.setVita(g.getVita() - effettoVeleno);
        }

        if (buffStatistiche != null && !buffStatistiche.isEmpty()) {
            System.out.println("Special effect: " + buffStatistiche);
        }

        consumata = true;
        System.out.println(getNome() + " has been consumed.");
    }

    @Override
    public void raccogli() {
        System.out.println("You picked up the potion: " + getNome());
    }

    @Override
    public String stampaDescrizione() {
        return "Potion: " + getNome() + ", Description: " + getDescrizione() + ", Heal: " + effettoCura + ", Poison: " + effettoVeleno + ", Buff: " + buffStatistiche + ", Consumed: " + consumata;
    }

    @Override
    public String toString() {
        return stampaDescrizione();
    }
}
