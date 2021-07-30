package day06_while;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		int sum=0;
		
		//1번 문제
		while(true) {
			System.out.print("1~10 사이의 숫자 입력: ");
			i=sc.nextInt();
			if(i>=1 && i<=10) {
				break;
			}
			System.out.println("잘못 입력 다시");
		}
		for(int j=1; j<=i; j++) {
			sum+=j;
		}
		System.out.println("입력 받은 수 까지의 합 : "+sum);
		System.out.println();
		
		//2번 문제
		while(true) {
			System.out.print("10~20 사이의 숫자 입력: ");
			i=sc.nextInt();
			if(i>=10 && i<=20) {
				break;
			}
			System.out.println("잘못 입력 다시");
		}
		for(int j=1; j<=i; j++) {
			sum+=j;
		}
		System.out.println("입력 받은 수 까지의 합 : "+sum);		
		sc.close();
	}
	

}
