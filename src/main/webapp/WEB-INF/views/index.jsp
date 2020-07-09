<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Example</title>
        <style>
body, html {
 
  background-position: center;
  background-repeat: no-repeat;
 /* background-size: 100%;*/
  
  height: 100%;
  width:100%;
}
</style>
    </head>
   
   <body background="resources/images/dino--.jpg" style=" background-position: center;
  background-repeat: no-repeat;
  background-size: cover;" >
  <a href="register"><button style="margin-top:50px;margin-left:600px;font-size: 20px;color:black">sign in</button></a>
      <p style="margin-left:100px; color:#ff4d4d;font-size:150%; margin-top:30px;font-size:150%">Login </p>
        
        <form method="post" action="validate">
            
            <br>
            <table border="0" width="30%" cellpadding="20">
                <thead>
                    <tr>
                       
                    </tr>
                </thead>
               
                <tbody>
                    <tr>
                        <td style="color:white;font-size:150%;text-indent:40px">Username</td>
                        <td style="font-size:150%;"><input  type="text" name="username" value="" required/></td>
                    </tr>
                    <tr>
                        <td style="color:white;font-size:150%;text-indent:40px">Password</td>
                        <td style="font-size:150%;" ><input type="password" name="password" value="" required /></td>
                    </tr>
                    <tr>
                    	<td></td>
                    	<td style="font-size: 20px;color:white;text-indent:40px"><input type=submit value=Submit></td>
                    </tr>
                    </tbody>
            </table>
         
        </form>
       

                   
    </body>
</html>