package day06_while;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//123넣어보기 -> 거꾸로 321 나오겠지? 이걸 이용한 메서드 나중에 사용 가능
		//100 -> 001
		
		Scanner input = new Scanner(System.in);
		int i, temp;
		System.out.print("수 입력: ");
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
