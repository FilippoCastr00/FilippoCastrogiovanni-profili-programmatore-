/**
 * 
 */
package CalcoloAreaEAltezza;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Filippo Castrogiocanni
 * @version 1.0
 * Definizione della classe calcolaDaMySql che implementa
 * l'interfaccia CalcoloBaseEAltezzaInterface
 */
public class calcolaDaMySql implements CalcoloBaseEAltezzaInterface {
	private Connection connection; // Connessione al database
	private String url="jdbc:mysql://localhost:3306/experis"; // URL del database MySQL
    private String user = "root"; // Nome utente del database
    private String password="MyNewPass"; // Password del database
    public Statement stmt; // Dichiarazione di un oggetto Statement per eseguire query SQL
    
    
    // Costruttore della classe che gestisce la connessione al database
	public calcolaDaMySql() throws SQLException {
		// Connessione al database
		this.connection=DriverManager.getConnection(url, user, password);
		
	}

	@Override
	/**
	 * Implementazione del metodo calcoloArea() definito nell'interfaccia
	 */
	public double calcoloArea() throws IOException, SQLException{
		this.stmt= connection.createStatement();
		// Esecuzione della query SQL per ottenere i dati del triangolo
		ResultSet rs = this.stmt.executeQuery("SELECT * FROM triangolo");
		rs.next();
		// Recupero del valore della base del triangolo dal risultato della query
		int base = rs.getInt("base");
		// Recupero del valore della base del triangolo dal risultato della query
		int altezza = rs.getInt("altezza");
		// Calcolo dell'area del triangolo utilizzando la formula base*altezza/2
		return (base*altezza)/2;
		
	}

}
