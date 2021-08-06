package day06_while;

import java.util.Scanner;

public class Quiz03_3 {
	public static void main(String[] args) {
		//3번 문제 약수
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
