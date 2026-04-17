public class LaSirena extends Nemico {

    private static final int DURATA_IPNOSI = 2;

    public LaSirena() {
        super("LaSirena", 65, 12, 7);
    }

    public int cantoIpnotico(Nemico bersaglio) {
        System.out.println(nome + " intones his hypnotic song towards " + bersaglio.getNome() + "...");

        int percentualeResistenza = Math.min(bersaglio.getDifesa() * 2, 80);
        int tiro = (int) (Math.random() * 100);

        if (tiro < percentualeResistenza) {
            System.out.println(bersaglio.getNome() + " resist the hypnotic singing! (resistance: " + percentualeResistenza + "%)");
            return 0;
        } else {
            System.out.println(bersaglio.getNome() + " falls under hypnosis for " + DURATA_IPNOSI + " shifts!");
            return DURATA_IPNOSI;
        }
    }

    @Override
    public String stampaDescrizione() {
        return super.stampaDescrizione() + ", Ability: cantoIpnotico()";
    }
}
