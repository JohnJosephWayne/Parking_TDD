public class Place {

    int numero;
    boolean state;

    public Place(int i) {
    }

    public boolean isState() {
        return state;
    }

    public boolean setState(boolean state) {
        return this.state = state;
    }

    public int getNumero() {
        return numero;
    }

    public int setNumero(int numero) {
        return this.numero = numero;
    }

    public int createPlaceWithNumero(){
        setNumero(1);
        return numero;
    }
    public boolean createPlaceWithState(){
        setState(true);
        return state;
    }

    public void createPlaceWithStateAndNumero(){
        setNumero(1);
        setState(true);

    }


    
}
