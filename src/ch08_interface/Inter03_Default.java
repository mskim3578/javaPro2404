package ch08_interface;

public class Inter03_Default {
	/*
	 * jdk 8.0 이후에 인터페이스도 구현부를 가진 메서드를 멤버로 가질 수 있다.
	 *   default 메서드 : 인스턴스멤버
	 *    구현객체에  다중 구현이 가능하므로 똑같은 default 메서드가 존재할 수 있다.
	 *    조건에 따라 오버라이딩 할 수 있다 
	 *   static 메서드  :  클래스 멤버 
	 */
	public static void main(String[] args) {
		Child c = new Child();
		c.method(); 
		c.method1();
		c.method2();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}	
}

interface MyInterface1 {
	void method();
	default void method1() {
		System.out.println("MyInterface1의 디폴트 메서드 : method1()");	}
	static void staticMethod() {
	System.out.println("MyInterface1의 static 메서드 : staticMethod()");
	}}

interface MyInterface2 {
	void method();
	default void method1() {
		System.out.println("MyInterface2의 디폴트 메서드 : method1()");	}
	default void method2() {
		System.out.println("MyInterface2의 디폴트 메서드 : method2()");	}
	static void staticMethod() {
		System.out.println("MyInterface2의 static 메서드 : staticMethod()");
		}}

class Parent {
	public void method2() {
		System.out.println("Parent 클래스의 멤버 메서드 :method2()");	}}

class Child extends Parent implements MyInterface1,MyInterface2 {

	@Override
	public void method() {
		System.out.println("child method 입니다");
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println(" child method1");
	}
	
}







