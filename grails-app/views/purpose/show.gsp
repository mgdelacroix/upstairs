<html>

	<head>
	</head>

	<body>
		<h1>Show purpose</h1>

		<p>${purpose.name}</p>

		<p>${purpose.description}</p>

		<g:if test="${purpose.efforts}">

			<h2>Efforts</h2>

			<g:each in="${purpose.efforts}" var="effort">
				<p><strong><g:fomatDate format="dd-MM-yyyy" date="${effort.dateCreated}" /></strong></p>
				<p>${effort.description}</p>
			</g:each>

		</g:if>

		<h3>Register effort</h3>

		<g:form name="effortCreateForm" controller="effort" action="save">
			<label for="effort.date"><g:message code="effort.create.date" /></label><g:datePicker name="effort.date" value="${new Date()}" precision="day" /><br />
			<label for="effort.description"><g:message code="effort.create.description" /></label><br />
			<g:textArea name="effort.description" /><br />
			<g:submitButton name="submit" value="${message(code: 'effort.create.submit')}" />
		</g:form>

	</body>

</html>
