package LibreriaCNYT;

import java.util.ArrayList;
import java.util.Objects;

public class Complejo {
	private double real, imaginario,modulo,fase;

	public Complejo(double r, double im) {
		real=r;
		imaginario=im;
	}
	
	/**
	 * Retorna parte real del numero
	 * @return real 
	 */
	
	public double getReal() {
		return real;
	}
	
	
	/**
	 * Cambia la parte real del numero
	 * @param n numero de tipo double por el cual se cambiara la parte real
	 */
	public void setReal(double n) {
		real=n;
	}
	

	
	/**
	 * Retorna parte imaginaria del numero
	 * @return imaginario
	 */
	
	public double getImag() {
		return imaginario;
		
	}
	
	
	/**
	 * Cambia la parte imaginaria del numero
	 * @param n numero de tipo double por el cual se cambiara la parte imaginaria
	 */
	
	public void setImag(double n) {
		imaginario=n;
	}
	
	
	/**
	 * Retorna el modulo del numero complejo
	 * @return modulo
	 */
	
	public double getModulo() {
		this.modulo = Math.sqrt((Math.pow(this.real, 2)+(Math.pow(this.imaginario, 2))));
		return modulo;
	}
	
	/**
	 * Retorna el conjugado del numero complejo 
	 * @return conjugado
	 */
	
	public Complejo getConjugado() {
		this.imaginario=this.imaginario*(-1);
		return this;
	}
	
	/**
	 * Retorna la fase del numero complejo
	 * @return fase
	 */
	
	public double getFase() {
		this.fase = Math.atan(imaginario/real);
		return fase;
		
	}
	/**
	 * Retorna la conversion del numero complejo de Cartesiano a Polar
	 * @return ListaPolar
	 */
	
	public ArrayList<Double> conversionCaP(){
		ArrayList<Double> ListaPolar = new ArrayList<Double>();
		ListaPolar.add(this.getModulo());
		ListaPolar.add(this.getFase());
		return ListaPolar;
	}
	
	/**
	 * Retorna la conversion del numero complejo de Polar a Cartesiano
	 * @return Complejo 
	 */
	public static Complejo conversionPaC(double r ,double angulo){
		//System.out.println(r);
		//System.out.println(angulo);
		double x = r*Math.cos(angulo);
		double y = r*Math.sin(angulo);
		//System.out.println(x);
		//System.out.println(y);
		return new Complejo(x,y);

	}
	
	
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null || getClass()!=o.getClass()) {
			return false;
		}
		Complejo that = (Complejo) o;
		return Double.compare(that.real,real)==0 && 
				Double.compare(that.imaginario, imaginario)==0 &&
				Double.compare(that.modulo, modulo)==0 &&
				Double.compare(that.fase, fase)==0;
		}
	
	@Override
	public int hashCode() {
		return Objects.hash(real,imaginario,modulo,fase);
	
	}


}
