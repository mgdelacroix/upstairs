<g:form name="commentForm" controller="comment" action="save">
	<g:hiddenField name="effortId" value="${effort.id}" />
	<label for="comment.body"><g:message code="comment.create.body" /></label><br />
	<g:textArea name="comment.body" /><br />
	<g:submitButton name="submit" value="${message(code: 'comment.create.submit')}" />
</g:form>
