package ch06_obj1;
/*
 * 생성자란 ?
 *    객체화시 호출되는 메서드
 *    생성자 없이 객체 생성은 불가함.(String 제외: String a= "aaa" )
 *    기능은 인스턴스 변수의 초기화 담당함.
 *  
 * 생성자 구현
 *   1. 생성자의 이름은 클래스명과 같다.
 *   2. 리턴타입을 기술하지 않는다. 
 *   
 * 기본생성자
 *   클래스에 생성자를 하나도 구현하지 않으면 컴파일러가 추가해주는 생성자
 *   public 클래스명(){} 형태임     
 */
class Number1 {
	int num;
}
class Number2 {
	int num;
	public Number2() {	}
	public Number2(int num) {  //생성자
		this.num=num;
	}
}
public class O14_Constructor {

	public static void main(String[] args) {
		Number1 n1 = new Number1();
		n1.num=10;
		Number2 n2 = new Number2();
		n2.num=20;
		Number2 n3 = new Number2(20);
		System.out.println("Number1 class의 num="+n1.num);
		System.out.println("Number2 class의 num="+n2.num);
		System.out.println("Number3 class의 num="+n3.num);

	}

}