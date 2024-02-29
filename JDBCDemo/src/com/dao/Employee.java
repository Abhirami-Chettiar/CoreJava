package com.dao;
import java.sql.*;
public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/Management";
		String username ="root";
		String password = "root";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement stmt = con.createStatement();
//		int empId1 = 107;
//		String empName1 = "BALAJI";
//		int empAge1 = 20;
//		
//		String sql1 = "insert into employee values("+empId1+",'"+empName1+"',"+empAge1+")";
//		stmt.executeUpdate(sql1);
		
//		String sql2 = "update employee set NAME ='ABHI' where E_ID =107";
//		stmt.execute(sql2);
		String sql = "select * from employee";
		
		String delete ="delete from employee where E_ID=107;";
		stmt.execute(delete);
		ResultSet result = stmt.executeQuery(sql);
		while(result.next()) {
			int empId = result.getInt("E_ID");
			String empName = result.getString("NAME");
			int empAge = result.getInt("AGE");
			System.out.println("Employee ID : "+ empId +"\nEmployee Name : "+empName+"\nEmployee Age : "+empAge);

			
		}

	}

}
