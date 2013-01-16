<html>

	<head>
	</head>

	<body>
		<h1><g:message code="purpose.show.title" /></h1>

		<p>${purpose.name}</p>

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
	
			<g:form name="effortCreateForm" controller="effort" action="save">
				<g:hiddenField name="purposeId" value="${purpose.id}" />
				<label for="effort.date"><g:message code="effort.create.date" /></label><g:datePicker name="effort.date" value="${new Date()}" precision="day" /><br />
				<label for="effort.description"><g:message code="effort.create.description" /></label><br />
				<g:textArea name="effort.description" /><br />
				<g:submitButton name="submit" value="${message(code: 'effort.create.submit')}" />
			</g:form>
		</g:if>

	</body>

</html>
