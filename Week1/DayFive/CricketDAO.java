package com.sapient.week1.day5;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CricketDAO {
	public List<PlayerBean> getPlayers() throws Exception
	{
		final String query="select player_id,firstname,lastname,jersey_no from players"; 
		Connection conn= DBConnect.getConnection();
		PreparedStatement stmt= conn.prepareStatement(query);
		List<PlayerBean> list= new ArrayList<PlayerBean>();
		ResultSet result= stmt.executeQuery();
		PlayerBean player;
		while(result.next())
		{
			player= new PlayerBean(result.getString(1),result.getString(2),result.getString(3),result.getInt(4));
			list.add(player);
		}
		return list; 
	}
	public List<PlayerBean> getAnyPlayer(String id) throws Exception
	{
		final String query="select player_id,firstname,lastname,jersey_no from players where player_id = ?";
		Connection conn= DBConnect.getConnection();
		PreparedStatement stmt= conn.prepareStatement(query);
		stmt.setString(1, id);
		List<PlayerBean> list= new ArrayList<PlayerBean>();
		ResultSet result= stmt.executeQuery();
		PlayerBean player;
		while(result.next())
		{
			player= new PlayerBean(result.getString(1),result.getString(2),result.getString(3),result.getInt(4));
			list.add(player);
		}
		return list; 
	}
	public String insertPlayer(String id,String firstname, String lastname,int jersey_no) throws Exception
	{
		final String query="insert into players(player_id,firstname,lastname,jersey_no) values (?,?,?,?)";
		Connection conn= DBConnect.getConnection();
		PreparedStatement stmt= conn.prepareStatement(query);
		stmt.setString(1, id);
		stmt.setString(2, firstname);
		stmt.setString(3, lastname);
		stmt.setInt(4, jersey_no);
		ResultSet result= stmt.executeQuery();
		System.out.println(result);
		return "Successfully inserted player";
	}
	public String deletePlayer(String id) throws Exception
	{
		final String query="delete from players where player_id=?";
		Connection conn= DBConnect.getConnection();
		PreparedStatement stmt= conn.prepareStatement(query);
		stmt.setString(1, id);
		ResultSet result= stmt.executeQuery();
		System.out.println(result);
		return "Successful Delete";
	}
	public ResultSet joinPlayer() throws Exception
	{
		final String query="select firstname,lastname,runs from players,stats where players.player_id=stats.stats_player_id";
		Connection conn= DBConnect.getConnection();
		PreparedStatement stmt= conn.prepareStatement(query);
		ResultSet result= stmt.executeQuery();
		return result;
	}
	public String updatePlayer() throws Exception
	{

		Connection conn= DBConnect.getConnection();
		final String query="update players set firstname=?,lastname=?,jersey_no=? where player_id=?";
		final String extract="select * from players";
		PreparedStatement stmt= conn.prepareStatement(query);
		ResultSet result= stmt.executeQuery();
		System.out.println("Which field to update");
		System.out.println("1.firstname");
		System.out.println("2.lastname");
		System.out.println("3.Jersey number");
		PreparedStatement pstmt= conn.prepareStatement(query);
		pstmt.executeQuery();
		return "Update successfull";
	}
}
