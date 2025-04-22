import java.util.ArrayList;

public class Gare {

    private ArrayList<Quai> quais;


    public Gare() {
        this.quais = new ArrayList<>();
    }

    public ArrayList<Quai> getQuais() {
        return quais;
    }

    public int getAttenteMin() {
        int temp = 0;
        for (int i=0; i< quais.size(); i++) {
            temp = quais.get(i).getAttenteMin();
        }
        return temp;
    }
}
