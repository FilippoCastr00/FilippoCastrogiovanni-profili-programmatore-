package DispositivoElettronico;

public class ResocontoDigitale {
    public static void main(String[] args) {
        DispositivoElettronico generale = new DispositivoElettronico();
        DispositivoElettronico smartphone = new Smartphone();  // sistemare l'override method
        DispositivoElettronico tablet = new Tablet();
        generale.avvioApp("App generale");
        smartphone.avvioApp("App smartphone");
        tablet.avvioApp("App tablet");
    }
}
