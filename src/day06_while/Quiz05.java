package day06_while;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		//2. Ŀ�� ���Ǳ� �����
		Scanner sc = new Scanner(System.in);
		int won, menu;
		
		System.out.print("����� ���� �ϼ��� >>> ");
		won = sc.nextInt();
		
		while(won>0) {
		System.out.println("==========Ŀ�� ���Ǳ�==========\n");
		System.out.println("1. Ŀ��(200)    2. ���ھ�(250)   3. ��ȯ  4.����");
		System.out.print("�޴��� �����ϼ��� >>> ");
		menu = sc.nextInt();
		switch(menu) {
		case 1: if(won<200) {
					System.out.println("����� �����մϴ�"); 
					break;
				}
				if(won>=200) {
					System.out.println("���ְ� �弼��");
					won-=200;
				}
				break;
		case 2: if(won<250) {
					System.out.println("����� �����մϴ� \n�ܾ�: "+won); 
					break;
				}
				if(won>=250) {
					System.out.println("���ְ� �弼��");
					won-=250;
				}
				break;
		case 3: System.out.println("�Ž����� : "+ won); 
				break;
		case 4: System.out.println("�ȳ���������~");
				System.exit(1);
		
		
			
		}
		
		}
		
		
		
	}
	

}
