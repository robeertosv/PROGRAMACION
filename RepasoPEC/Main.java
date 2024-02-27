public class Main {
    public static void main(String[] args) {
        Camion truck = new Camion("7372JGB", 20, 4);
        Autobus citaro = new Autobus("1234KYS", 10, 70);
        Agente agent = new Agente("Roberto Seco", "09854422A");
        Agente agente = new Agente("Marcos González", "09445588W");
        Cabina cabina1 = new Cabina(0, agent);
        Cabina cabina2 = new Cabina(1, agent);
        cabina2.setAgente(agente);

        cabina1.cobro(citaro);
        cabina2.cobro(truck);

        cabina1.getVehiculosCobrados();
        cabina1.getRecibosCobrados();

        cabina2.getVehiculosCobrados();
        cabina2.getRecibosCobrados();

        System.out.println(Cabina.getTOT());
    }
}
