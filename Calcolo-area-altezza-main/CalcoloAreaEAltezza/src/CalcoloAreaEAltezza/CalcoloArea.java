package CalcoloAreaEAltezza;

public  class CalcoloArea implements CalcoloBaseEAltezzaInterface {
	

	
	@Override
	public double calcoloArea() {
		double[] baseEAltezza = {2,3};
		double base = baseEAltezza[0];
		double altezza = baseEAltezza[1];
		double calcoloArea = (base * altezza) /2;
		return calcoloArea;
	}

}
