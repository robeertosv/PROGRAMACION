public class Autobus extends Vehiculo{
    private int pasajeros;

    public Autobus(String matricula, int ton, int pasajeros) {
        super(matricula, ton);
        this.pasajeros = pasajeros;
    }
    public int getPasajeros() { return this.pasajeros; }
    public int peaje() {
        return this.pasajeros + (this.getToneladas()*5);
    }
}
