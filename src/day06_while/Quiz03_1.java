package day06_while;

public class Quiz03_1 {
	public static void main(String[] args) {
		//1�� ���� ���
		
		int rice=100000, rat=2, day;
		for(day=1; day<=50; day++) {
			rice -= (20*rat);
			if(day%10==0) {
				rat*=2;
			}
			if(rice<=0) break;
		}
		System.out.println(day+"��");
		System.out.println(rat+"����");
		
		
		
	}

}
