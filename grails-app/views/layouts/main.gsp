<!DOCTYPE html>
<html>
	
	<head>
	  <r:require module="application" />
	  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	  <title>upStairs - <g:layoutTitle default=""/></title>
	  <link href='http://fonts.googleapis.com/css?family=Quando' rel='stylesheet' type='text/css'>
	  <g:layoutHead />
	  <r:layoutResources />
	</head>

	<body>
	  <div id="main">
	    <div id="column-left">
	      <div class="menu">
					<ul>
						<li><a class="page01" href="${createLink(controller: 'dashboard', action: 'index')}">HOME</a></li>
						<li><a class="page02" href="${createLink(controller: 'purpose', action: 'index')}">PROFILE</a></li>
						<li><a class="page03" href="#">PURPOSES</a></li>
						<li><a class="page04" href="${createLink(controller: 'purpose', action: 'create')}">CREATE PURPOSE</a></li>
					</ul>
	      </div>
	    </div><!-- columna left -->

	    <div id="column-right">
	      <div id="header">
					<div class="title-header"><g:layoutTitle default="dashboard" /></div>
					<div id="main-logo">
						<ul>
							<li><a class="page01" href="${createLink(uri: '/', absolute: true)}">UPSTAIRS</a><li>
						</ul>
					</div>
	      </div>
	      
	      <div id="content">
					<g:layoutBody />
					<r:layoutResources />	
	      </div>	
	    </div><!-- columna right -->
	  </div>
	</body>

</html>
