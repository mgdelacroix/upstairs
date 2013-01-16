<g:form name="effortForm" controller="effort" action="save">
	<g:hiddenField name="purposeId" value="${purpose.id}" />
	<label for="effort.date"><g:message code="effort.create.date" /></label><g:datePicker name="effort.date" value="${new Date()}" precision="day" /><br />
	<label for="effort.description"><g:message code="effort.create.description" /></label><br />
	<g:textArea name="effort.description" /><br />
	<g:submitButton name="submit" value="${message(code: 'effort.create.submit')}" />
</g:form>
