public class Car {
    private String immatriculation;

    public Car(String immatriculation) {
        if (immatriculation == null || immatriculation.isBlank()) {
            throw new IllegalArgumentException("L'immatriculation ne peut pas être vide.");
        }
        this.immatriculation = immatriculation;
    }

    public String getImmatriculation() {
        return immatriculation;
    }
}
