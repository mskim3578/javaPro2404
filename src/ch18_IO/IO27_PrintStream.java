package ch18_IO;

import java.util.Date;

/*
 * printf 메서드 : 형식지정문자. 
 */
public class IO27_PrintStream {
	public static void main(String[] args) {
		//char 형식지정문자 : %c %n=\n
		System.out.printf("%c%n",'A'); //'A'문자출력
		System.out.printf("%5c%n",'A');//5자리 확보 'A' 문자 우측정렬 출력
		System.out.printf("%-5c%n",'A');//5자리 확보 'A' 문자 좌측정렬 출력
		//정수 출력 : %d,%o,%x, %X
		System.out.printf("%d%n",12345); //10진수 출력
		System.out.printf("%,d%n",12345); //세자리 , 10진수 출력
		System.out.printf("%10d%n",12345); //10자리 확보 10진수 출력
		System.out.printf("%010d%n",12345); //10자리 확보 빈자리 0을 채워 10진수 출력
		System.out.printf("%3d%n",12345); //최소 3자리 확보 10진수 출력
		System.out.printf("%-10d%n",12345); //10자리 확보 좌측 정렬 10진수 출력
		System.out.printf("%,10d%n",12345); //10자리 확보 세자리 , 10진수 출력
		System.out.printf("%-,10d%n",12345); //10자리 확보 세자리 , 10진수  좌측 정렬 출력
		System.out.printf("%,010d%n",12345); //10자리 확보 세자리 , 빈자리 0을 채워 10진수 출력
		System.out.printf("%o%n",12345); //8진수 출력
		System.out.printf("%x%n",255); //a~f 소문자 표시 16진수 출력
		System.out.printf("%X%n",255); //A~F 대문자 표시 16진수 출력
		//실수 출력 : %f, %e, %g
		System.out.printf("%f%n",12345.12345);//실수 출력
		System.out.printf("%.2f%n",12345.12345);//소숫점이하 2자리까지 실수 출력
		System.out.printf("%10.2f%n",12345.12345);//10자리 확보 소숫점이하 2자리까지 실수 출력	
		//10자리 확보 세자리 ,  소숫점이하 2자리까지 실수 출력
		System.out.printf("%,10.2f%n",12345.12345);		
		//10자리 확보 세자리 , 소숫점이하 2자리까지 실수 좌측 정렬 출력
		System.out.printf("%-,10.2f%n",12345.12345);		
		//10자리 확보 세자리 , 소숫점이하 2자리까지 빈자리 0으로 채워 실수  출력
		System.out.printf("%,010.2f%n",12345.12345);		
		System.out.printf("%e%n",12345.12345);	
		//지수표현 출력	1.234512 * 10의 4승
		System.out.printf("%g%n",12345.12345);	//근사 실수	
		//논리형 : %b
		System.out.printf("%b != %b%n",true,false);
		System.out.printf("(2 > 3) == %b%n",(2>3));
		//문자열 : %s
		System.out.printf("%s은 %s이다%n","홍길동","의적");
		System.out.printf("%10s은 %10s이다%n","홍길동","의적");
		//문제 : 10진수 255는 8진수 377이고, 16진수 FF다. 출력하기
		System.out.printf("10진수 %d는 8진수 %o이고, 16진수 %X다%n",255,255,255);
		System.out.printf("%d는 16진수 %X다%n",170,170);
		System.out.printf("%d는 2진수 %s다%n",10,Integer.toBinaryString(10));
		Date d = new Date();
		System.out.printf("오늘은 %tY년 %tm월 %td일 입니다.%n", d,d,d ); 
		System.out.printf("지금은 %tH시 %tM분 %tS초 입니다.%n", d,d,d );
		System.out.printf("지금은 %1$tH시 %1$tM분 %1$tS초 입니다.%n", d );
	}
}