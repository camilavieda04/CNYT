package LibreriaCNYT;

public class Libreria {
	
	public Libreria() {
		
	}
	
	/**
	 * Sumar dos numeros complejos
	 * @param a numero complejo a sumar
	 * @param b numero complejo a sumar
	 * @return sumComplejo resultado de la operacion realizada
	 */
	
	public static Complejo suma(Complejo a, Complejo b) {
		double sumReal = a.getReal()+b.getReal();
		double sumImag = a.getImag()+b.getImag();
		Complejo sumComplejo= new Complejo(sumReal,sumImag);
		return sumComplejo;
	}
	
	/**
	 * Restar dos numeros complejos
	 * @param a numero complejo a restar
	 * @param b numero complejo a restar
	 * @return resComplejo resultado de la operacion realizada
	 */
	
	public static Complejo resta(Complejo a, Complejo b) {
		double resReal= a.getReal()-b.getReal();
		double resImag= a.getImag()-b.getImag();
		Complejo resComplejo= new Complejo(resReal,resImag);
		return resComplejo;
	}
	
	/**
	 * Multiplicar dos numeros complejos
	 * @param a numero complejo a multiplicar
	 * @param b numero complejo a multiplicar 
	 * @return prodComplejo resultdo de la operacion realizada
	 */
	public static Complejo producto(Complejo a, Complejo b) {
		double prodReal = (a.getReal()*b.getReal())-(a.getImag()*b.getImag());
		double prodImag = (a.getReal()*b.getImag())+(a.getImag()* b.getReal());
		Complejo prodComplejo = new Complejo(prodReal,prodImag);
		return prodComplejo;
	}
	
	
	/**
	 * Dividir dos numeros complejos 
	 * @param a numero complejo a dividir
	 * @param b numero complejo a dividir
	 * @return divComplejo resultado de la operacion realizada
	 */
	
	public static Complejo division(Complejo a, Complejo b) {
		double divReal = (a.getReal()*b.getReal())+(a.getImag()*b.getImag());
		double divImag = (b.getReal()*a.getImag())-(a.getReal()*b.getImag());
		double dividendo = Math.pow(b.getReal(), 2)+ Math.pow(b.getImag(),2);
		return new Complejo(divReal/dividendo,divImag/dividendo);
	}
	
	
	
	
	
	
	
	
	
}