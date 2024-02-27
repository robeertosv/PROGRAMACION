public class Camion extends Vehiculo {
    private int ejes;
    
    public Camion(String matricula, int toneladas, int ejes) {
        super(matricula, toneladas);
        this.ejes = ejes;
    }

    public int getEjes() { return this.ejes; }

    public int peaje() {
        return (this.ejes*5)+(this.getToneladas()*2);
    }
}
