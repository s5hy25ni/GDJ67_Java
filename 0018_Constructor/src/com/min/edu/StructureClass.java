package com.min.edu;

//TODO 003 클래스의 구조와 실행 순서
public class StructureClass {

	// 클래스의 구조
	// !) 멤버필드 : 접근제한자가 있고 메소드 밖에 작성되어있는 변수, 선언만 하면 자동으로 초기화(default값)
		private int age; // instance(class) variable -> new를 통해 사용
		public static String name; // static variable
	// @) 생성자 : 클래스명과 같고 반환타입이 없음, 객체를 생성(new)할 때 단 1회 호출
		public StructureClass() {
			System.out.println("Constructor Block");
		}
	// $) 멤버메소드 : 클래스의 기능을 정의
		public void make(int a) { // int: argument, a: parameter
			for (int i = 0; i < a; i++) { // i: local variable -> 코드블럭이 끝나면 삭제 
				
			}
		}
	// %) 연산블럭 
		{
			System.out.println("Initialization Block");
		}
	// &) static 생성자 : static을 초기화하거나 값을 입력할 때 사용
		static {
			System.out.println("Static Block");
		}
}
