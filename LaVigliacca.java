public class LaVigliacca extends Nemico {

    private static final double MOLTIPLICATORE_SPALLE = 2.0;
    private static final int PROBABILITA_SUCCESSO = 70;

    public LaVigliacca() {
        super("LaVigliacca", 60, 22, 6);
    }

    public int attaccoAlleSpalle(Nemico bersaglio) {
        System.out.println(nome + " she sneaks up on you " + bersaglio.getNome() + "...");

        int tiro = (int) (Math.random() * 100);

        if (tiro < PROBABILITA_SUCCESSO) {
            int difesaRidotta = bersaglio.getDifesa() / 2;
            int dannoEffettivo = Math.max(1, (int)(this.attacco * MOLTIPLICATORE_SPALLE) - difesaRidotta);
            bersaglio.setVita(bersaglio.getVita() - dannoEffettivo);
            System.out.println("BACK ATTACK SUCCESSFUL! " + bersaglio.getNome() + " suffers " + dannoEffettivo + " damage (damage x2, defense halved)!");
            return dannoEffettivo;
        } else {
            int dannoNormale = Math.max(0, this.attacco - bersaglio.getDifesa());
            bersaglio.setVita(bersaglio.getVita() - dannoNormale);
            System.out.println(bersaglio.getNome() + " has heard the footsteps! Normal attack: " + dannoNormale + " damage.");
            return dannoNormale;
        }
    }

    @Override
    public String stampaDescrizione() {
        return super.stampaDescrizione() + ", Ability: attaccoAlleSpalle()";
    }
}
