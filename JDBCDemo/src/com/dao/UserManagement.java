package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class UserManagement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/feb28";
		String username="root";
		String password ="root";
		Connection con = DriverManager.getConnection(url,username,password);
		String sql ="insert into user (u_id,name,city) values(?,?,?)";
//		PreparedStatement ps =con.prepareStatement(sql);
//		ps.setInt(1, 1001);
//		ps.setString(2, "Abhirami");
//		ps.setString(3,"Ambernath");
//		int i = ps.executeUpdate();		
//		System.out.println("Data inserted successfully \n "+i+" number of rows updates");
		
		CallableStatement  cs = (CallableStatement) con.prepareCall(sql);
		cs.setInt(1, 1002);
		cs.setString(2, "Saniya");
		cs.setString(3,"Kalyan");
		int i1 = cs.executeUpdate();		
		System.out.println("Data inserted successfully \n "+i1+" number of rows updates");

	}

}
