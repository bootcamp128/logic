<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="com.xsis.trainingweb.entity.User"%>
<html>
<head>
	<title>home</title>
</head>
<body>
	<form action="home" method="POST">
		<input type="text" name = "text-name" placeholder="enter your name" /><br/>
		<input type="password" name= "text-password" placeholder="enter your password" /><br/>
		<input type="text" name = "text-email" placeholder="enter your email" /><br/>
		<input type="submit" name = "btn-submit" value="save"/>
	</form>
	<table>
		<thead>
			<tr><th>Name</th><th>password</th><th>Address</th><th>Action</th></tr>
		</thead>
		<tbody>
	<%
		List<User> users = (List<User>)request.getAttribute("users");
		for(User user : users){
			/* System.out.println("name : "+ user.getName()); */
			%>
				<tr>
					<td><% out.print(user.getName()); %></td>
					<td><% out.print(user.getPassword()); %></td>
					<td><% out.print(user.getEmail()); %></td>
					<td>
			<a onclick="deleteData(<% out.print(user.getId());%>)" 
													href="#">Delete</a>
	<a href="./userupdate?upid=<% out.print(user.getId()); %>">Edit</a>
					</td>
				</tr>
			<%
		}
		
	%>
		</tbody>
	</table>
	<script type="text/javascript">
		function deleteData(id){
			
			var conf = confirm("are you sure delete data ?");
			//jika tekan tomboh OK maka
			if(conf == true)
				//console.log(id);
				window.location="home?user_id="+id;
			//jika tidak // cancel
			else
			return false;
		}
	</script>
</body>

</html>