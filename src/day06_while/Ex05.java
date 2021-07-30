package day06_while;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1.걷기 2.대중교통 3.종료");
			int select = input.nextInt();
			switch(select) {
			case 1: System.out.println("걸어가자");break;
			case 2: System.out.println("버스타자");break;
			case 3: System.out.println("종료하자");
				System.exit(1); //(숫자 뭐든 상관없음/ 보통 정상일경우 0, 뭔가 악성 -1, 비정상이면 1)
			}
		
		}
		
	}

}
