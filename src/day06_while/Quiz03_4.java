package day06_while;

public class Quiz03_4 {
	public static void main(String[] args) {
		// 4�� ���� %4%6 1
		int sum=0;
		for(int i=1; i<=1000; i++) {
			if(i%4==1 && i%6==1) {
				sum+=i;
			}
		}
		System.out.println("1~1000���� 4,6���� ���� �������� 1�� ���� ��: "+ sum);
	}

}
