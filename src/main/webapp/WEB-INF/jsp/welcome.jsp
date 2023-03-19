<!DOCTYPE html>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<html lang="en">

<body>
	<h1>Filter Reviews</h1>
	<f:form action="showFilteredJson" modelAttribute="filter">
		<f:label path="rating">Order by Rating</f:label>
		<f:select path="rating" >
			<f:option  value="HighestFirst">Highest First</f:option>
			<f:option value="LowestFirst">Lowest First</f:option>
		</f:select><br />
		<f:label path="minRating">Minimum rating</f:label>
		<f:select path="minRating">
			<f:option value="1">1</f:option>
			<f:option value="2">2</f:option>
			<f:option value="3">3</f:option>
			<f:option value="4">4</f:option>
			<f:option value="5">5</f:option>
		</f:select><br />
		<f:label path="orderDate">Order by Date</f:label>
		<f:select path="orderDate">
			<f:option value="NewestFirst">Newest First</f:option>
			<f:option value="OldestFirst">Oldest First</f:option>
		</f:select><br />
		<f:label path="priorText">Prioritize by text</f:label>
		<f:select path="priorText">
			<f:option value="yes">Yes</f:option>
			<f:option value="no">No</f:option>
		</f:select><br />
		<input type="submit" value="submit" />
	</f:form>
</body>

</html>
