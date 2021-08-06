package day06_while;

public class Quiz02 {
	public static void main(String[] args) {
		
		//1번 문제
		int i=1;
		int dep=1;
		for(i=1; i<=30; i++) {
			//System.out.println(i+"번째날 내야할 금액: "+dep);	
			if(i==30) break;
			dep *= 2;
		}
		System.out.println("30일째 되는날 예금해야하는 금액: "+dep);
		
		// -> 선생님 풀이
		int won =0;
		for(int day=1 ; day<=30; day++) {
			if (day ==1) {
				won =1;
			}else {
				won *= 2;
			}
			System.out.println(day+" : "+won);
		}
		System.out.println("30일째 예치 금액: "+ won);
		
		
		//2번 문제
		int sum=0;
		for(i=1; i<=1000; i++) {
			if(i%3==0) {
				if(i%5!=0) {
					continue;
				}	
			}
			sum+=i;
		}
		System.out.println("순수 3의 배수를 제외한 1~1000까지의 합: "+sum);
		
		// -> 선생님 풀이
//		int i, sum=0, sum1=0;
//		for(i=1; i<=1000; i++) {
//			if(i%3==0 && i%5!=0)
//				sum1+=i;
//			sum+=i;
//		}
//		sum = sum-sum1;
//		System.out.println(sum);
		
		
		
		//3번 문제
		int sum1=0;
		for(i=1; i<=1000 ; i++) {
			if(i%2!=0) {
				sum1+=i;
				if (sum1>=10000) break;
			}	
		}		
		//System.out.println("10000을 넘지 않는 마지막 홀수의 합 : "+sum1);
		System.out.println("10000을 넘지 않는 홀수의 합 마지막 i: "+(i-2));
		
		//->선생님 풀이
//		int i=1; sum=0;
//		for( ; sum < 10000 ; i++) {
//			if(i%2 == 1) {
//				sum+=i;
//			}
//			System.out.println(i+" : "+sum);
//		}
//		i--;
//		System.out.println(i+" : "+sum);
		
	}

}
