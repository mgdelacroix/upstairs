<html>

	<head>
		<title><g:message code="purpose.index.title" /></title>
		<meta name="layout" content="main" />
	</head>

	<body>
		<g:each in="${purposeList}" var="purpose">
			<p><a href="${createLink(action: 'show', id: purpose.id)}"><strong>${purpose.name}</strong></a></p>
		</g:each>

		<a href="${createLink(action: 'create')}"><g:message code="purpose.index.create" /></a>

	</body>

</html>
