public abstract class Vehiculo {
    private int toneladas;
    private String matricula;

    public Vehiculo(String matricula, int ton) {
        this.matricula = matricula;
        this.toneladas = ton;
    }

    public int getToneladas() { return this.toneladas; }
    public String getMatricula() { return this.matricula; }
    public abstract int peaje();
    
}
