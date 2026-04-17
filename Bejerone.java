import java.util.ArrayList;
import java.util.List;

public class Bejerone extends Nemico {

    private List<String> inventarioRubato = new ArrayList<>();

    public Bejerone() {
        super("Bejerone", 85, 17, 9);
    }

    public List<String> rubaInventario(List<String> inventarioBersaglio) {
        if (inventarioBersaglio == null || inventarioBersaglio.isEmpty()) {
            System.out.println(nome + " tries to steal something... but the target's inventory is empty!");
            return new ArrayList<>();
        }

        List<String> oggettiRubati = new ArrayList<>(inventarioBersaglio);
        inventarioRubato.addAll(oggettiRubati);
        inventarioBersaglio.clear();

        System.out.println(nome + " ha rubato l'intero inventario del bersaglio!");
        System.out.println("Stolen items: " + oggettiRubati);
        System.out.println("Target inventory: empty.");
        System.out.println("Inventory of " + nome + ": " + inventarioRubato);
        return oggettiRubati;
    }

    public List<String> getInventarioRubato() {
        return inventarioRubato;
    }

    @Override
    public String stampaDescrizione() {
        return super.stampaDescrizione() + ", Ability: rubaInventario(), Stolen items: " + inventarioRubato;
    }
}
