<html>

	<head>
		<title><g:message code="effort.show.title" /></title>
		<meta name="layout" content="main" />
	</head>

	<body>
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

		<g:form name="commentForm" controller="comment" action="save">
			<g:render template="/forms/comment" />
			<g:submitButton name="submit" value="${message(code: 'comment.create.submit')}" />
		</g:form>

	</body>

</html>
