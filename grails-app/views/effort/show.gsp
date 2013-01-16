<html>

	<head>

	</head>

	<body>

		<h1><g:message code="effort.show.title" /></h1>

		<p><strong><g:formatDate format="dd-MM-yyyy" date="${effort.date}" /></strong></p>

		<p>${effort.description}</p>

		<g:if test="${effort.comments}">
			<h2>Comments</h2>
			<g:each in="${effort.comments}" var="comment">
				<p><strong>${comment.user.username}</strong> - <g:formatDate format="dd-MM-yyyy" date="${comment.dateCreated}" /></p>
				<p>${comment.body}</p>
			</g:each>
		</g:if>

		<h3><g:message code="effort.show.newComment" /></h3>

		<g:render template="/forms/comment" />

	</body>

</html>
