package CalcoloAreaEAltezza;

import java.io.IOException;
import java.sql.SQLException;
/**
 * @author Filippo Castrogiovanni
 * @version 1.0
 * Interfaccia che contiene un solo metodo calcolaArea()
 */
public interface CalcoloBaseEAltezzaInterface {
	/**
	 * 
	 * @return
	 * @throws IOException
	 * @throws SQLException
	 */
	double calcoloArea() throws IOException, SQLException;
}
