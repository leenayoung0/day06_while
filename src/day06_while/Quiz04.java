package day06_while;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		//1.로그인 프로그램 만들기
		int n, pw=0, pw1;
		String id=null, id1;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.print(">>>");
			n = sc.nextInt();
			
			
			  switch(n) { case 3: System.out.println("로그인 프로그램 종료"); System.exit(1);
			  
			  case 2: System.out.println("저장할 아이디 입력 : "); id = sc.next();
					  System.out.println("저장할 비밀번호(숫자만 가능) 입력 : "); pw = sc.nextInt();
					  System.out.println("가입 완료 !!!"); break;
			  
			  case 1: System.out.print("아이디 입력 : "); id1 = sc.next();
			  		  System.out.print("비밀번호 입력 : "); pw1 = sc.nextInt();
			  
					  if(id1.equals(id)==true && pw==pw1) { System.out.println("인증 성공!!!"); }
					  if(id1.equals(id)==false || pw!=pw1) { System.out.println("인증 실패!!!"); }
					  break;
			  
			  default: System.out.println("1,2,3 중에 입력해주세요"); break;
			  
			  }
			 
			
			/*
			 * if(n==3) { System.out.println("로그인 프로그램 종료"); break; }
			 * 
			 * if(n==2) { System.out.println("저장할 아이디 입력 : "); id = sc.next();
			 * System.out.println("저장할 비밀번호(숫자만 가능) 입력 : "); pw = sc.nextInt();
			 * System.out.println("가입 완료 !!!"); }
			 * 
			 * if(n==1) { System.out.print("아이디 입력 : "); id1 = sc.next();
			 * System.out.print("비밀번호 입력 : "); pw1 = sc.nextInt();
			 * 
			 * if(id1.equals(id)==true && (pw==pw1)==true) { System.out.println("인증 성공!!!");
			 * } if(id1.equals(id)==false || (pw==pw1)==false) {
			 * System.out.println("인증 실패!!!"); } }
			 * 
			 * else { System.out.println("1,2,3 중에 입력해주세요"); }
			 */
						 
			
		
		}
		
		
	}
	
	

}
