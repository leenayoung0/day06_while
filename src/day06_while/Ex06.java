package day06_while;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("첫 문자 입력");
		n1 = input.next();
		System.out.println("두 문자 입력"); //두번째 문자라는 뜻인가봄
		n2 = input.next();
		System.out.println("n1길이 : "+n1.length());
		System.out.println("n2길이 : "+n2.length());
		System.out.println("n1 == n2 : "+ (n1==n2)); // 문자열은 이렇게 비교가 안됨
		System.out.println("n1.equals(n2) : " + n1.equals(n2));
		System.out.println("n2.equals(n1) : " + n2.equals(n1));
		
		String str = null;
		//System.out.println(str.equals(n1)); //null값이면 .을 찍어 하는 무언가에 쓸 수 없다 안된다 .equals()
		System.out.println(n1.equals(str)); //이렇게 반대로는 가능
		
		int num1=3, num2=2;
		System.out.println(num1==num2);
	
	
	input.close();
	}

}
