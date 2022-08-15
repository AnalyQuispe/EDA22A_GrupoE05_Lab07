package Lab_07;

public class Entrada <T>{
	
	private T valor;
	private int key;
	private Entrada next;
	
	public Entrada(int key, T valor) {
		this.valor = valor;
		this.key = key;
		this.next = null;
	}
	
	public Entrada() {
		this.next = null;
	}
	
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}

	public Entrada getNext() {
		return next;
	}

	public void setNext(Entrada next) {
		this.next = next;
	}
	
	

}
