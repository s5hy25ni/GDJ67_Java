package com.comeon.cardgame.tool;

import java.util.Objects;

public class CardOne {

	private String one;
	
	public static enum Shape {
<<<<<<< HEAD
=======
		
>>>>>>> 0ad468095c728e85eb6a4f918b51621066455270
		CLOVER("♣"), HEART("♥"), DIAMOND("◆"), SPACE("♠");
		
		public String value;
		private Shape(String s) {
<<<<<<< HEAD
			value = s;
=======
			value  = s;
		}
	}
	
	public static enum Number {
		
		A("A"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), J("J"), Q("Q"), K("K");
		
		public String value;
		private Number(String n) {
			value  = n;
>>>>>>> 0ad468095c728e85eb6a4f918b51621066455270
		}
	}
	
	public static enum Number {
		ONE("A"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"),  EIGHT("8"), NINE("9"), TEN("10"), ELEVEN("J"), TWELVE("Q"), THIRTEEN("K");
		
		public String value;
		private Number(String n) {
			value = n;
		}
	}

	public CardOne() {
<<<<<<< HEAD
		int s = (int)(Math.random()*Shape.values().length);
		int n = (int)(Math.random()*Number.values().length);
		one = Shape.values()[s].value +Number.values()[n].value;
=======
		Shape[] shape = Shape.values();
		Number[] number = Number.values();
		int s = (int)(Math.random()*shape.length);
		int n = (int)(Math.random()*number.length);
		
		one = shape[s].value+number[n].value;
>>>>>>> 0ad468095c728e85eb6a4f918b51621066455270
	}

	public String getOne() {
		return one;
	}

	@Override
	public int hashCode() {
		return Objects.hash(one);
	}

	@Override
	public boolean equals(Object obj) {
		boolean isc = false;
		CardOne other = (CardOne) obj;
		if(one.equals(other.getOne())) {
			isc = true;
		}
		
		return isc;
	}

}
