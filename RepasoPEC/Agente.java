public class Agente {
    private String DNI;
    private String name;

    public Agente(String name, String DNI) { this.DNI = DNI; this.name = name; }
    public String getName() { return this.name; }
    public String getDNI() { return this.DNI; }
}
