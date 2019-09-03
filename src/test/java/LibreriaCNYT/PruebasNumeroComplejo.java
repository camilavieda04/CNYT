package LibreriaCNYT;


import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;


public class PruebasNumeroComplejo {
	@Test
	public void test() {
	}

	@Test
	public void SumarComplejos() {
		Complejo a = new Complejo(2,1);
		Complejo b = new Complejo(3,2);
		Complejo resp = new Complejo(5,3);
		assertEquals(Libreria.suma(a, b),resp);
	}
	
	@Test
	public void RestarComplejos() {
		Complejo a = new Complejo(-3,1);
		Complejo b = new Complejo(2,-4);
		Complejo resp = new Complejo(-5,5); 
		assertEquals(Libreria.resta(a, b),resp);
	}
	
	@Test
	public void ProductoComplejos() {
		Complejo a = new Complejo(0,1);
		Complejo b = new Complejo(0,1);
		Complejo resp =  new Complejo(-1,0);
		assertEquals(Libreria.producto(a, b),resp);
	}
	
	@Test 
	public void DividirComplejos() {
		Complejo a = new Complejo(3,2);
		Complejo b = new Complejo(1,-2);
		Complejo resp = new Complejo(-0.2,1.6);
		assertEquals(Libreria.division(a, b),resp);
	}
	
	
	@Test 
	public void moduloComplejo() {
		Complejo a = new Complejo(4,-3);
		assertEquals(5.0,a.getModulo(),1.0);
	}
	
	
	@Test
	public void faseComplejo() {
		Complejo a = new Complejo(4,-3);
		assertEquals(4,a.getFase(),5.0);
	}
	
	@Test 
	public void conjugadoComplejo() {
		Complejo b = new Complejo(4,-3);
		assertEquals(new Complejo(4.0,3.0),b.getConjugado());
	}
	
	@Test 
	public void polarAcartesiano() {
		double a = 2;
		double b = 10;
		Complejo resp = Complejo.conversionPaC(a, b);
		assertEquals(1.96,resp.getReal(),0.1);
	}
	
	@Test 
	public void cartesianoApolar() {
		Complejo a = new Complejo(4,-3);
		ArrayList<Double> ListaPolar = new ArrayList<Double>();
		ListaPolar.add(5.0);
		ListaPolar.add(-0.6435011087932844);
		assertEquals(ListaPolar,a.conversionCaP());
	}
	
	
	
	 
	
	
	
	
}
