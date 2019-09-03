package LibreriaCNYT;
import java.util.Arrays;
import java.util.Objects;

public class MatrizComplejo {
	private int fila, columna;
	private Complejo[][] matrizCompl;
	private Complejo[] vectorCompl;
	private int valor;
	
	
	public MatrizComplejo(int fila, int columna) {
		this.fila=fila;
		this.columna=columna;
		this.matrizCompl= new Complejo[fila][columna];
	}
	
	public MatrizComplejo(int valor) {
		this.valor=valor;
		this.vectorCompl = new Complejo[valor];
	}
	
	public Complejo[][] getMatrizCompl() {
		return matrizCompl;
	}
	
	public Complejo[] getVectorCompl() {
		return vectorCompl;
	}
	
	public void setVectorCompl(Complejo[] valor) {
		this.vectorCompl=valor;
	}
	
	public void setMatrizCompl(Complejo[][] fila) {
		this.matrizCompl=fila;
	}
	
	public int getFila() {
		return fila;
	}
	
	public int getColumna() {
		return columna;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor=valor;
	}
	
	public void addVector(Complejo v, int valor) {
		this.vectorCompl[valor]=v;
	}
	
	public void addComplejo(Complejo a, int i, int j) {
		this.matrizCompl[i][j]=a;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null || getClass()!=o.getClass()) {
			return false;
		}
		MatrizComplejo that = (MatrizComplejo) o;
		Boolean equalmatrix=true;
		
		if(fila==that.fila && columna==that.columna) {
			for(int i=0; i<fila && fila==that.fila && columna==that.columna;i++) {
				for(int j=0; j<columna;j++) {
					equalmatrix=this.getMatrizCompl()[i][j].equals(that.getMatrizCompl()[i][j]);
				}
			}
		}
		return equalmatrix;
	}

	
	@Override
	public int hashCode() {
		int result = Objects.hash(fila,columna);
		result = 31*result+Arrays.hashCode(matrizCompl);
		return result;
		
	}
	
	
	

}
