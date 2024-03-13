package DispositivoElettronico;
import java.util.ArrayList;
import java.util.Scanner;

public class Smartphone extends DispositivoElettronico{
    private String userLog;
    private ArrayList<String> usernameArr = new ArrayList<>();
    private ArrayList<String> passwordArr = new ArrayList<>();

    
    @Override
    public void avvioApp(String nomeApp) {
        System.out.println("Hai avviato: " + nomeApp + "da smartphone");
        super.avvioApp(nomeApp);  //chiamo il costruttore della madre
        simulazioneLogin();
             
    }
    //metodo che simula login
    private void simulazioneLogin(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Login:");
       System.out.println("Username: ");
       String username = scanner.nextLine();
       System.out.print("Password: ");
       String password = scanner.nextLine();
       if (Verifica(username, password)) {
           userLog=username;
           System.out.println("Login effettuato per: " + userLog);
       }else{
           System.out.println("Credenziali errate");
       }

    }
    private boolean Verifica(String username, String password) {
        // Cerco l'username fornito nella lista degli username
        int index = usernameArr.indexOf(username);
        if (index != -1) {
            return passwordArr.get(index).equals(password);
        }
        return false; // L'username fornito non è stato trovato
    }
}
