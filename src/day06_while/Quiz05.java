package day06_while;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		//2. 커피 자판기 만들기
		Scanner sc = new Scanner(System.in);
		int won, menu;
		
		System.out.print("요금을 투입 하세요 >>> ");
		won = sc.nextInt();
		
		while(won>0) {
		System.out.println("==========커피 자판기==========\n");
		System.out.println("1. 커피(200)    2. 코코아(250)   3. 반환  4.종료");
		System.out.print("메뉴를 선택하세요 >>> ");
		menu = sc.nextInt();
		switch(menu) {
		case 1: if(won<200) {
					System.out.println("요금이 부족합니다"); 
					break;
				}
				if(won>=200) {
					System.out.println("맛있게 드세요");
					won-=200;
				}
				break;
		case 2: if(won<250) {
					System.out.println("요금이 부족합니다 \n잔액: "+won); 
					break;
				}
				if(won>=250) {
					System.out.println("맛있게 드세요");
					won-=250;
				}
				break;
		case 3: System.out.println("거스름돈 : "+ won); 
				break;
		case 4: System.out.println("안녕히가세요~");
				System.exit(1);
		
		
			
		}
		
		}
		
		
		
	}
	

}
