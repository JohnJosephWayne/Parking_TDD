public class Place {
    private int numero;
    private boolean occupied;
    private Car car;

    public Place(int numero) {
        this.numero = numero;
        this.occupied = false;
        this.car = null;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Car getCar() {
        return car;
    }

    public void setFullPlace(Car car) {
        this.car = car;
        this.occupied = true;
    }

    public void setEmptyPlace() {
        this.car = null;
        this.occupied = false;
    }

    public int getNumero() {
        return numero;
    }
}
