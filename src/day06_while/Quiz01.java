package day06_while;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		int sum=0;
		
		//1�� ����
		while(true) {
			System.out.print("1~10 ������ ���� �Է�: ");
			i=sc.nextInt();
			if(i>=1 && i<=10) {
				break;
			}
			System.out.println("�߸� �Է� �ٽ�");
		}
		for(int j=1; j<=i; j++) {
			sum+=j;
		}
		System.out.println("�Է� ���� �� ������ �� : "+sum);
		System.out.println();
		
		//2�� ����
		while(true) {
			System.out.print("10~20 ������ ���� �Է�: ");
			i=sc.nextInt();
			if(i>=10 && i<=20) {
				break;
			}
			System.out.println("�߸� �Է� �ٽ�");
		}
		for(int j=1; j<=i; j++) {
			sum+=j;
		}
		System.out.println("�Է� ���� �� ������ �� : "+sum);		
		sc.close();
	}
	

}
