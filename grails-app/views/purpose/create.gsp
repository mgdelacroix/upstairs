<html>
	<head>

	</head>

	<body>
		<h1>Create Purpose</h1>
		
		<g:form name="purposeCreateForm" action="save">
			<label for="purpose.name"><g:message code="purpose.create.name" /></label><br />
			<g:textField name="name" /><br />
			<label for="purpose.description"><g:message code="purpose.create.description" /></label><br />
			<g:textArea name="description" /><br />
			<g:submitButton name="submit" value="${message(code: 'purpose.create.submit')}" />
		</g:form>

	</body>
</html>
