package aula.tres;

public class Fila<T> {

	private No<T> refNoEntradaFila;
	
	public Fila() {
		this.refNoEntradaFila = null;
	}
	
	public boolean isEmpty() {
		return refNoEntradaFila == null ? true : false;
	}

	public T first() {
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				}else {
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}
	
	public void enqueue(T object) {
		No novoNo =new No(object);
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}

	public T dequeue() {
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			No noAuxliar = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}else {
					noAuxliar.setRefNo(null);
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}

	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = refNoEntradaFila;

		if(refNoEntradaFila != null) {
			while(true) {
				stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				}else {
					stringRetorno += "null";
					break;
				}
			}
		}else {
			stringRetorno = "null";
		 }

		return stringRetorno;
	}
	
	
	
}
