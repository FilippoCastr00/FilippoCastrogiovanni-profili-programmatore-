package DispositivoElettronico;
import java.util.Scanner;

public class Smartphone extends DispositivoElettronico{
    //creo le variabili
    private static String[] usernames = new String[50];
    private static String[] passwords = new String[50];
    private static Scanner scanner = new Scanner(System.in);
    private static int userCount = 0;
    
    @Override
    public void avvioApp(String nomeApp) {
        System.out.println("Hai avviato l'app" + nomeApp + " " + "da smartphone");
        super.avvioApp(nomeApp);  //chiamo il costruttore della madre
        displayMenu();

    }
     
    public static void main(String[] args) {
        displayMenu();
    }
    
    //metodo che mostra il menu
    private static void displayMenu() {
        System.out.println("Benvenuto!");
        System.out.println("1. Registrati");
        System.out.println("2. Login");
        System.out.println("3. Esci");

        //creo una variabile da usare nello switch
        int choice = scanner.nextInt();
        scanner.nextLine();
 
        //creo lo switch per le scelte utente
        switch (choice) {
            case 1:
                registerUser();
                break;
            case 2:
                loginUser();
                break;
            case 3:
                System.out.println("Arrivederci!");
                break;
            default:
                System.out.println("Scelta non valida. Riprova.");
                displayMenu();
        }
    }
        //metodo che registra lo user
    private static void registerUser() {
        System.out.println("Registrazione:");
        System.out.print("Nome utente: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        //primo controllo per verificare l'esistenza dello user
        if (findUser(username) != -1) {
            System.out.println("Questo nome utente è già stato utilizzato. Riprova.");
            displayMenu();
        } else {  //inserisce gli input negli array e aggiorna il contatore userCount
            usernames[userCount] = username;
            passwords[userCount] = password;
            userCount++;
            System.out.println("Registrazione completata con successo.");
            displayMenu();
        }
    }
        //metodo login
    private static void loginUser() {
        System.out.println("Login:");
        System.out.print("Nome utente: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
     
        int index = findUser(username);
        if (index != -1 && passwords[index].equals(password)) {         
            System.out.println("Accesso effettuato con successo!");
        } else {
            System.out.println("Nome utente o password non validi. Riprova.");
        }
        displayMenu();
    }

    private static int findUser(String username) {
        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(username)) {
                return i;
            }
        }
        return -1;
    }
   
}
