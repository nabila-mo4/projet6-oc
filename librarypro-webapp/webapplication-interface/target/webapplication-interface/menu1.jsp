<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
  


<nav class="navbar navbar-inverse navbar-fixed-top" style="min-height:70px;">
  <div class="container">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false" style="margin-top:18px;">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      
    </div>
    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse " id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      
    

         <s:url action="listeouvrage.action" var="liste"/>
         
        <li><a href="<s:property value="#liste" />" style="color:#BBB; padding-top:25px; padding-bottom:25px; font-size:16px;" >ACCUEIL </a></li>
        
        
         
         <s:url action="pret.action" var="pret"/>
        <li><a href="<s:property value="#pret" />" style="color:#BBB; padding-top:25px; padding-bottom:25px; font-size:16px;" >MON TABLEAU DE BORD </a></li>
        
       
		<li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color:#BBB; padding-top:25px; padding-bottom:25px; font-size:16px;">MON COMPTE <span class="caret"></span></a>
          <ul class="dropdown-menu" style="background-color:#333; border-top:3px solid #007bff; min-width:200px;">
            
          
            <s:url action="logout.action" var="logout"/>
            <li><a href="<s:property value="#logout" />" style="color:#007bff; padding:6px 20px; -webkit-transition:padding 0.5s ease; -moz-transition:padding 0.5s ease; -o-transition:padding 0.5s ease; transition:padding 0.5s ease;">Se deconnecter</a></li>
			
  
          </ul>
        </li>
        
        
        
		
      </ul>
      
      
    </div>
  </div>
  


</nav>
