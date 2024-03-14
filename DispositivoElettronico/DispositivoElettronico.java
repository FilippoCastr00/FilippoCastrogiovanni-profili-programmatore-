package DispositivoElettronico;


public class DispositivoElettronico {

    public void avvioApp(String nomeApp){
        System.out.println("Hai avviato l'applicazione: " + nomeApp);
       
    }
    //Test 
    public static void main(String[] args) {
        DispositivoElettronico smartphone = new Smartphone();
        smartphone.avvioApp("App smartphone");
        
    }
}
