package day06_while;

import java.util.Scanner;

public class Quiz03_2_Tver {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num1, num2, max=0, min=0, i=2;
		System.out.print("�� �� �Է� : ");
		num1 = input.nextInt();
		num2 = input.nextInt();

		while(i<=num1&&i<=num2){
			if(num1%i==0&&num2%i==0)
					min=i;
				i++;
		}
		max=num1*num2/min;	//�ּ� ����� ���ϴ� ��
		System.out.println("�ּ� ����� : "+max);
		System.out.println("�ִ� ����� : "+min);
	}

}
