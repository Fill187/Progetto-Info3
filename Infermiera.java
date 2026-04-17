public class Infermiera extends Giocatore {
    public Infermiera() {
        super("Infermiera", 100, 10, 10);
    }

    public void curaCostante(){
        vita += 15;
        System.out.println(nome + " si cura costantemente. Vita: " + vita);
    }

    public String stampaDescrizione(){
        return "infermiere: " + nome + ", health: " + vita + ", attack: " + attacco + ", defense: " + difesa;
    }
}
