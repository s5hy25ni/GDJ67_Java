package com.comeon.cardgame.function;
import com.comeon.cardgame.tool.Player;
import com.comeon.cardgame.tool.Room;

public class Dealer {
	
	private static Dealer dealer;	
	private Room room;
	
	private Dealer() {
		
	}
	
	public static Dealer getInstance() {
		if(dealer==null) {
			dealer = new Dealer();
		}
		return dealer;
	}
	
	public void createRoom(int intMode) {
		String strMode = modeToStr(intMode);
		room = new Room(strMode);
	}

	private String modeToStr(int intMode) {
		String strMode = switch (intMode) {
		case 2-> "하이바둑이";
		case 3->"리버스바둑이";
		default ->"로우바둑이";
		};
		return strMode;
	}
	
	public void addUser(Player player) {
		room.getPlayers().add(player);
	}

	public Room getRoom() {
		return room;
	}

}