package com.hello.v_academy__.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	static String u_name="";
	static String u_id="";
	@RequestMapping(value="/")
	public ModelAndView test() throws IOException
	{
		return new ModelAndView("index");
	}
	
	@RequestMapping("/register")
    public ModelAndView register()
	{
    return new ModelAndView("register");
    }
	
	@RequestMapping("/check")
    public ModelAndView check(HttpServletRequest req, HttpServletResponse res) {
    try{
       String username =req.getParameter("username");  
       String password = req.getParameter("password");
       u_name=username;
       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
       Connection conn=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/logins","root","#af9444995454");
       
       PreparedStatement pst = conn.prepareStatement("Select user_name,password from logins.login_details");
       ResultSet rs = pst.executeQuery();
     
       while(rs.next()){
        if (rs.getString("user_name").equals(username)){
       
        return new ModelAndView("user_exists");
        }
       
       }
       pst = conn.prepareStatement("insert into logins.login_details(user_name,password)values (?,?)");
       pst.setString(1, username);
       pst.setString(2, password);
       int n=pst.executeUpdate();
       }
       
   
       catch (Exception e) {
    	   System.out.print(e);
       }
    	   return new ModelAndView("success_register");
	
}
   
	@RequestMapping("/validate")
	public ModelAndView test(HttpServletRequest req , HttpServletResponse res) throws IOException{
	try{
	       String username = req.getParameter("username");  
	       String password = req.getParameter("password");
	       // System.out.println(username);
	       //System.out.println(password);
	       u_name=username;
	       Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
	       Connection conn=DriverManager.getConnection(  
	        "jdbc:mysql://localhost:3306/logins","root","#af9444995454");      
	       PreparedStatement pst = conn.prepareStatement("Select user_name,password from logins.login_details where user_name=? and password=?");
	       pst.setString(1, username);
	       pst.setString(2, password);
	       ResultSet rs = pst.executeQuery();    
	       
	       if(rs.next()) {
	        return new ModelAndView("welcome");
	       }
	       
	       else {
	    	   
	           return new ModelAndView("invalid_user");
	           
	       }
	  }
	  catch(Exception e){      
	  System.out.print(e);
	  
	  return new ModelAndView("invalid_user");
	       
	  }
	}
	@RequestMapping("/course1_disc")
    public ModelAndView course1_disc()
	{
    return new ModelAndView("course1_disc");
    }
	
	@RequestMapping("/plus_one")
    public ModelAndView plus_one(HttpServletRequest req , HttpServletResponse res)
	{
    try {
    Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
    Connection conn=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/logins","root","#af9444995454"); 
    System.out.println(u_name);
    PreparedStatement pst = conn.prepareStatement("select active_course from login_details where user_name=?");
    pst.setString(1, u_name);
    ResultSet rs = pst.executeQuery();  
    if(rs!=null)
    {
    	System.out.println("its not empty");
    }
   while(rs.next())
   {
	   System.out.println(rs.getInt("active_course"));
   }
     }
    catch (Exception ex)
    {
    	
    }
    return new ModelAndView("welcome_course1");
    }
	}
	

