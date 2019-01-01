<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"   isELIgnored="false"%>
<%@taglib prefix="s" uri="/struts-tags" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html> 
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Liste des ouvrages</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'/>
</head>
    
	<s:include value="/menu.jsp"></s:include>
    <body style="padding-top: 100px;">
    
    <div class="container">
	<div class="row">
	  
	
	  
     	
		<div class="col-md-12">
            <div class="input-group" id="adv-search" style=" width: 500px; margin: 0 auto;">
                <input type="text" name="ouvrageTitre" class="form-control" placeholder="Recherche avancée d'un ouvrage" />
                <div class="input-group-btn">
                    <div class="btn-group" role="group" style=" display: flex !important;">
                        <div class="dropdown dropdown-lg" style="position: static !important;">
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false" style="border-radius: 0;
                            margin-left: -1px; padding: 14px 12px;" ><span class="caret"></span></button>
                            <div class="dropdown-menu dropdown-menu-right" style="margin-top: -1px; padding: 6px 20px;min-width: 500px;" role="menu">
                              
                                <s:form class="form-horizontal" method="post" action="recherchesaveouvrage">
                                  
                                  <div class="form-group" style=" margin-left: 0; margin-right: 0;">
                                    <label for="contain">Titre</label>
                                    <input class="form-control" name="ouvrageTitre" style=" border-top-left-radius: 4px; border-bottom-left-radius: 4px;" type="text" />
                                  </div>
                                 
                                  <button type="submit" class="btn btn-primary" style="background-color: #007bff; border-color: #007bff"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                </s:form>
                                
                                <s:form class="form-horizontal" method="post" action="rechercheouvrageauteur">
                                  
                                  <div class="form-group" style=" margin-left: 0; margin-right: 0;">
                                    <label for="contain">Auteur</label>
                                    <input class="form-control" name="auteur" style=" border-top-left-radius: 4px; border-bottom-left-radius: 4px;" type="text" />
                                  </div>
                                 
                                  <button type="submit" class="btn btn-primary" style="background-color: #007bff; border-color: #007bff"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                </s:form>
                                
                               
                            </div>
                           
                        </div>
                         
                  
                    </div>
                </div>
                  
            </div>
          </div>
         
        </div>
       
	</div>
	


	<div class="container" style="padding-top: 20px">
    		<div class="row">
    			<div class="col-md-12">
					<div class="panel panel-default panel-table">
              			<div class="panel-heading" style="background-color= white;padding:10px 15px;border-bottom:1px solid transparent;border-top-left-radius:3px;border-top-right-radius:3px">
                			<div class="row">
                  				<div class="col-md-12 text-center">
                    				<h2 class="panel-title" style=" margin-top:0;margin-bottom:0;font-size:20px;color:inherit">LA LISTE DES OUVRAGES</h2>
                  				</div>
                  				<div class="row">
                  					
                    				<a href="<s:url action="listeouvrage"/>" class="btn btn-sm btn-primary" style="margin-left: 700px; color: #fff;background-color: #007bff;border-color: #007bff; ">Voir la liste de tous les ouvrages</a></div>
                    				
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
                       							 <th>idouvrage</th>
                       							 <th>ISBN </th>
                       							 <th>Auteur</th>
                        						 <th> Titre </th>
												 <th>Langue </th>
												  <th> Domaine</th>
												  <th> Editeur</th>
												  <th>Date de publication </th>
												  <th> Nombre de pages</th>
												  <th>Nombre total </th>
												  <th>Etat </th>
												  <th>Action</th>
												  
												
												 
                  							</tr> 
                 				    </thead>
                  					<tbody>
                  						<s:iterator value="ouvrages">
                  						
                  						
                  						
                         					 <tr>
                            					 <td align="center">
                            					  
                            					 
                            					 <s:url action="viewOuvrage" var="urlTag" >
                                                     <s:param name="idouvrage"><s:property value="idouvrage"></s:property></s:param>
                                                 </s:url>
                                                      <a href="<s:property value="#urlTag" />" 
                                                      class="btn btn-primary" style="color: #fff;background-color: #007bff;border-color: #007bff;">
                                                      <em class="fa fa-eye"></em>
                                                      </a>
                           						 </td>
                           						
                            				     <td ><s:property value="idouvrage"></s:property></td>
                          					     <td ><s:property value="isbn"></s:property></td>
                          					     <td ><s:property value="auteur.idauteur"></s:property></td>
                          					     <td ><s:property value="titre"></s:property></td>
                          					     <td ><s:property value="langue"></s:property></td>
                          					     <td ><s:property value="domaine"/></td>
                          					     <td ><s:property value="editeur"></s:property></td>
                          					     
                          					     <td ><s:date name="datepublication.toGregorianCalendar()"
										         format="dd/MM/yyyy"></s:date></td>
                          					     <td ><s:property value="nbpages"></s:property></td>
                          					     <td ><s:property value="nbtotal"></s:property></td>
                          					     
                          					     <td>
									                 <s:if test="%{etat==false}"> Indisponible</s:if> 
									                 <s:else> Disponible </s:else>
								                </td>
								                
								                
								                <td>
								                <s:if test="%{etat==false}">
								                
								                <s:url action="reserver.action" var="urlReservation" >
                                                     <s:param name="idouvrage"><s:property value="idouvrage"></s:property></s:param>
                                                     
                                                 </s:url>
                                                      <a href="<s:property value="#urlReservation" />" 
                                                      class="btn btn-primary" style="color: #fff;background-color: #007bff;border-color: #007bff;">
                                                      Réserver
                                                      
                                                      </a>
                                                
                                                </s:if>
                                               
                                                <s:else>Non réservable</s:else>
								                </td>
								                
                          					  
                          					</tr>
                          				</s:iterator>
                          				
                          				<s:iterator value="ouvrages">
                          				<s:property value="ouvrages.size()"></s:property>
                          				</s:iterator>
                          				
                     			    </tbody>
               			 </table>
             	   </div>
            	</div>
			</div>
		</div>
	
<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script> 
	
</body>
</html>
