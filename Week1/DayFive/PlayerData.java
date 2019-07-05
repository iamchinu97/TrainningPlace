package com.sapient.week1.day5;

import java.sql.ResultSet;
import java.util.List;

public class PlayerData {
	public static void main(String[] args) throws Exception  {
		CricketDAO cric= new CricketDAO();
		List<PlayerBean>players=cric.getPlayers();
		for(PlayerBean player: players)
		{
			System.out.println(player);
		}
		List<PlayerBean>player=cric.getAnyPlayer("P001");
		System.out.println(player);
		//System.out.println(cric.insertPlayer("P002", "Mahendrasingh", "Dhoni", 7));
		//System.out.println(cric.deletePlayer("P002"));
		ResultSet result = cric.joinPlayer();
		while(result.next())
		{
			System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getInt(3));
		}
	}
}
