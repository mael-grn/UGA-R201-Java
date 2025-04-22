public class Quai {

    private String libelle;

    private Train trainDroite;

    private Train trainGauche;

    public Quai(String libelle) {
        this.libelle = libelle;
    }


    public String getLibelle() {
        return libelle;
    }

    public Train getTrainDroite() {
        return trainDroite;
    }

    public Train getTrainGauche() {
        return trainGauche;
    }

    public Train getTrain() throws RentreChezToiException {
        if (trainDroite != null & trainGauche != null) {
            throw new RentreChezToiException();
        } else if (trainDroite != null) {
            return trainDroite;
        } else if (trainGauche != null) {
            return trainGauche;
        } else {
            throw new RentreChezToiException();
        }
    }

    public int getAttenteMin() {
        int temp=0;
        if (trainGauche !=  null) {
            temp = temp+trainGauche.getAttenteMin();
        }
        if (trainDroite != null) {
            temp = temp+trainDroite.getAttenteMin();
        }
        return temp;
    }

    public void setTrainDroite(Train trainDroite) {
        this.trainDroite = trainDroite;
    }

    public void setTrainGauche(Train trainGauche) {
        this.trainGauche = trainGauche;
    }
    public void setTrain(Train train) {
        trainDroite = train;
        trainGauche = train;
    }
    public boolean aucunTrainEnQuai() {
        return trainDroite == null & trainGauche == null;
    }
    public boolean unSeulTrainEnQuai() {
        return (trainDroite == null & trainGauche!= null) | (trainDroite != null & trainGauche == null);
    }
    public boolean deuxTrainEnQuai() {
        return trainDroite != null & trainGauche!= null;
    }
}
