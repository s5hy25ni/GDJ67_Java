package com.min.edu;

public class StringMemory {
	public static void main(String[] args) {
		
		String str1 = "Sunny";
		String str2 = new String("Sunny");
		
		// str1은 SP의 위치에 있는 객체를 연결
		// str2는 new의 heap 객체의 위치와 연결되어 있음
		System.out.println("str1 선언 : str2 new를 통해 생성 비교 == : "+(str1==str2));
		
		// equals는 객체의 고유값(hashcode)를 비교합니다.
		// hashcode는 자식 클래스에서 특정 값을 활용하여 새로 재정의 할 수 있습니다.(Override)
		// String 객체는 무조건 사용되는 문자열의 값으로 hashcode가 override 되어 있음
		// 따라서 사용하는 모든 객체는 같은 값이라면 equals는 true를 반환
		System.out.println("부모의 객체 판단 메소드 equals : "+str1.equals(str2));
		
		String str3 = "Smart";
		System.out.println("SP의 Smart 문자열의 hashcode : "+str3.hashCode()); // ==
		System.out.println("SP의 Smart 문자열의 Override 전의 hashcode : "+System.identityHashCode(str3)); // !=
		
		String str4 = new String("Smart");
		System.out.println("heap의 Smart 문자열의 hashcode : "+str4.hashCode());
		System.out.println("heap의 Smart 문자열의 Override 전의 hashcode : "+System.identityHashCode(str4));
		
		// intern 객체가 가지고 있는 문자열을 String Pool 영역까지 추적
		// str3는 SP에 있는 값
		// str4는 new를 통해서 생성했기 때문에 SP의 값의 위치(주소)
		// intern 사용되는 문자열의 SP의 값을 반환해줌
		System.out.println(System.identityHashCode(str3.intern())); 
		System.out.println(System.identityHashCode(str4.intern()));
		System.out.println(str3.intern());
		System.out.println(str4.intern());
		System.out.println("문자열의 선언과 new 객체를 비교할때는 intern을 통해 ==으로 사용이 가능하다 : "+(str3.intern()==str4.intern()));
	}
	
}
