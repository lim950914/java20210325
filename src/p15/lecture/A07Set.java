package p15.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A07Set {
	// Set 순서 없고, 중복 불가
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(9);
		set.add(8);
		set.add(2);
		
		System.out.println(set.size()); // 3
		
		set.add(9); // 중복 불가 값이 들어가지 않음
		
		System.out.println(set.size()); // 3
		
		boolean c = set.contains(9);
		System.out.println(c);
		
		System.out.println(set.contains(3));
		
		set.remove(9);
		
		System.out.println(set.size());
		
		set.add(9);
		set.add(3);
		set.add(2);
		
		System.out.println(set.size());
		
		Iterator<Integer> iter = set.iterator();
		
		
//		System.out.println(iter.hasNext());
//		Integer i1 = iter.next();
//		System.out.println(iter.hasNext());
//		Integer i2 = iter.next();
//		System.out.println(iter.hasNext());
//		Integer i3 = iter.next();
//		System.out.println(iter.hasNext());
//		Integer i4 = iter.next();
//		System.out.println(iter.hasNext());
//		Integer i5 = iter.next(); // iterator 에서 값 이상의 next를 사용하면 Exception 발생
		
		while (iter.hasNext()) {
			Integer n = iter.next();
			System.out.println(n);
		}
	}
}
