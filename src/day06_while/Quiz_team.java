package day06_while;

public class Quiz_team {
	public static void main(String[] args) {
		
		// 1�� ����. ������ ���� ����ϱ�
		//*
		//**
		//***
		//****
		//*****
		int i,j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//2�� ����. ������ ���� ����ϱ�
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		
		int n=1;
		for(i=1; i<=9; i++) {
			if(i<=5) {
				for(j=1; j<=i; j++) {
					System.out.print("*");
				}
			}
			
			  if(i>5) { 	  			  
				  for(j=2; j<=(i-n); j++) { 					  			
					  System.out.print("*"); 
					  } 
				  	n+=2;
				  }
			System.out.println();
		}
		System.out.println();
		
		
		//3�� ����.3. ������ ���� ����ϱ�
	    //    *
	    //   ***
	    //  *****
	    // *******
	    //*********
		
		int a=0;
		for(i=1; i<=5; i++) { 
	 	  for(j=4; j>=i; j--){ 
			  System.out.print(" "); 
			  }
		
		  for(n=1; n<=(i+a); n++){ 
			  System.out.print("*"); 
			 
			  }
		  a++;
		  System.out.println();
	  }
	  System.out.println();
		 
		
	}

}
