package ch11_API;

import java.util.Arrays;

public class Api22_Clone {
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		
        // 배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
		int[] arrClone = arr.clone(); 
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		arrClone[0]= 6;

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
	}
}