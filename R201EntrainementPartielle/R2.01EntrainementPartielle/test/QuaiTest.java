import static org.junit.jupiter.api.Assertions.*;

class QuaiTest {

    @org.junit.jupiter.api.Test
    void aucunTrainEnQuai() {
        Quai quai = new Quai("quai");
        assertTrue(quai.aucunTrainEnQuai());
    }

    @org.junit.jupiter.api.Test
    void unSeulTrainEnQuai() {
        Quai quai = new Quai("quai");
        quai.setTrainDroite(new Train(123));
        assertTrue(quai.unSeulTrainEnQuai());
    }

    @org.junit.jupiter.api.Test
    void deuxTrainEnQuai() {
        Quai quai = new Quai("quai");
        quai.setTrainDroite(new Train(123));
        quai.setTrainGauche(new Train(456));
        assertTrue(quai.deuxTrainEnQuai());
    }

    @org.junit.jupiter.api.Test
    void getTrain() {
        Quai quai = new Quai("quai");


        assertDoesNotThrow(quai::getTrain, "rentre chez toi stp bougnoule");
    }
}