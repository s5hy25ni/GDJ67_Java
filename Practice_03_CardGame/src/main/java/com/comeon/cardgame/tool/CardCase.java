package com.comeon.cardgame.tool;

import java.util.ArrayList;
import java.util.List;

public class CardCase {

	private List<CardOne> cardcase;
	
	public CardCase() {
		cardcase = new ArrayList<CardOne>();
		make();
	}
	
	private void make() {
		int cnt = 0;
		while(true) {
			CardOne card = new CardOne();
			if(!cardcase.contains(card)) {
				cardcase.add(card);
				cnt++;
			}
<<<<<<< HEAD
			if(cnt==CardOne.Number.values().length*CardOne.Shape.values().length) {
=======
			if(cnt==CardOne.Shape.values().length*CardOne.Number.values().length) {
>>>>>>> 0ad468095c728e85eb6a4f918b51621066455270
				break;
			}
		}
	}

	public List<CardOne> getCardcase() {
		return cardcase;
	}

}
