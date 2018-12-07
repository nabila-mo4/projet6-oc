<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
 <%@taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Connexion</title>
	
	
	<link rel="stylesheet"
        href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	
	
	
</head>
<body >

<s:include value="/menu.jsp"></s:include>

  
	   <br> <br>
	
	<div class="container" style="padding-top:80px">
    	<div class="row">
			<div class="col-md-offset-3 col-md-6 col-md-offset-3">
				<div class="panel panel-login" style="border-color: #ccc;-webkit-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);-moz-box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);box-shadow: 0px 2px 3px 0px rgba(0,0,0,0.2);" >
					<div class="panel-heading" style="color: #00415d;background-color: #fff;border-color: #fff;text-align:center;" >
						
							<h3> SE CONNECTER </h3>
						
						<hr>
					</div>
			
                    
					<div class="panel-body">
						<div class="row">
							<div class="col-md-12">
							
     							<s:form  method="post" action="login"> 
					     		
					     		
								   <h4 style="text-align:center;"> Saisissez votre adresse email et votre mot de passe:</h4>
								           					          
					            
					             
					             
					       			<div class="form-group">
										<s:textfield name="email" label="Adresse mail" type="text" tabindex="1" class="form-control" placeholder="Adresse mail" style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;"/>
					       			</div>
					       			
					       			<div class="form-group">
										<s:password name="mdp" label="Mot de passe" type="text" tabindex="1" class="form-control" placeholder="Mot de passe" style="height: 45px;border: 1px solid #ddd;font-size: 16px;-webkit-transition: all 0.1s linear;-moz-transition: all 0.1s linear;transition: all 0.1s linear;"/>
					       			</div>
					       			
					       			
					       			
					       			<div class="col-md-offset-5 col-md-7">
					       			<div class="form-group">
										<div class="row">
											
												<s:submit  name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="SE CONNECTER" style="background-color: #007bff; outline: none;color: #fff;font-size: 14px;height: auto;font-weight: normal;padding: 14px 0;text-transform: uppercase;border-color: #007bff ;" />
											
										</div>
								    </div>
								    </div>
								 
					          </s:form>
					       </div>
					    </div>
					</div>
			    </div>
			</div>
	    </div>
	  </div>	
		<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
		
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script> 
		
    </body>
</html>

