<html>
	<head>
		<title><g:message code="purpose.create.title" /></title>
		<meta name="layout" content="main" />
	</head>

	<body>
		<h1><g:message code="purpose.create.title" /></h1>
		
		<g:form name="purposeForm" action="save">
			<g:render template="/forms/purpose" />
			<g:submitButton name="submit" value="${message(code: 'purpose.create.submit')}" />
		</g:form>

	</body>
</html>
