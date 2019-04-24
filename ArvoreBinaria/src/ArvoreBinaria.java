
public class ArvoreBinaria<T> {

	private NoArvoreBinaria<T> raiz;

	public ArvoreBinaria() {
		raiz = (NoArvoreBinaria<T>) new Object();
	}

	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}

	public boolean estaVazia() {
		return raiz == null;
	}

	public boolean pertence(T info) {
		return pertence(raiz, info);
	}

	private boolean pertence(NoArvoreBinaria<T> no, T info) {
		
		boolean ret = false;
		if (no == null)
			ret = false;
		
		if(no == info)
			ret = true;
		
		ret = pertence(no.getEsquerda(), info);
		if(ret)
			return true;
		
		ret = pertence(no.getDireita(), info);
		
		return ret;
	}

}
