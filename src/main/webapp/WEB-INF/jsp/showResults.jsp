<!DOCTYPE html>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="filter" value="${filter}" scope="session"/>

<html lang="en">
	<body>
	<a href="/">Filter Again</a>
	<h2>Filter:</h2>
	<b>Order by Rating:</b> <c:out value="${filter.rating}"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<b>Minimum rating:</b> <c:out value="${filter.minRating}"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<b>Order by Date:</b> <c:out value="${filter.orderDate}"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<b>Prioritize by text:</b> <c:out value="${filter.priorText}"/><br /><br />
	<table border="1">
		<tr>
			<th>id</th>
			<th>reviewId</th>
			<th>reviewFullText</th>
			<th>reviewText</th>
			<th>numLikes</th>
			<th>numComments</th>
			<th>numShares</th>
			<th>rating</th>
			<th>reviewCreatedOn</th>
			<th>reviewCreatedOnDate</th>
			<th>reviewCreatedOnTime</th>
			<th>reviewerId</th>
			<th>reviewerUrl</th>
			<th>reviewerName</th>
			<th>reviewerEmail</th>
			<th>sourceType</th>
			<th>isVerified</th>
			<th>source</th>
			<th>sourceName</th>
			<th>sourceId</th>
			<th>tags</th>
			<th>href</th>
			<th>logoHref</th>
			<th>photos</th>
		</tr>
		<c:forEach items="${reviews}" var="review">
		<tr>
			<td><c:out value="${review.id}"/></td>
			<td><c:out value="${review.reviewId}"/></td>
			<td><c:out value="${review.reviewFullText}"/></td>
			<td><c:out value="${review.reviewText}"/></td>
			<td><c:out value="${review.numLikes}"/></td>
			<td><c:out value="${review.numComments}"/></td>
			<td><c:out value="${review.numShares}"/></td>
			<td><c:out value="${review.rating}"/></td>
			<td><c:out value="${review.reviewCreatedOn}"/></td>
			<td><c:out value="${review.reviewCreatedOnDate}"/></td>
			<td><c:out value="${review.reviewCreatedOnTime}"/></td>
			<td><c:out value="${review.reviewerId}"/></td>
			<td><c:out value="${review.reviewerUrl}"/></td>
			<td><c:out value="${review.reviewerName}"/></td>
			<td><c:out value="${review.reviewerEmail}"/></td>
			<td><c:out value="${review.sourceType}"/></td>
			<td><c:out value="${review.isVerified}"/></td>
			<td><c:out value="${review.source}"/></td>
			<td><c:out value="${review.sourceName}"/></td>
			<td><c:out value="${review.sourceId}"/></td>
			<td><c:forEach items="${review.tags}" var="tag"><c:out value="${tag}, "/> </c:forEach></td>
			<td><c:out value="${review.href}"/></td>
			<td><c:out value="${review.logoHref}"/></td>
			<td><c:forEach items="${review.photos}" var="photo"><c:out value="${photo}, "/></c:forEach></td>
		</tr>
		</c:forEach>
	</table>
</body>

</html>
