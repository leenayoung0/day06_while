package day06_while;

public class Ex04 {
	public static void main(String[] args) {
		/*
		 continue :  �ݺ����� �������� �÷�������
		 */
		
		int i=0;
		while(i<5) {
			i++;
			System.out.println(i);
		}
		
		//if�� ���
		while(i<5) {
			i++;
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("���� ����� ����");
		
		//continue ��� : �ݺ����� �������� �÷�����
		//	(if���� �ش��ϴ� 3�� �����ϰ� ���� ��� ���)
		while(i<5) {
			i++;
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("���� ����� ����");
	}
}
