package day06_while;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//123�־�� -> �Ųٷ� 321 ��������? �̰� �̿��� �޼��� ���߿� ��� ����
		//100 -> 001
		
		Scanner input = new Scanner(System.in);
		int i, temp;
		System.out.print("�� �Է�: ");
		i = input.nextInt();
		
		while(true) {
			temp=i%10;
			i=i/10;
			System.out.print(temp+" ");
			if(i==0)
				break;
		}
		System.out.println();
		
		input.close();
	}

}
