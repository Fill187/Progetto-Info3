public class Infermiera extends Giocatore {
    public Infermiera(String nome) {
        super(nome, 100, 10, 10);
    }

    public void curaCostante(){
        vita += 15;
        System.out.println(nome + " si cura costantemente. Vita: " + vita);
    }

    public String stampaDescrizione(){
        return "infermiere " + nome + ", Vita: " + vita + ", Attacco: " + attacco + ", Difesa: " + difesa;
    }
}
