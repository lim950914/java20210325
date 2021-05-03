package p18.lecture;
// 한글추가됨
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class A17FilterStream {
	public static void main(String[] args) throws Exception {
		// inputstream -> reader
		String file = "src/p18/lecture/A17FilterStream.java";
		InputStream is = getInputStream(file);
		InputStreamReader isr = new InputStreamReader(is); // 다른 스트림을 감싸서 읽는 스트림 (읽기 쓰기 다 가능하다)
		
		int b = 0;
		
		while ((b = isr.read()) != -1) {
			System.out.print((char) b);
		}
		
		isr.close();
		is.close();
	}
	
	public static InputStream getInputStream(String file) throws Exception {
		return new FileInputStream(file);
	}
}


