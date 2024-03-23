package CalcoloAreaEAltezza;

import java.io.IOException;
import java.sql.SQLException;
/**@author Filippo Castrogiovanni
 * @version 1.0
 *la classe `Calcolo` si baserà sull'implementazione
 *fornita attraverso questa interfaccia per effettuare i calcoli.
 */
public class Calcolo {
	/**
	 * variabile di tipo CalcoloBaseEAltezza(interfaccia) che si chiama interfaccia
	 */
	CalcoloBaseEAltezzaInterface interfaccia;
	/**
	 *Questo è un costruttore che accetta un parametro di tipo CalcoloBaseEAltezzaInterface.
	 *Quando un oggetto Calcolo viene istanziato, si aspetta di ricevere un'implementazione
	 *di CalcoloBaseEAltezzaInterface che verrà assegnata alla variabile interfaccia.
	 * @param interfaccia
	 */
	public Calcolo(CalcoloBaseEAltezzaInterface interfaccia) {
		this.interfaccia = interfaccia;
	}
	/**
	 * @return
	 * @throws IOException
	 * @throws SQLException
	 *Questo metodo svolge il calcolo dell'area chiamando il metodo calcoloArea()
	 *dell'oggetto interfaccia. Poiché il metodo `calcoloArea()` dell'interfaccia può lanciare
	 *un'eccezione di tipo IOException, questo metodo di `Calcolo` dichiara anche `IOException`
	 *nel suo lancio.Poi, questo metodo lancia un'eccezione SQLException,
	 *perchè c'è un'interazione con un database durante il calcolo dell'area.
	 */
	public double calcoloArea() throws IOException, SQLException {
		return this.interfaccia.calcoloArea();
	}
}
