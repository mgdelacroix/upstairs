<html>

	<head>
		<title><g:message code="purpose.show.title" /></title>
		<meta name="layout" content="main" />
	</head>

	<body>
		<h1>${purpose.name}</h1>

		<p>${purpose.description}</p>

		<g:if test="${effortList}">

			<h2><g:message code="purpose.show.efforts" /></h2>

			<g:each in="${effortList}" var="effort">
				<p><strong><a href="${createLink(controller: 'effort', action: 'show', id: effort.id)}"><g:formatDate format="dd-MM-yyyy" date="${effort.date}" /></strong></a></p>
				<p>${effort.description}</p>
			</g:each>

		</g:if>

		<g:if test="${currentUser == purpose.user}">
			<h3><g:message code="purpose.show.newEffort" /></h3>
	
			<g:form name="effortForm" controller="effort" action="save">
				<g:render template="/forms/effort" />
				<g:submitButton name="submit" value="${message(code: 'effort.create.submit')}" />
			</g:form>

		</g:if>

	</body>

</html>
