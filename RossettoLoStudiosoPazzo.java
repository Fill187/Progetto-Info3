public class RossettoLoStudiosoPazzo extends Nemico {

    private boolean previsioneAttiva = false;
    private static final double RIDUZIONE_DANNO = 0.5;

    public RossettoLoStudiosoPazzo() {
        super("RossettoLoStudiosoPazzo", 75, 18, 12);
    }

    public void prevediMosse() {
        previsioneAttiva = true;
        System.out.println(nome + " Study your opponent's moves... Prediction is active!");
        System.out.println("The next attack taken will be reduced by 50%.");
    }

    public int subiDanno(int dannoGrezzo) {
        int dannoEffettivo = Math.max(0, dannoGrezzo - this.difesa);

        if (previsioneAttiva) {
            dannoEffettivo = (int) (dannoEffettivo * RIDUZIONE_DANNO);
            previsioneAttiva = false;
            System.out.println(nome + " He had foreseen the attack! Damage halved: " + dannoEffettivo);
        } else {
            System.out.println(nome + " suffers " + dannoEffettivo + " damage.");
        }

        this.setVita(this.vita - dannoEffettivo);
        return dannoEffettivo;
    }

    public boolean isPrevisioneAttiva() {
        return previsioneAttiva;
    }

    @Override
    public String stampaDescrizione() {
        return super.stampaDescrizione() + ", Ability: prevediMosse() | Prediction active: " + previsioneAttiva;
    }
}
