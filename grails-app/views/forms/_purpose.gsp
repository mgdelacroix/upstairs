<g:form name="purposeForm" action="save">
	<label for="purpose.name"><g:message code="purpose.create.name" /></label><br />
	<g:textField name="purpose.name" /><br />
	<label for="purpose.description"><g:message code="purpose.create.description" /></label><br />
	<g:textArea name="purpose.description" /><br />
	<g:submitButton name="submit" value="${message(code: 'purpose.create.submit')}" />
</g:form>
