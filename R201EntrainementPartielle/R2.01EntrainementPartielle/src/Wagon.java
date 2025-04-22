public class Wagon {

    private int nombrePassagerMax;
    private int nombreVeloMax;

    public Wagon(int nombrePassagerMax, int nombreVeloMax) {
        this.nombrePassagerMax = nombrePassagerMax;
        this.nombreVeloMax = nombreVeloMax;
    }

    public Wagon(int nombrePassagerMax) {
        this.nombrePassagerMax = nombrePassagerMax;
    }

    public int getNombrePassagerMax() {
        return nombrePassagerMax;
    }

    public int getNombreVeloMax() {
        return nombreVeloMax;
    }
}
