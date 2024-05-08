package ch17_stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamEx02_Iterator {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","김삿갓","이몽룡","성춘향","임꺽정","향단이");
		System.out.println("외부 반복자 이용");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("내부 반복자 이용");
		list.stream().forEach(s -> System.out.println(s));
	}

}
