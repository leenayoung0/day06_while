package day06_while;

public class Ex01 {
	public static void main(String[] args) {
		/* 둘 중에 익숙하고 편한거 쓰면됨
		 while(조건식){
		 
		 }
		 for( ; 조건식 ; ){
		 
		 }
		 */
		
		int i=1;
		int sum=0;
		//while문
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1~10까지의 합 : "+sum);
		
		//for문
		for( ; i<=10 ; ) {
			sum+=i;
			i++;
		}
		System.out.println("1~10까지의 합 : "+sum);
		
		//결과 서로 같음
	}

}
