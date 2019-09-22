package LibreriaCNYT;



public class LibreriaMatrizComplejo {
	private Libreria matriz = new Libreria();
	
	
	/**
	 * Sumar dos vectores de numeros complejos
	 * @param v1 vector de numeros complejos a sumar
	 * @param v2 vector de numeros complejos a sumar
	 * @return sumvectores resultado de la operacion realizada
	 */
	
	public static MatrizComplejo sumaVectores(MatrizComplejo v1, MatrizComplejo v2) {
			MatrizComplejo sumvectores = new MatrizComplejo(v1.getColumna(),v1.getFila());
			for (int i=0; i<v1.getColumna();i++) {
					Complejo resp = Libreria.suma(v1.getVectorCompl()[i], v2.getVectorCompl()[i]);
					sumvectores.getVectorCompl()[i]=resp;
				}
			return sumvectores;
			
		}
			
	
	/**
	 * Restar dos vectores de numeros complejos
	 * @param v1 vector de numeros complejos a restar
	 * @param v2 vector de numeros complejos a restst
	 * @return resvectores resultado de la operacion realizada
	 */
	
	public static MatrizComplejo restaVectores(MatrizComplejo v1, MatrizComplejo v2) {
			MatrizComplejo resvectores = new MatrizComplejo(v1.getColumna(),v1.getFila());
			for (int i=0; i<v1.getColumna();i++) {
					Complejo resp = Libreria.resta(v1.getVectorCompl()[i], v2.getVectorCompl()[i]);
					resvectores.getVectorCompl()[i]=resp;
				}
			return resvectores;
			
		}
	
	
	/**
	 * Multiplicacion de un escalar por un vector complejo
	 * @param v1 vector de numeros complejos a multiplicar
	 * @param a numero complejo a multiplicar
	 * @return multev resultado de la operacion realizada
	 */

	public static MatrizComplejo productoEscalarVector(MatrizComplejo v1, Complejo a) {
		MatrizComplejo multev = new MatrizComplejo(v1.getColumna(),v1.getFila());
		for (int i=0; i<v1.getColumna();i++) {
			Complejo resp= Libreria.producto(v1.getVectorCompl()[i], a);
			multev.getVectorCompl()[i]=resp;
		}
		return multev;
	}
	

	/**
	 * Matriz identidad
	 * @param m1 Matriz de numeros complejos
	 * @return matrizI
	 */
	public MatrizComplejo MatrizIdentidad(MatrizComplejo m1) {
		MatrizComplejo matrizI=new MatrizComplejo(m1.getColumna(),m1.getFila());
		for(int i=0;i<m1.getColumna();i++) {
			for(int j=0;j<m1.getFila();j++) {
				if(i==j) {
					matrizI.getMatrizCompl()[i][j]=new Complejo(1,0);
				}
				else {
					matrizI.getMatrizCompl()[i][j]=new Complejo(1,0);
				}
			}
		}
		return matrizI;
	}
	
	
	
	/**
	 * Sumar dos matrices de numeros complejos
	 * @param a Matriz de numeros complejos a sumar
	 * @param b Matriz de numeros complejos a sumar 
	 * @return sumMatrizComplejo resultado de la operacion realizada
	 */
	
	public MatrizComplejo sumaMatrizComplejos(MatrizComplejo a, MatrizComplejo b) {
		if((a.getFila()==b.getFila()) && (a.getColumna()==b.getColumna())) {
			MatrizComplejo sumMatrizComplejo = new MatrizComplejo(a.getFila(),a.getColumna());
			for(int i=0;i<a.getFila();i++) {
				for(int j=0;j<b.getColumna();j++) {
					sumMatrizComplejo.getMatrizCompl()[i][j] = Libreria.suma(a.getMatrizCompl()[i][j], b.getMatrizCompl()[i][j]);
				}
			}
			return sumMatrizComplejo;
			
		}
		else {
			return null;
		}
		
	}
	/**
	 * Restar dos matrices de numeros complejos 
	 * @param m1 Matriz de numeros complejos a restar
	 * @param m2 Matriz de numeros complejos a restar
	 * @return resMatrizComplejo resultado de la operacion realizada
	 */
	public MatrizComplejo restaMatrizComplejos(MatrizComplejo m1, MatrizComplejo m2) {
		if((m1.getFila()==m2.getFila()) && (m1.getColumna()==m2.getColumna())) {
			MatrizComplejo resMatrizComplejo = new MatrizComplejo(m1.getFila(),m1.getColumna());
			for(int i=0;i<m1.getFila();i++) {
				for(int j=0;j<m2.getColumna();j++) {
					resMatrizComplejo.getMatrizCompl()[i][j]=Libreria.resta(m1.getMatrizCompl()[i][j],m2.getMatrizCompl()[i][j]);
				}
			}
			return resMatrizComplejo;
		}
		else {
			return null;
		}
	}
	
	
	
	
	
	
	/**
	 * Multiplicacion de un escalar por una matriz compleja
	 * @param m1 matriz de numeros complejos a multiplicar
	 * @param a numero complejo a multiplicar
	 * @return multem resultado de la operacion realizada
	 */
	
	public MatrizComplejo productoEscalarMatriz( Complejo a, MatrizComplejo m1) {
		MatrizComplejo multem = new MatrizComplejo(m1.getColumna(),m1.getFila());		
			for(int i=0; i<m1.getColumna();i++) {
				for (int j=0;j<m1.getFila();j++) {
					multem.getMatrizCompl()[i][j] = Libreria.producto(a,m1.getMatrizCompl()[j][i]);
			}
		}
		return multem;
	}
	
	/**
	 * Multiplicacion de dos matrices complejas
	 * @param m1 matriz de numeros complejos a multiplicar
	 * @param m2 matriz de numeros complejos a multiplicar
	 * @return multi resultado de la operacion realizada.
	 */
	public static MatrizComplejo multiplicacionMatrices(MatrizComplejo m1, MatrizComplejo m2) {
		MatrizComplejo multi = new MatrizComplejo(m1.getColumna(),m2.getFila());
		if(m1.getFila()==m2.getColumna()) {
		for(int i=0; i<m1.getColumna();i++) {
			for(int j=0; j<m2.getFila();j++) {
				Complejo a = new Complejo(0,0);
				a = Libreria.suma(a, Libreria.producto(m1.getMatrizCompl()[i][j], m2.getMatrizCompl()[j][i]));
				multi.getMatrizCompl()[i][j] = a;
			}
			}
		}
		return multi;
	
	}
	
	/**
	 * Matriz inversa de una matriz de numeros complejos
	 * @param m1 matriz de numeros complejos
	 * @return matrizInversa de una matriz m1 dada
	 */
	public static MatrizComplejo inversa(MatrizComplejo m1) {
		MatrizComplejo inversa = new MatrizComplejo(m1.getFila(),m1.getColumna());
		for(int i=0;i<inversa.getFila();i++) {
			for(int j=0; j<inversa.getColumna();j++) {
				inversa.getMatrizCompl()[i][j]= Complejo.getInverso(m1.getMatrizCompl()[i][j].getReal(), m1.getMatrizCompl()[i][j].getImag());
			}
		}
		return inversa;
	}
	
	
	/**
	 * Matriz Transpuesta de una matriz de numeros complejos
	 * @param m1 matriz de numeros complejos 
	 * @return matrizTranspuesta de una matriz m1 dada
	 */
	public MatrizComplejo transpuesta(MatrizComplejo m1) {
		MatrizComplejo matrizTranspuesta = new MatrizComplejo(m1.getFila(),m1.getColumna());
		for(int i=0; i<matrizTranspuesta.getColumna();i++) {
			for(int j=0; j<matrizTranspuesta.getFila();j++) {
				matrizTranspuesta.getMatrizCompl()[i][j]=m1.getMatrizCompl()[j][i];
			}
		}
		return matrizTranspuesta;
	}
	
	/**
	 * Matriz conjugada de una matriz de numeros complejos 
	 * @param m1 matriz de numeros complejos
	 * @return matrizConjugada de una matriz m1 dada
	 */
	public MatrizComplejo conjugada(MatrizComplejo m1) {
		MatrizComplejo matrizConjugada = new MatrizComplejo(m1.getColumna(),m1.getFila());
		for(int i=0; i<matrizConjugada.getColumna();i++) {
			for(int j=0; j<matrizConjugada.getFila();j++) {
				matrizConjugada.getMatrizCompl()[i][j] = m1.getMatrizCompl()[i][j].getConjugado();
			}
		}
		return matrizConjugada;
	}
	
	
	
	/**
	 * Matriz adjunta de una matriz de numeros complejos 
	 * @param m1 matriz de numeros complejos
	 * @return matrizAdjunta de una matriz m1 dada
	 */
	
	public MatrizComplejo adjunta(MatrizComplejo m1) {
		return conjugada(transpuesta(m1));
	}
	
	
	/**
	 * Norma de una matriz de numeros complejos 
	 * @param m1 matriz de numeros complejos
	 * @return norma numero de tipo double que retorna la norma de una matriz m1 dada
	 */
	
	public double normaMatriz(MatrizComplejo m1) {
		double a=0.0;
		for(int i=0;i<m1.getFila();i++) {
			for(int j=0;j<m1.getColumna();j++) {
				a+=Math.pow(m1.getMatrizCompl()[i][j].getModulo(), 2);
			}
		}
		double norma = Math.sqrt(a);
		return norma;
		
	}
	
	/**
	 * Calcular la distancia entre dos matrices dadas
	 * @param m1 matriz de numeros complejos 
	 * @param m2 matriz de numeros complejos
	 * @return distancia numero de tipo double que retorna la distancia entree dos matrices de complejos dadas
	 */
	public double distanciaMatriz(MatrizComplejo m1, MatrizComplejo m2) {
		double distancia=this.normaMatriz(this.restaMatrizComplejos(m1, m2));
		return distancia;
		
	}
	

	
	
	/**
	 * Revisa si la matriz dada es unitaria 
	 * @param m1 matriz de numeros complejos
	 * @return boolean que identifica si es unitaria o no
	 */
	public Boolean Unitaria(MatrizComplejo m1) {
		MatrizComplejo unitaria = new MatrizComplejo(m1.getColumna(),m1.getFila());
		for(int i=0;i<unitaria.getColumna();i++) {
			for(int j=0;j<unitaria.getFila();j++) {
				if(i==j) {
					unitaria.getMatrizCompl()[i][j]= new Complejo(1,0);
				}
				else {
					unitaria.getMatrizCompl()[i][j]= new Complejo(0,0);
				}
			}
		}
		MatrizComplejo resp = multiplicacionMatrices(adjunta(m1),m1);
		MatrizComplejo resp1 = multiplicacionMatrices(m1,adjunta(m1));
		if(resp.equals(unitaria)&& resp1.equals(unitaria)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/**
	 * Revisa si la matriz dada es Hermitiana
	 * @param m1 matriz de numeros complejos 
	 * @return boolean que identifica si es hermitiana o no
	 */
	public Boolean Hermitiana(MatrizComplejo m1) {
		Boolean h = false;
		if(adjunta(m1).equals(m1)) {
			h=true;
			return h;
		}
		else {
			h=false;
			return h;
		}
		
	}
	
	/**
	 * Calcular el producto interno entre dos matrices
	 * @param m1 matriz de numeros complejos
	 * @param m2 matriz de numeros complejos
	 * @return prodInterno resultado de la operacion realizada 
	 */
	
	public Complejo productoInterno(MatrizComplejo m1, MatrizComplejo m2) {
		Complejo a = new Complejo(0,0);
		for(int i=0; i<m1.getFila();i++) {
			for(int j=0;j<m1.getColumna();j++) {
				a = Libreria.suma(a,Libreria.producto(m1.getMatrizCompl()[i][j],m2.getMatrizCompl()[i][j]));
			}
		}
		return a;
	}
		
	
	
	
	
	/**
	 * Calcular el producto tensor entre dos matrices
	 * @param m1 matriz de numeros complejos
	 * @param m2 matriz de numeros complejos 
	 * @return prodTensor resultado de la operacion realizada
	 */
	
	public MatrizComplejo productoTensor(MatrizComplejo m1, MatrizComplejo m2) {
		MatrizComplejo prodTensor= new MatrizComplejo(m1.getColumna()*m2.getColumna(),m1.getFila()*m2.getFila());
		for(int i=0; i<m1.getColumna();i++) {
			for(int j=0; j<m1.getFila();j++) {
				for(int k=0;k<m2.getColumna();k++) {
					for(int l=0; l<m2.getFila();l++) {
						prodTensor.getMatrizCompl()[i*m2.getColumna()+k][j*m2.getFila()+l]=Libreria.producto(m1.getMatrizCompl()[j][i],m2.getMatrizCompl()[l][k]);
					}
				}
			}
		}
		return prodTensor;
	}
	
	
	
	
	

}



