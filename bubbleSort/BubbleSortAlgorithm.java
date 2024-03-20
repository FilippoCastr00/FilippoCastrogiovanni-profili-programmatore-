/**
 * 
 */
package bubbleSort;

/**
 * @version 1.0
 */
public class BubbleSortAlgorithm {

	/**
	 * @param args sono gli argomenti che passa il metodo main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int numeri [] = {5,2,4,1,3};
     bubbleSort(numeri);
     for(int num:numeri) {
    	 System.out.print(num);
     }
     
	}
	/**
	 * 
	 * @param numeri &#233; un array di interi
	 * @since 1.0
	 * Questo metodo consiste in 1 ciclo e 1 ciclo annidato che sortano gli elementi dell'array
	 * e un if che rispettata la condizione sostituisce a due alla volta gli elementi dell'array
	 * quando la condizione non verrà rispettata significa che l'array &#233; stato ordinato. 
	 */
	public static void bubbleSort(int numeri[]) {
		for(int i = 0; i < numeri.length - 1; i++) {
			for(int j = 0; j < numeri.length - i - 1; j++) {
				if(numeri[j] > numeri[j + 1]) {
					/**
					 * variabile sostituto con valore numeri[j]
					 */
					int sostituto = numeri[j];
					/**
					 * se numeri[j] è uguale a numeri[j + 1] effettuo lo scambio
					 */
					numeri[j] = numeri[j + 1];
					/**
					 * inserisco numeri[j + 1] nella variabile sostituto per lo scambio di posizione
					 */
					numeri[j + 1] = sostituto;
				}				
			}
		}
	}
}
