package DispositivoElettronico;

public class ResocontoDigitale {
    public static void main(String[] args) {
        DispositivoElettronico generale = new DispositivoElettronico();
        DispositivoElettronico smartphone = new Smartphone();
        DispositivoElettronico tablet = new Tablet();
        smartphone.avvioApp("App smartphone");
    }
}
