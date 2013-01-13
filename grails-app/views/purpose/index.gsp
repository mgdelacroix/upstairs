<html>

	<head>
	</head>

	<body>
		<h1>My Purposes</h1>

		<g:each in="${purposeList}" var="purpose">
			<p><a href="${createLink(action: 'show', id: purpose.id)}"><strong>${purpose.name}</strong></a></p>
		</g:each>

		<a href="${createLink(action: 'create')}">New Purpose</a>

	</body>

</html>
