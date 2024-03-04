package com.edubridge.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton {
	private static JDBCSingleton jdbc;
	private JDBCSingleton() {
		
	}
	public static JDBCSingleton getInstance() {
		if( jdbc == null){
			jdbc = new JDBCSingleton();
		}
		return jdbc;
	}
	private static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/march4","root","root");
		return conn;
		
		
	}
	public int insert(String uname,String passwd,int id) throws SQLException {
		Connection c =null;
		PreparedStatement ps =null;
		int recordCounter =0;
		try {
			c=this.getConnection();
			ps =c.prepareStatement("insert into employee(eid,ename,epass) values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, uname);
			ps.setString(3, passwd);
			recordCounter = ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ps!=null) {
				ps.close();
			}
			if(c!=null) {
				c.close();
			}
		}
		
		return recordCounter;
		
	}
	public void view() throws SQLException {
		Connection c=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			c=this.getConnection();
			ps =c.prepareStatement("select * from employee");
			rs =  ps.executeQuery();
			while(rs.next()) {
				System.out.println("Id : "+rs.getInt(1)+"\nName : "+rs.getString(2)+"\nPassword : "+rs.getString(3));
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ps!=null) {
				ps.close();
			}
			if(c!=null) {
				c.close();
			}
		}
		
	}
	public int update(int id,String password) throws SQLException {
		Connection c =null;
		PreparedStatement ps =null;
		int recordCounter =0;
		try {
			c=this.getConnection();
			ps =c.prepareStatement("update employee set epass =? where eid =?");
			ps.setString(1, password);
			ps.setInt(2, id);
			
			
			recordCounter = ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ps!=null) {
				ps.close();
			}
			if(c!=null) {
				c.close();
			}
		}
		return recordCounter;
		
	}
	public int delete(int id) throws SQLException {
		Connection c =null;
		PreparedStatement ps =null;
		int recordCounter =0;
		try {
			c=this.getConnection();
			ps =c.prepareStatement("delete from employee where eid=?");
			
			ps.setInt(1, id);
			
			
			recordCounter = ps.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ps!=null) {
				ps.close();
			}
			if(c!=null) {
				c.close();
			}
		}
		return recordCounter;
		
	}


}
