package day06_while;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		//1.�α��� ���α׷� �����
		int n, pw=0, pw1;
		String id=null, id1;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.������");
			System.out.print(">>>");
			n = sc.nextInt();
			
			
			  switch(n) { case 3: System.out.println("�α��� ���α׷� ����"); System.exit(1);
			  
			  case 2: System.out.println("������ ���̵� �Է� : "); id = sc.next();
					  System.out.println("������ ��й�ȣ(���ڸ� ����) �Է� : "); pw = sc.nextInt();
					  System.out.println("���� �Ϸ� !!!"); break;
			  
			  case 1: System.out.print("���̵� �Է� : "); id1 = sc.next();
			  		  System.out.print("��й�ȣ �Է� : "); pw1 = sc.nextInt();
			  
					  if(id1.equals(id)==true && pw==pw1) { System.out.println("���� ����!!!"); }
					  if(id1.equals(id)==false || pw!=pw1) { System.out.println("���� ����!!!"); }
					  break;
			  
			  default: System.out.println("1,2,3 �߿� �Է����ּ���"); break;
			  
			  }
			 
			
			/*
			 * if(n==3) { System.out.println("�α��� ���α׷� ����"); break; }
			 * 
			 * if(n==2) { System.out.println("������ ���̵� �Է� : "); id = sc.next();
			 * System.out.println("������ ��й�ȣ(���ڸ� ����) �Է� : "); pw = sc.nextInt();
			 * System.out.println("���� �Ϸ� !!!"); }
			 * 
			 * if(n==1) { System.out.print("���̵� �Է� : "); id1 = sc.next();
			 * System.out.print("��й�ȣ �Է� : "); pw1 = sc.nextInt();
			 * 
			 * if(id1.equals(id)==true && (pw==pw1)==true) { System.out.println("���� ����!!!");
			 * } if(id1.equals(id)==false || (pw==pw1)==false) {
			 * System.out.println("���� ����!!!"); } }
			 * 
			 * else { System.out.println("1,2,3 �߿� �Է����ּ���"); }
			 */
						 
			
		
		}
		
		
	}
	
	

}
