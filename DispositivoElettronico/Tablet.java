package DispositivoElettronico;

import java.util.Random;

public class Tablet extends DispositivoElettronico{
    private static int id = 1;

@Override
public void avvioApp(String nomeApp) {
    super.avvioApp(nomeApp); // Chiamata al metodo della classe madre
    
    float punti = generaPunti();  //genero una variabile Punti randomica
    int userId = generaUserId();  //genero una variabile userId per utente
    System.out.println("Punti: " + punti );
    System.out.println("ID user: " + userId);
    
    }
    //così genero la var random
    private float generaPunti(){
        Random random = new Random();
        return random.nextFloat();       
    }
    //genero l'ID 
    private int generaUserId(){
        return id++;
    }
    //test
    public static void main(String[] args) {
        DispositivoElettronico tablet = new Tablet();
        tablet.avvioApp("app tablet");
    }
}
