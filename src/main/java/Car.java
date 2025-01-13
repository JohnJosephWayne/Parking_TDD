public class Car {

    String immatriculation;

    public Car(String immatriculation) {
        if (immatriculation == null || immatriculation.isBlank()) {
            throw new IllegalArgumentException("L'immatriculation ne peut pas être vide.");
        }
    }

    public String getImmatriculation() {
        return immatriculation;
    }
}
