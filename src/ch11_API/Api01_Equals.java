package ch11_API;
/* Object 클래스
 * equals 메서드 예제 : 동등을 정의 하는 메서드.=> 오버라이딩 필요.
 * => 같은 객체인지 여부는 == (instance) 로 구분이 가능함.
 * => 같은 내용(동등)인지 여부는 equals 메서드를 오버라이딩 해야함. 
 *   */
public class Api01_Equals {

	public static void main(String[] args) {
	}
}
class Equal {
	int value;
	Equal(int value) {		this.value = value;	}
	@Override
	public boolean equals(Object obj) {
		 if(obj instanceof Equal) {
			   Equal e = (Equal) obj;
			   return value==e.value;		   } 
		 else {			   return false;		   }
		 }
	} //end class