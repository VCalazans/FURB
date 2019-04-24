import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;

public class NoArvoreBinaria<T> {
	
	private T info;
	private NoArvoreBinaria<T> esquerda;
	private NoArvoreBinaria<T> direita;
	
	public NoArvoreBinaria(T info) {
		this.info = info;
		esquerda = null;
		direita = null;
	}
	
	public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
		this.info = info;
		esquerda = esq;
		direita = dir;
	}
	
	public T getInfo() {
		return info;
	}
	
	public NoArvoreBinaria<T> getEsquerda(){
		return esquerda;
	}
	
	public NoArvoreBinaria<T> getDireita(){
		return direita;
	}
	
	public void setEsquerda(NoArvoreBinaria<T> esq) {
		this.esquerda = esq;
	}
	
	public void setDireita(NoArvoreBinaria<T> dir) {
		this.direita = dir;
	}
	
}