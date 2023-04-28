package com.coffee.method;

public class Print {
	Util util = new Util();
	Menu menu = new Menu();
	
	// 메뉴판을 출력하는 메소드
	void printMenu(){
		System.out.println("┌------------------------------┐");
		System.out.println();
		System.out.println(" [1]	아메리카노 		1,500원");
		System.out.println(" [2]	카페 라떼 		2,000원");
		System.out.println(" [3]	바닐라 라떼 	2,500원");
		System.out.println();
		System.out.println("└------------------------------┘");
	} // printMenu()
	
	// 주문을 확인하는 메소드이다.
	void confirm(int num, int cup){
		/*
		 *  현재 선택한 메뉴의 이름 = Comm.returnName(num)
		 *  현재 선택한 수량 = cup
		 *  현재까지 총 입금액 - 현재까지 총 지불액 = Comm.chargeCal() 
		 */
		System.out.printf(" ▷ %s %d잔 주문하셨습니다.\n", menu.returnName(num), cup);
		System.out.printf(" ▷ 잔액 : %d원\n", Money.chargeCal());
	 } // confirm()
	
	// 추가 입금 여부를 출력하는 메소드
	void addPayment(int where) {
		int num = 0;
		int money = 0;
		
		System.out.println("┌------------------------------┐");
		System.out.println();
		System.out.println("	[1] 추가 입금");
		if(where==0) {
			System.out.println("	[2] 다른 메뉴 선택");
		} else if(where==1) {
			System.out.println("	[2] 다른 수량 입력");
		}
		System.out.println();
		System.out.println("└------------------------------┘");
		System.out.printf(" ▶ 번호를 입력해주세요 : ");
		
		while(true) {
			num = util.inputIntValue();
			if(num == 1) {
				System.out.printf(" ▶ 입금해주세요 : ");
				money = util.inputIntValue();
				if(money<0) {
					System.out.println(" ▷ 0원 이상 입금가능합니다.");
				}
				DTO.totalMoney += money;
				break;
			} else if(num == 2) {
				break;
			} else {
				System.out.println(" ▷ 1 또는 2만 입력해주세요.");
			}
		}
	}
	
	// 추가 주문 여부를 출력하는 메소드
	int endOrNot() {
		int num = 0;
		System.out.println("┌------------------------------┐");
		System.out.println();
		System.out.println("	[1] 추가 주문");
		System.out.println("	[2] 영수증 출력 종료");
		System.out.println("	[3] 영수증 미출력 종료");
		System.out.println();
		System.out.println("└------------------------------┘");
		
		while(true) {
			System.out.print(" ▶ 번호를 입력해주세요 : ");
			num = util.inputIntValue();
			if(num>0 && num <4) {
				break;
			} else {
				System.out.println("▷ 1 ~ 3만 입력해주세요.");
			}
		}
		
		return num;
	}
	
	// 영수증을 출력
	void printBill() {
		
	}
}
