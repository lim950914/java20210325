package p13.lecture;

public class A06BoundedTypeParameter {
	public static void main(String[] args) {
		Generic6<String> g1 = new Generic6<>();
		Generic6<StringBuffer> g2 = new Generic6<>();
		Generic6<StringBuilder> g3 = new Generic6<>();
		
//		Generic6<Object> g4 = new Generic6<>(); 
	}
}

class Generic6<T extends CharSequence> {
	// T 는 T인데 CharSequence인 T를 뜻한다
	// CharSequence자리엔 class interface 도 가능하다
	private T field;
	
	public void method() {
		char c = field.charAt(3); // CharSequence의 하위 타입인 charAt 실행가능 이런 용도를 위해 사용됨 
	}
}