package ch12_generic;

public class GenericEx07 {
	public static void main(String[] args) {
		Generic1<String> t = new Generic1<String>();
		String[] ss = { " 월매 ", " 춘향 ", " 향단 " };
		t.set(ss);
		t.print();
		for (String s : t.get())System.out.println(s.trim());
		Integer[] ii = { 10, 20, 30 };
		Generic1<Integer> t2 = new Generic1<Integer>();
		t2.set(ii);
		t2.print();
		for (Integer s : t2.get())System.out.println(s);
	}
}

class Generic1<T> {
	T[] v;

	public void set(T[] n) {
		v = n;
	}

	public T[] get() {
		return v;
	}

	public void print() {
		for (T s : v)
			System.out.print(s + ",");
		System.out.println();
	}
}
