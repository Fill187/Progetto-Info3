public class TheEternalDiner extends Nemico {

    private int turniSenzaCibo = 0;
    private static final int BONUS_ATTACCO_PER_TURNO = 5;
    private static final int MAX_TURNI_FURIA = 5;
    private final int attaccoBase;

    public TheEternalDiner() {
        super("TheEternalDiner", 90, 15, 8);
        this.attaccoBase = 15;
    }

    public void furiaFame() {
        if (turniSenzaCibo < MAX_TURNI_FURIA) {
            turniSenzaCibo++;
        }
        int bonus = turniSenzaCibo * BONUS_ATTACCO_PER_TURNO;
        int attaccoPotenziato = attaccoBase + bonus;

        System.out.println(nome + " enters in Fury of Hunger! (turns without food: " + turniSenzaCibo + ")");
        System.out.println("Attacked boosted: " + attaccoPotenziato + " (base: " + attaccoBase + " + bonus: " + bonus + ")");
        this.setAttacco(attaccoPotenziato);
    }

    public void mangia() {
        turniSenzaCibo = 0;
        this.setAttacco(attaccoBase);
        System.out.println(nome + " has eaten! The fury calms down, attack reset to " + attaccoBase + ".");
    }

    @Override
    public String stampaDescrizione() {
        return super.stampaDescrizione() + ", Ability: furiaFame(), Turns without food: " + turniSenzaCibo;
    }
}
