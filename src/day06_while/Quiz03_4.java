package day06_while;

public class Quiz03_4 {
	public static void main(String[] args) {
		// 4번 문제 %4%6 1
		int sum=0;
		for(int i=1; i<=1000; i++) {
			if(i%4==1 && i%6==1) {
				sum+=i;
			}
		}
		System.out.println("1~1000까지 4,6으로 나눈 나머지가 1인 수의 합: "+ sum);
	}

}
