public class Veterano extends Giocatore {
    public Veterano() {
        super("Veterano", 120, 25, 15);
    }
    
    public void attaccoDevastante(Nemico nemico){
        int danno = Math.max(0, (attacco * 2) - nemico.difesa);
        nemico.vita -= danno;
        System.out.println(nome + " attacca " + nemico.nome + " causando " + danno + " danni! Vita nemica: " + nemico.vita);
    }

    public String stampaDescrizione(){
        return "veterano: " + nome + ", health: " + vita + ", Attack: " + attacco + ", Defense: " + difesa;
    }
}
