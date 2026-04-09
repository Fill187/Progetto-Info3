import java.util.ArrayList;

public class Inventario {
    private ArrayList<Elemento> oggetti = new ArrayList<>();

    public void aggiungi(Elemento e) {
        oggetti.add(e);
        System.out.println(e.nome + " aggiunto all'inventario.");
    }

    public void rimuovi(Elemento e) {
        oggetti.remove(e);
    }

    public ArrayList<Elemento> getOggetti() {
        return oggetti;
    }

    public void mostra(){
        if(oggetti.isEmpty()){
            System.out.println("Inventario vuoto.");
        }else{
            for(Elemento e : oggetti){
                System.out.println(e.stampaDescrizione());
            }
        }
    }
}
