package ch11_API;
/*  StringBuffer는 리터럴 대입이 불가함
 *  메소드(append) 로 추가하여야함
 *  append시 참조형 변수가 바뀌지 않음*/
class Api13_StringBuffer {
	public static void main(String[] args) {
		//StringBuffer sb = "01";
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb1 = new StringBuffer("01");
		System.out.println(sb==sb1);
		StringBuffer sb2 = sb.append(23);
		System.out.println(sb);	
		System.out.println(sb2);
		sb.append('4').append(56);
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);		
		System.out.println(sb==sb3);
		System.out.println("sb =" + sb);
		System.out.println("sb2=" + sb2);
		System.out.println("sb3=" + sb3);
		System.out.println("sb:deleteCharAt =" 
		+ sb.deleteCharAt(10));  // index =10
		System.out.println("sb:delete =" + sb.delete(3, 6));
		System.out.println("sb:insert =" + sb.insert(3, "abc"));
		System.out.println("sb:replace =" 
		+ sb.replace(6, sb.length(), "END"));
		System.out.println("capacity=" + sb.capacity());
		sb.append("aaaaaaaaa9999999999999999");
		System.out.println(sb);
		System.out.println("capacity=" + sb.capacity());
		System.out.println("length=" + sb.length());
	}
}