package ch03_op;

import java.util.Scanner;

public class OpEx09 {
	/*
	 * 조건연산자(삼항 연산자)
	 *   (조건식)?참 : 거짓
	 *   
	 * 조건연산자는 조건문(if) 으로 변경이 가능함.  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		System.out.println(score);
		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println(score + "점은 " + result + "입니다.");
		//score는 짝수 or 홀수
		result = ((score % 2 == 0) ? "짝수" : "홀수");
		System.out.println(score + "는 " + result + "입니다.");
		//score는 짝수 or 홀수 or 0
		result = (score % 2 == 1) ? "홀수" : (score > 0)? "짝수": "0" ;
		System.out.println(score + "는 " + result + "입니다.");
		
		// 조건문 미리 보기
				String r;
				if (score >= 60) {
					r = "합격";
				} else {
					r = "불합격";
				}
				System.out.println(r);
		
		
	}

}
