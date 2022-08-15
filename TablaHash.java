package Lab_07;

public class TablaHash<T> implements HashTable {
	
	private Entrada [] arrayHash;
	private int size;
	
	public TablaHash(int size){
		this.size = size;
		this.arrayHash = new Entrada[size];
		for (int i=0; i<size; i++)
			this.arrayHash[i]=new Entrada();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		for(int i=0; i<size; i++)
			if (this.arrayHash[i] != null)
				return false;
		return true;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object get(Integer key) {
		Object valor = null;
		int hashIndex = hashCode(key);
		Entrada arrayValor = arrayHash[hashIndex];
		while (arrayValor != null) {
			if (arrayValor.getKey() == key) {
				valor = arrayValor.getValor();
				break;
			}
			arrayValor = arrayValor.getNext();
		}
		return null;
	}

	@Override
	public Integer put(Integer key, Object value) {
		int hashIndex = hashCode(key);
		Entrada valor = arrayHash[hashIndex];
		Entrada newValor = new Entrada(key, value);
		if (arrayHash[hashIndex] == null) {
			newValor.setNext(valor.getNext());
			valor.setNext(newValor);
		}
		return null;
	}

	@Override
	public Integer remove(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		arrayHash[0] = new Entrada();
		
	}
	public int hashCode(int k) {
		Integer key = 0;
		key = (k & 0x7fffffff) % size;
		return key;
	}
	
	private int verificar(int key) {
		int newHash = hashCode(key);
		int key1;
		if (arrayHash[newHash] != null) {
			key1 =key+1;
			newHash = hashCode(key1);
			verificar(key1);
			
		}
		else {
			return newHash;
		}
	}

}
