package day06_while;

import java.util.Scanner;

public class Quiz03_3 {
	public static void main(String[] args) {
		//3�� ���� ���
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
