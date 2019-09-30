package LibreriaCNYT;
public class SimuladorCaC {

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
			LibreriaMatrizComplejo m = new LibreriaMatrizComplejo();
			double probabilidad = Math.pow(ket.getMatrizCompl()[numPos][0].getModulo(), 2)/Math.pow(m.normaMatriz(ket), 2);
			return probabilidad;
		}
	
		/**
		 * Metodo que calcula la probabilidad de transitar de un ket a otro
		 * @param k1
		 * @param k2
		 * @return resp
		 */
		
		public Complejo probabilidadKetAKet(MatrizComplejo k1, MatrizComplejo k2) {
			LibreriaMatrizComplejo m = new LibreriaMatrizComplejo();
			return m.productoInterno(k1, k2);
		}
	

}
