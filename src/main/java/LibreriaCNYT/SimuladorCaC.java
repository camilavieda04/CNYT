package LibreriaCNYT;



public class SimuladorCaC {
	
	/**
	 * Calcula el estado del sistema despues de n clicks.
	 * @param m1 matriz de numeros complejos 
	 * @param m2 matriz de numeros complejos
	 * @param clicks 
	 * @return resp matriz de numeros complejos
	 */
	
	public MatrizComplejo program311 (MatrizComplejo m1, MatrizComplejo m2, int clicks) {
		MatrizComplejo mov = m1;
		MatrizComplejo resp = null;
		for(int i=1;i<clicks;i++) {
			mov = LibreriaMatrizComplejo.multiplicacionMatrices(m1,mov);
		}
		resp = LibreriaMatrizComplejo.multiplicacionMatrices(mov, m2);
		return resp;
		
		
	}
	
	/**
	 * Genera la matriz de probabilidades del experimento de las rendijas
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
	
	
	

}
