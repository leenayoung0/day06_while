package day06_while;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n1, n2;
		System.out.println("ù ���� �Է�");
		n1 = input.next();
		System.out.println("�� ���� �Է�"); //�ι�° ���ڶ�� ���ΰ���
		n2 = input.next();
		System.out.println("n1���� : "+n1.length());
		System.out.println("n2���� : "+n2.length());
		System.out.println("n1 == n2 : "+ (n1==n2)); // ���ڿ��� �̷��� �񱳰� �ȵ�
		System.out.println("n1.equals(n2) : " + n1.equals(n2));
		System.out.println("n2.equals(n1) : " + n2.equals(n1));
		
		String str = null;
		//System.out.println(str.equals(n1)); //null���̸� .�� ��� �ϴ� ���𰡿� �� �� ���� �ȵȴ� .equals()
		System.out.println(n1.equals(str)); //�̷��� �ݴ�δ� ����
		
		int num1=3, num2=2;
		System.out.println(num1==num2);
	
	
	input.close();
	}

}
