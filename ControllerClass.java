package com.Controllers;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.DAO.DAOClasses;


@Controller
public class ControllerClass 
{
	@RequestMapping("/register")
	public String studentdetails(HttpServletRequest req,Model model) throws ClassNotFoundException, SQLException	
	{
	  DAOClasses dao=new  DAOClasses();
	  String ID=req.getParameter("id");
	  String Name=req.getParameter("name");
	  String Branch=req.getParameter("branch");
	  String Contact=req.getParameter("contact");
	  String Email=req.getParameter("email"); 
	  String UserName=req.getParameter("uname");
	  String Password=req.getParameter("pswd");
	  
	  dao.createAccount(ID, Name, Branch, Contact, Email, UserName, Password);
	  
	  return "Login";
	  
  }
	@RequestMapping("/reg")
	public String register() throws ClassNotFoundException, SQLException	
	{
  
	  return "Registration";
	  
  }
	@RequestMapping("/log")
	public String login()throws ClassNotFoundException, SQLException
	{
		return "Login";
	}
	
	@RequestMapping("/home")
	public String homePage()throws ClassNotFoundException, SQLException
	{
		return "Home";
	}
	@RequestMapping("/login")
	  public String showLoginpage(Model model,HttpServletRequest req) throws ClassNotFoundException, SQLException
	  {
		DAOClasses dao = new DAOClasses();
		 String UserName=req.getParameter("uname");
		  String Password=req.getParameter("pswd");
		 //System.out.println(UserName+"&" +Password);
		 
		  String result=dao.check(UserName, Password);
		
		if(result.equals("success")) 
		{
		  return "";
	      }
	 else 
	    {
		   return "Login1";
		 }

	  }
}