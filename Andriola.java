public class Andriola extends Nemico {

    public Andriola() {
        super("L'Andriola", 110, 20, 12);
    }

    public void caricaDiFerro(Giocatore bersaglio){
        int danno = Math.max(0, (this.attacco * 2) - bersaglio.getDifesa());
        bersaglio.setVita(bersaglio.getVita() - danno);
        System.out.println(nome + " charges with full force! " + bersaglio.getNome() + " takes " + danno + " damage!");
    }

    @Override
    public String stampaDescrizione() {
        return super.stampaDescrizione() + ", Ability: caricaDiFerro()";
    }
}
