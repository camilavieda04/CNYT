package LibreriaCNYT;

import java.util.ArrayList;

public class SimuladorCaC {
	
	LibreriaMatrizComplejo m = new LibreriaMatrizComplejo();
	

	/**
	 * Calcula el estado del sistema despues de n clicks.
	 * @param m1 matriz booleana que describe los caminos de las canicas
	 * @param m2 matriz del estado inicial
	 * @param clicks numero de clicks en los cuales se va a calcular el estado
	 * @return resp matriz de numeros complejos
	 */
	
	public MatrizComplejo program311(MatrizComplejo m1, MatrizComplejo m2, int clicks) {
		MatrizComplejo mov = m1;
		MatrizComplejo resp = null;
		for(int i=1;i<clicks;i++) {
			mov = LibreriaMatrizComplejo.multiplicacionMatrices(m1,mov);
		}
		resp = LibreriaMatrizComplejo.multiplicacionMatrices(mov, m2);
		return resp;
		
		
	}
	
	/**
	 * Metodo que simula el experimento de multiples rendijas
	 * @r Numero de Rendijas
	 * @b Numero de Blancos
	 * @return resp
	 */
	
	public MatrizComplejo program321 (int r, int b) {
		int a = 1+r+b;
		MatrizComplejo resp= new MatrizComplejo(a,a);
		for(int i=0; i<resp.getColumna();i++) {
			for(int j=0;j<resp.getFila();j++) {
				resp.addComplejo(new Complejo(0,0),i,j);
			}
		}
		float c = (float)1/r;
		Complejo probRend = new Complejo(c,0);
		for(int k=1;k<r;k++) {
			resp.addComplejo(probRend, k, 0);
		}
		
		float d = (float) Math.ceil((float) b/r);
		float e = (float) 1/d;
		Complejo probBlanco = new Complejo (e,0);
		for(int l=r+1;l<a;l++) {
			for(int m=1;m<r;m++) {
				resp.addComplejo(probBlanco, l, m);
				if((b%r)==1) {
					}
				else if((b%r)==0) {
				}
				
			}
				
		}
		Complejo f = new Complejo(1,0);
		for(int n=r+1;n<a;n++) {
			for(int o=r+1;o<a;o++) {
				if(n==o) {
					resp.addComplejo(f, n, o);
				}
			}
		}
		
		return resp;
		
		}
	
		/**
		 * Metodo que calcula las probabilidades de cada posicion del ket
		 * @param numPos numero de posiciones que tiene el ket
		 * @param ket estado inicial de la particula
		 * @return probabilidad 
		 */
	
		
		public double calcularProbParticulaxPos(int numPos, MatrizComplejo ket) {
			double probabilidad = Math.pow(ket.getMatrizCompl()[numPos][0].getModulo(), 2)/Math.pow(m.normaMatriz(ket), 2);
			return probabilidad;
		}
	
		/**
		 * Metodo que calcula la probabilidad de transitar de un ket a otro
		 * @param k1
		 * @param k2
		 * @return
		 */
		
		public Complejo probabilidadKetAKet(MatrizComplejo k1, MatrizComplejo k2) {
			return m.productoInterno(k1, k2);
		}
		
		/**
		 * Metodo que calcula el bra de un vector ket
		 * @param k
		 * @return 
		 */
		public MatrizComplejo calculaBra(MatrizComplejo k) {
			return m.adjunta(k);
		}
		
		/**
		 * Metodo que revisa que la matriz sea hermitiana y si lo es, calcula la media
		 @param obs
		 @param k
		 @return 
		 */
		public Complejo calculaValorMedio(MatrizComplejo obs, MatrizComplejo k) {
			m.adjunta(obs);
			MatrizComplejo x = m.multiplicacionMatrices(obs,k);
			this.calculaBra(x);
			return m.productoInterno(x, k);
		}
		
		/**
		 * Metodo que revisa que la matriz sea hermitiana y si lo es, calcula la varianza
		 @param obs
		 @param k
		 @return varianza
		 */
		public Complejo calculaVarianza(MatrizComplejo obs, MatrizComplejo k) {
			m.adjunta(obs);
			MatrizComplejo un = this.unitariaConUnValor(this.calculaValorMedio(obs, k), obs.getColumna(), obs.getFila());
			MatrizComplejo resp = m.restaMatrizComplejos(obs, un);
			MatrizComplejo resp1 = m.multiplicacionMatrices(resp, resp);
			MatrizComplejo resp2 = m.multiplicacionMatrices(m.adjunta(k), resp1);
			Complejo varianza = m.productoInterno(resp2, m.adjunta(k));
			
			return varianza;
		}
		
		
		/**
		 * Metodo que genera una matriz unitaria respecto a un valor ingresado
		 * @param v 
		 * @param m
		 * @param n
		 * @return MatrizU
		 */
		
		public MatrizComplejo unitariaConUnValor(Complejo v, int m, int n) {
			MatrizComplejo MatrizU = new MatrizComplejo(m,n);
			for(int i=0; i<MatrizU.getColumna();i++) {
				for(int j=0; j<MatrizU.getFila();j++) {
					if(i==j) {
						MatrizU.getMatrizCompl()[i][j]=v;
					}
					else {
						MatrizU.getMatrizCompl()[i][j]= new Complejo(0,0);
					}
				}
			}
			return MatrizU;
		}
		
		/**
		 * Metodo que calcula la dinamica del sistema, a partir de un estado inicial
		 * @param t
		 * @param k
		 * @param s
		 * @return estadoF
		 */
		public MatrizComplejo dinamicaSistema(int t, MatrizComplejo k, ArrayList<MatrizComplejo> s) {
			//LibreriaMatrizComplejo m = new LibreriaMatrizComplejo();
			MatrizComplejo estadoF = k;
			for(int i=0; i<t;i++) {
				estadoF = m.multiplicacionMatrices(s.get(i), estadoF);
			}
			return estadoF;
		}
		
		

}
