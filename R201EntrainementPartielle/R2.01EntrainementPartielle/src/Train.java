import java.util.ArrayList;

public class Train {

    private int numero;
    private int attenteMin;

    private ArrayList<Wagon> wagons;

    public Train(int numero, int attenteMin) {
        this.numero = numero;
        this.attenteMin = attenteMin;
        this.wagons = new ArrayList<>();
    }

    public Train(int numero) {
        this.numero = numero;
        this.wagons = new ArrayList<>();
    }

    public void addWagon(Wagon wagon) {
        wagons.add(wagon);
    }

    public int getNumero() {
        return numero;
    }

    public int getAttenteMin() {
        return attenteMin;
    }

    public int getNombrePassagerMax() {
        int temp =0;
        for (int i=0; i<wagons.size(); i++) {
            temp = temp+wagons.get(i).getNombrePassagerMax();
        }
        return temp;
    }
    public int getNombreVeloMax() {
        int temp =0;
        for (int i=0; i<wagons.size(); i++) {
            temp = temp+wagons.get(i).getNombreVeloMax();
        }
        return temp;
    }
}

