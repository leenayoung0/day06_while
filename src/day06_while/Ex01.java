package day06_while;

public class Ex01 {
	public static void main(String[] args) {
		/* �� �߿� �ͼ��ϰ� ���Ѱ� �����
		 while(���ǽ�){
		 
		 }
		 for( ; ���ǽ� ; ){
		 
		 }
		 */
		
		int i=1;
		int sum=0;
		//while��
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1~10������ �� : "+sum);
		
		//for��
		for( ; i<=10 ; ) {
			sum+=i;
			i++;
		}
		System.out.println("1~10������ �� : "+sum);
		
		//��� ���� ����
	}

}
