package ch03_op;
public class OpEx01 {
	/*
	 * 증감연산자 
	 *   ++ : 숫자의 값을 1 증가.
	 *   -- : 숫자의 값을 1 감소.
	 */
	public static void main(String[] args) {
		int x=5,y=5;
		x++; //후위형
		y--;
		System.out.println("x="+x+",y="+y);
		x=y=5;
		++x; //전위형
		--y;
		System.out.println("x="+x+",y="+y);
	}
}