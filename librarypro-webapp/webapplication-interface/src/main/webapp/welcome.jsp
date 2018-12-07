<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"   isELIgnored="false"%>
<%@taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html> 
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Mon tableau de bord</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'/>
</head>
    
	
    <body style="padding-top: 100px;">
    <s:include value="/menu.jsp"></s:include>
    
     <div class="alert alert-success"
     style="margin-right: 382px; margin-left: 382px"> <s:property value="message1"></s:property>
    <button color="red" aria-hidden="true" data-dismiss="alert" class="close" type="button">×</button></div>
   
    
    <div class="container">
	<div class="row">
	  
	  
	<div class="container" style="padding-top: 20px">
    		<div class="row">
    			<div class="col-md-12">
					<div class="panel panel-default panel-table">
              			<div class="panel-heading" style="background-color= white;padding:10px 15px;border-bottom:1px solid transparent;border-top-left-radius:3px;border-top-right-radius:3px">
                			<div class="row">
                  				<div class="col-md-12 text-center">
                    				<h2 class="panel-title" style=" margin-top:0;margin-bottom:0;font-size:20px;color:inherit">Mon tableau de bord</h2>
                  				</div>
                  				
                  			</div>
                		</div>
              		</div>
			 		    <br> 
              			<div class="panel-body" style="padding:0;">
               				 <table class="table table-striped table-bordered table-list">
                  					<thead>
                    						<tr >
                       							 <th class="text-center">Action</th>
                       							 <th>Identifiant </th>
                       							 <th>Date debut</th>
                        						 <th> Date fin </th>
												 <th>Date retour </th>
												  <th> Etat</th>
												  <th> Prolongation</th>
												 
                  							</tr> 
                 				    </thead>
                  					<tbody>
                  						<s:iterator value="prets">
                  						
                  						
                         					 <tr>
                            					 
                           						<th class="text-center">Action</th>
                            				    
                          					     <td ><s:property value="idemprunt"></s:property></td>
                          					     <td ><s:property value="datedebut"></s:property></td>
                          					     <td ><s:property value="datefin"></s:property></td>
                          					     <td ><s:property value="dateretour"></s:property></td>
                          					     
                          					     <s:if test="%{encours==true}">
									               <td>En cours</td>
								                 </s:if>
								                 <s:else>
								                      	<td>Rendu</td>
								                 </s:else>
								
                          					     <s:if test="%{prolonge1==false}">
									              <td><s:url action="prolonger" var="prolong">
									                   <s:param name="idemprunt"><s:property value="idemprunt" /></s:param>
								                     </s:url>
								                       
								                     <a href="${prolong}">Prolonger</a>
							                     </td>
							                  	</s:if>
							                  	<s:else>
							                 		<td>Impossible de prolonger</td>
							                	</s:else>
                          					   
                          					  
                          					</tr>
                          				</s:iterator>
                     			    </tbody>
               			 </table>
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
