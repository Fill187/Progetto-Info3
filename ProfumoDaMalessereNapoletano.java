public class ProfumoDaMalessereNapoletano extends Pozione {

    public ProfumoDaMalessereNapoletano() {
        super("Neapolitan Sickness Perfume", "A cursed perfume that spreads a nauseating aura", 0, 2, "Enemy Weakness");
    }

    public void indebolisci(Nemico n) {
        n.setSbilanciato(true);
        System.out.println("The cursed perfume weakens " + n.getNome() + ", making them unstable.");
    }

    @Override
    public void usa(Giocatore g) {
        super.usa(g);
    }

    public void usa(Giocatore g, Nemico n) {
        super.usa(g);
        indebolisci(n);
    }

    @Override
    public String stampaDescrizione() {
        return "Potion: " + getNome() + ", Description: " + getDescrizione() + ", Heal: " + effettoCura + ", Poison: " + effettoVeleno + ", Buff: " + buffStatistiche + ", Consumed: " + consumata;
    }
}
