<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
    <style>
    body, html {
 
  background-position: center;
  background-repeat: no-repeat;
 /* background-size: 100%;*/
  
  height: 100%;
  width:100%;
}
    </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    
     <body background="resources/images/dino--.jpg" style=" background-position: center;
  background-repeat: no-repeat;
  background-size: cover;" >
        <form method="post" action="check">
        
            <table border="0" width="30%" cellpadding="15">
                <thead>
                    <tr>
                        <th style="margin-left:100px; color:#ff4d4d; margin-top:70px;font-size:150%" colspan="10">Enter Information </th>
                    </tr>
                </thead>
                <tbody>
                    
                        <td style="color:white;font-size:150%;text-indent:40px">User Name</td>
                        <td style="font-size:150%;"><input type="text" name="username" value="" required/></td>
                    </tr>
                    <tr>
                        <td style="color:white;font-size:150%;text-indent:40px">Password</td>
                        <td style="font-size:150%;"><input type="password" name="password" value="" required/></td>
                    </tr>
                    </tbody>
            </table>
           
       
       
        <br><br>
                        <input  style="font-size: 20px;color:black;margin-left:100px" type="submit" value="create" />
                        &nbsp;
                        <input  style="font-size: 20px;color:black;margin-left:100px" type="reset" value="Reset" />
                   <br>
                   <br>
                       
                    
             
                 </form>
    </body>
</html>