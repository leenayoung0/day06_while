package day06_while;

public class Quiz02 {
	public static void main(String[] args) {
		
		//1�� ����
		int i=1;
		int dep=1;
		for(i=1; i<=30; i++) {
			//System.out.println(i+"��°�� ������ �ݾ�: "+dep);	
			if(i==30) break;
			dep *= 2;
		}
		System.out.println("30��° �Ǵ³� �����ؾ��ϴ� �ݾ�: "+dep);
		
		// -> ������ Ǯ��
		int won =0;
		for(int day=1 ; day<=30; day++) {
			if (day ==1) {
				won =1;
			}else {
				won *= 2;
			}
			System.out.println(day+" : "+won);
		}
		System.out.println("30��° ��ġ �ݾ�: "+ won);
		
		
		//2�� ����
		int sum=0;
		for(i=1; i<=1000; i++) {
			if(i%3==0) {
				if(i%5!=0) {
					continue;
				}	
			}
			sum+=i;
		}
		System.out.println("���� 3�� ����� ������ 1~1000������ ��: "+sum);
		
		// -> ������ Ǯ��
//		int i, sum=0, sum1=0;
//		for(i=1; i<=1000; i++) {
//			if(i%3==0 && i%5!=0)
//				sum1+=i;
//			sum+=i;
//		}
//		sum = sum-sum1;
//		System.out.println(sum);
		
		
		
		//3�� ����
		int sum1=0;
		for(i=1; i<=1000 ; i++) {
			if(i%2!=0) {
				sum1+=i;
				if (sum1>=10000) break;
			}	
		}		
		//System.out.println("10000�� ���� �ʴ� ������ Ȧ���� �� : "+sum1);
		System.out.println("10000�� ���� �ʴ� Ȧ���� �� ������ i: "+(i-2));
		
		//->������ Ǯ��
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
