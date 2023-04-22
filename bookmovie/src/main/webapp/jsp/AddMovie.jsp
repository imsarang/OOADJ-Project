<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1 style="text-align:center;padding:2%">ADD MOVIE</h1>
    <form:form action="/movies" method="post" modelAttribute="movie" enctype="multipart/form-data">
        
        <div class="form-data">
            <label class="form-label" for="name">Name : </label>
            <form:input type="text" path="name" id="name" class="form-control-input" required="required"/>
        </div>
        <div class="form-data">
            <label class="form-label" for="genre">Genre: </label>
            <form:input type="text" path="genre" id="genre" class="form-control-input" required="required"/>
        </div>

        <div class="form-data">
            <label class="form-label" for="durationMins">Duration of Movie in Mins : </label>
            <form:input type="text" path="durationMins" id="durationMins" class="form-control-input" required="required"/>
        </div>

        <div class="form-data">
            <label class="form-label" for="releaseDate">Release Date : </label>
            <form:input type="text" path="releaseDate" id="releaseDate" class="form-control-input" required="required"/>
        </div>

                
        <div class="form-data">
            <label class="form-label" for="description">Description : </label>
            <form:input type="text" path="description" id="description" class="form-control-input" required="required"/>
        </div>

        <div class="form-data">
            <label class="form-label" for="imageData">Image File : </label>
            <form:input type="file" name="file" path="imageData" id="imageData" class="form-control-input" required="required"/>
        </div>

        <div class="form-register">
            <button type="submit" value="Register" class="btn btn-success">Save</button>
        </div>
    </form:form>
</body>
</html>