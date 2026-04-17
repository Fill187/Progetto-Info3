public class ZioPino extends Nemico {

    private boolean difesaAssolutaAttiva = false;

    public ZioPino() {
        super("ZioPino", 80, 15, 10);
    }

    public void difesaAssoluta(){
        difesaAssolutaAttiva = true;
        System.out.println(nome + " assume una postura difensiva impenetrabile!");
        System.out.println("Difesa Assoluta attiva: nessun danno potrà essere inflitto questo turno.");
    }

    public int subiDanno(int dannoGrezzo){
        if (difesaAssolutaAttiva) {
            difesaAssolutaAttiva = false;
            System.out.println(nome + " He blocked the attack with Absolute Defense! Damage: 0");
            return 0;
        }

        int dannoEffettivo = Math.max(0, dannoGrezzo - this.difesa);
        this.setVita(this.vita - dannoEffettivo);
        System.out.println(nome + " He took " + dannoEffettivo + " damage.");
        return dannoEffettivo;
    }

    public boolean isDifesaAssolutaAttiva() {
        return difesaAssolutaAttiva;
    }

    @Override
    public String stampaDescrizione() {
        return super.stampaDescrizione() + ", ability: difesaAssoluta(), Shield active: " + difesaAssolutaAttiva;
    }
}
