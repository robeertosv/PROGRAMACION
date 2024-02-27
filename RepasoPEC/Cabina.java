public class Cabina {
    private int id;
    private Agente agente;
    private int recibosCobrados; // Cantidad de dinero recaudado
    private int vehiculosCobrados; //Cantidad de vehiculos
    private static int vehiculosTOT = 0;

    public Cabina(int id, Agente agente) {
        this.id = id;
        this.agente = agente;
        this.recibosCobrados = 0;
        this.vehiculosCobrados = 0;
    }

    public int getID() { return this.id; }
    public Agente getAgente() { return this.agente; }
    public void setAgente(Agente agente) { this.agente = agente; }
    public int getRecibosCobrados() { return this.recibosCobrados; }
    public int getVehiculosCobrados() { return this.vehiculosCobrados; }
    public static int getTOT() { return vehiculosTOT; }

    public void cobro(Camion camion) {
        System.out.println("Total: "+camion.peaje()+"$\nMatricula: "+camion.getMatricula()+"\nPeso: "+camion.getToneladas()+"TON\nEjes: "+camion.getEjes());
        recibosCobrados += camion.peaje();
        vehiculosCobrados++;
        vehiculosTOT++;
    }

    public void cobro(Autobus bus) {
        System.out.println("Total: "+bus.peaje()+"$\nMatricula: "+bus.getMatricula()+"\nPeso: "+bus.getToneladas()+"TON\nPasajeros: "+bus.getPasajeros());
        recibosCobrados += bus.peaje();
        vehiculosCobrados++;
        vehiculosTOT++;

    }
}
