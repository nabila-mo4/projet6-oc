<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
        <!-- <link type="text/css" rel="stylesheet" href="<c:url value="/css/listestyle.css"></c:url>" /> -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'/>
</head>
<body>
<s:include value="/menu.jsp"></s:include>
<body style="padding-top: 100px;">


<s:if test="%{list.size()==1}">

<div class="alert alert-danger"
     style="margin-right: 382px; margin-left: 382px"> Vous avez déjà reservé cet ouvrage 
    <button aria-hidden="true" data-dismiss="alert" class="close" type="button">×</button></div>

</s:if>

<s:else>

<div class="alert alert-success"
     style="margin-right: 382px; margin-left: 382px"> Vous venez de réserver cet ouvrage 
    <button aria-hidden="true" data-dismiss="alert" class="close" type="button">×</button></div>
</s:else>


<div class="container" style="padding-top: 20px">
<div class="panel-body" style="padding:0;">
               				 <table class="table table-striped table-bordered table-list">
                  					<thead>
                    						<tr >
                       							 
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
												
                  							</tr> 
                 				    </thead>
                  					<tbody>
                  						
                  						
                  						
                  						
                         					 <tr>
                            					 
                            				     <td ><s:property value="idouvrage"></s:property></td>
                          					     <td ><s:property value="o.isbn"></s:property></td>
                          					     <td ><s:property value="o.auteur.idauteur"></s:property></td>
                          					     <td ><s:property value="o.titre"></s:property></td>
                          					     <td ><s:property value="o.langue"></s:property></td>
                          					     <td ><s:property value="o.domaine"/></td>
                          					     <td ><s:property value="o.editeur"></s:property></td>
                          					     
                          					     <td ><s:date name="o.datepublication.toGregorianCalendar()"
										         format="dd/MM/yyyy"></s:date></td>
                          					     <td ><s:property value="o.nbpages"></s:property></td>
                          					     <td ><s:property value="o.nbtotal"></s:property></td>
                          					     
                          					     <td>
									                <s:if test="%{list.size()==0}"> Réservé</s:if> 
									                 <s:else> Déjà réservé </s:else>
								                </td>
								              
                          					</tr>
                          				
                     			    </tbody>
               			 </table>
             	   </div>
				</div>				                


<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script> 
</body>
</html>