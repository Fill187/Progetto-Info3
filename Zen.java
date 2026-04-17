public class Zen extends Nemico {

    public Zen() {
        super("Zen", 70, 20, 5);
    }

    public void lanciaMacAddress(Nemico bersaglio) {
        System.out.println(nome + " lancia un attacco MAC contro " + bersaglio.getNome() + "!");
        int difesaOriginale = bersaglio.getDifesa();
        bersaglio.setDifesa(0);
        System.out.println("The defense of " + bersaglio.getNome() + " It has been temporarily reset!");

        int danno = this.attacco;
        bersaglio.setVita(bersaglio.getVita() - danno);
        System.out.println(bersaglio.getNome() + " he took " + danno + " damage!");

        bersaglio.setDifesa(difesaOriginale);
        System.out.println("The defense of " + bersaglio.getNome() + " has been restored to " + difesaOriginale + ".");
    }

    @Override
    public String stampaDescrizione() {
        return super.stampaDescrizione() + ", Ability: lanciaMacAddress()";
    }
}
