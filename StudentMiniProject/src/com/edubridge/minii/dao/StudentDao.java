package com.edubridge.minii.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.edubridge.minii.database.ConnectionClass;
import com.edubridge.minii.pojo.Student;

public class StudentDao {
	public static boolean insertStudentData(Student s) {
		boolean f=false;
		try {
			
			Connection conn= ConnectionClass.createc();
			String query ="insert into student(name,contact,city) values(?,?,?)";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1, s.getStudentName());
			ps.setString(2, s.getStudentPhone());
			ps.setString(3, s.getStudentCity());
			ps.executeUpdate();
			f=true;
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		return f;
		
	}
	public static boolean updateStudentData(int val,String toUpdate,int id,Student s) {
		boolean f=false;
		try {
			Connection conn= ConnectionClass.createc();
			if(val==1) {
				String query ="update student set name=? where s_id=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				
				ps.executeUpdate();
				f=true;
			}
			else if(val==2) {
				String query ="update student set contact=? where s_id=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				
				ps.executeUpdate();
				f=true;
			}
			else if(val==3){
				String query ="update student set city=? where s_id=?";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setString(1, toUpdate);
				ps.setInt(2, id);
				
				ps.executeUpdate();
				f=true;
			}
			else {
				
			}
		}
		catch(Exception e) {
			
		}
		
		return f;
		
	}
	
	public static boolean deleteStudentData(int userId) {
		boolean f=false;
		try {
			Connection conn = ConnectionClass.createc();
			String query ="delete from student where s_id=?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1, userId);
			
			
			ps.executeUpdate();
			f=true;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static void showAllStudent() {
		boolean f=false;
		try {
			Connection conn = ConnectionClass.createc();
			String query ="select * from student";
			Statement st = conn.createStatement();
			ResultSet rs =st.executeQuery(query);
			while(rs.next()) {
				int id =rs.getInt(1);
				String name = rs.getString(2);
				String phoneNo = rs.getString(3);
				String city =rs.getString(4);
				System.out.println("Student Id : "+id+"\nStudent Name : "+name+"\nStudent Phone No : "+phoneNo+"\nStudent City : "+city+"\n");
			}
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
