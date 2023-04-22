<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
            </head>

            <body>
                <form:form>
                    <c:forEach var="movie" items="${movieList}">
                        <!-- <h2>${movie.movieId}</h2> -->
                        <h2>${movie.name}</h2>
                        <h2>${movie.description}</h2>
                        <h2>${movie.durationMins}</h2>
                        <h2>${movie.releaseDate}</h2>
                        <h2>${movie.genre}</h2>
                        
                        <!-- <h2><button type="button" class="btn btn-success">
                                            <a href="/editMovie/${movie.id}" style="color:white;font-size: large;">Edit</a>
                                        </button></h2> -->
                        <!-- <h2><button type="button" class="btn btn-danger">
                                            <a href="/deleteMovie/${movie.id}" style="color:white;font-size:large">Delete</a>
                                        </button></h2> -->

                    </c:forEach>

                </form:form>
            </body>

            </html>