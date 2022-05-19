package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.DTO.DTOClass;

public class DAOClasses
{
	String url="jdbc:mysql://localhost:3306/new";
	String username="root";
	String password="Lokita@306";
	Connection con;
	
	public String createAccount(String ID, String Name, String Branch, String Contact, String Email,String UserName,String Password)  throws ClassNotFoundException, SQLException
	{
		try 
		  {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   con= DriverManager.getConnection(url, username, password);
		   PreparedStatement ps= con.prepareStatement("INSERT INTO user_details(Reg_ID,Student_Name, Branch,Contact,Email,userName,passWord) VALUES(?,?,?,?,?,?,?)");
		   ps.setString(1,ID);
		   ps.setString(2,Name);
	        ps.setString(3,Branch);
	        ps.setString(4,Contact);
	        ps.setString(5,Email);
	        ps.setString(6, UserName);
	        ps.setString(7,Password);
	        
	        ps.executeUpdate();
	      }
		catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	return "Submit Student From";
}
	public String check(String UserName,String Password) throws ClassNotFoundException, SQLException
	{
		String result=" ";
		 try 
		  {
			 int count=0;
		   Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con= DriverManager.getConnection(url, username, password);
		   Statement st=con.createStatement();
		   ResultSet rs = st.executeQuery("SELECT passWord FROM user_details WHERE userName='" + UserName + "'");
		 //  PreparedStatement ps= con.prepareStatement("Select count(*) from user_details where userName=? and passWord=?");
		   	
		  /* ps.setString(1, UserName);
		   ps.setString(2, Password);

		 count = ps.executeUpdate();
		 if(count>0 )
		 { 
				result = "success";
			 }
		 else { 
			 result = "Fail";
		 }
		} */
		  
	   for(; rs.next();)
		   {
				password = rs.getString(7);
			if (password.equals(Password)) {
				result = "success";
			} else {
				result = "Fail";
			}
		  }
		  } 
		 catch (SQLException e) 
	       {
			e.printStackTrace();
		    }
		 return result ;
}	
	public List<DTOClass> selectAllStudent() throws ClassNotFoundException,SQLException
	{
		List<DTOClass> list= new ArrayList<DTOClass>();
		try 
		  {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con= DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		   ResultSet rs= st.executeQuery("SELECT * From user_details");
		   while(rs.next())
		   {
			   DTOClass stud = new DTOClass();
			    stud.setId(rs.getString(1));
			    stud.setName(rs.getString(2));
			    stud.setBranch(rs.getString(3));
			    stud.setContact(rs.getString(4));
			    stud.setEmail(rs.getString(5));
			 list.add(stud);
	        }
		   con.close();
		  }
		   catch (SQLException e) 
	       {
			e.printStackTrace();
		    } 
		return list;
   }
}