<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:include value="/menu.jsp"></s:include>
<s:form action="form" method="post">
<s:textfield label="id auteur" name="auteur.idauteur"  />
			<s:textfield label="Titre" name="titre"  />
			<s:textfield label="Langue" name="langue" />
			<s:textfield label="Domaine" name="domaine"   />
			<s:textfield label="Editeur" name="editeur"   />
			<s:textfield label="Datepublication" name="datepublication"   />
			<s:textfield label="ISBN" name="isbn"   />
			<s:textfield label="ISBN" name="isbn"   />
			<s:textfield label="Nombre de pages" name="nbpages"   />
			<s:textfield label="Nombre d'exemplaires" name="nbtotal"   />
			<s:textfield label="Exemplaires disponibles" name="nbrestant"   />
			
			<s:submit value="AJOUTER" />
							</s:form>
</body>
</html>