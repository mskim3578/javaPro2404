package ch17_stream;

import java.util.function.IntPredicate;

/*
 * and(), or(), negate() 디폴트 메소드
Predicate 함수적 인터페이스의 디폴트 메소드
and() - &&와 대응 
두 Predicate가 모두 true를 리턴  최종적으로 true 리턴
or() - || 와 대응 
두 Predicate 중 하나만 true를 리턴  최종적으로 true 리턴
negate() - ! 와 대응 
Predicate의 결과가 true이면 false, false이면 true 리턴 */

public class StreamEx17_Connect {

	public static void main(String[] args) {
		//2의 배수 검사
		IntPredicate predicateA = a -> a%2 == 0;
		//3의 배수 검사
		IntPredicate predicateB = (a) -> a%3 == 0;
		IntPredicate predicateAB;
		boolean result;
		//and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);
		//or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수입니까? " + result);
		//negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? " + result);

	}

}
