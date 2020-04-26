package com.nci.restpractice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class AlienRepository {
	
	Connection con = null;
	
	public AlienRepository() {
		
		String url = "jdbc:mysql://localhost:3306/restdb";
		String username = "root";
		String password = "ilovemyself";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	public List<Alien> getAliens(){
		List<Alien> aliens = new ArrayList<>();
		String sql = "select * from alien";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				Alien a = new Alien();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
				
				aliens.add(a);
				
			}
		
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return aliens;
	}
	
	
	public Alien getAlien(int id) {
		
		String sql = "select * from alien where id = "+id;
		Alien a = new Alien();

		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setPoints(rs.getInt(3));
							
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return a;
	}


	public void createAlien(Alien a) {
		// TODO Auto-generated method stub
		String sql = "insert into alien values (?,?,?)";

		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, a.getId());
			st.setString(2, a.getName());
			st.setInt(3, a.getPoints());
			st.executeUpdate();

		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	public void updateAlien(Alien a) {
		// TODO Auto-generated method stub
		String sql = "update alien set name = ? , points = ? where id = ?";

		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, a.getName());
			st.setInt(2, a.getPoints());
			st.setInt(3, a.getId());
			st.executeUpdate();

		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void delete(int id) {
		String sql = "delete from alien where id = ?";

		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();

		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
}
