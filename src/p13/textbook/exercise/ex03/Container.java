package p13.textbook.exercise.ex03;

public class Container<K, V> {
	private K Key;
	private V Value;

	public void set(K Key, V Value) {
		this.Key = Key;
		this.Value = Value;
	}
	
	public K getKey() {
		return Key;
	}

	public V getValue() {
		return Value;
	}


}
