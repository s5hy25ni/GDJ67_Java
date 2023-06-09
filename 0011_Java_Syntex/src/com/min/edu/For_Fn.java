package com.min.edu;

public class For_Fn {
	public void make() {
		for(int k=0; 	// 선언
			k<5; 		// 판단
			k++) {		// 증감
			System.out.println(k);
		}
		
		int k=0;
		for(; k<5; k++) {
			System.out.println(k); // 마지막 4
		}
		System.out.println("최종값 : "+k);; // 최종값 5 (선처리 후증가)
	}
	
	// for문의 변수를 여러개를 사용하여 처리 할 수 있다.
	public void make_two() {
		for (int i=0, j=1; 
			i<5; 
			i++, j++) {
			System.out.println(i+"/"+j);
		}
	}
	
	public void make_three() {
		// 0 1 2 3 4
		for (int i=0; i<5; i++) {
			System.out.printf(i+"\t");
		}
		System.out.println();
		// 4 3 2 1 0
		for (int i=4; i>=0; i--) {
			System.out.printf(i+"\t");
		}
		System.out.println();

		for (int i=0; i<5; i++) {
			System.out.printf((5-1-i)+"\t");
		}
	}
}
