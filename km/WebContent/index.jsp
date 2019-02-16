<%@page language="java" import="java.util.Iterator" %>
<%@page language="java" import="java.util.List" %>
<%@page language="java" import="java.util.ArrayList" %>
<%@page language="java" import="bean.ListBean" %>
<%@page language="java" import="modal.DataList" %>

<!DOCTYPE html>
<%@include file="header.jsp"%> 


<%@page language="java" import="java.util.*" %>
<%List<ListBean> data = (List<ListBean>) request.getAttribute("data"); %>

<html lang="en">
<head>
  <title>Table</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
   <script src="https://code.jquery.com/jquery-1.12.3.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

   <script>
   $(document).ready(function(){
	    $('#myTable').dataTable();
	   
	});
	</script>
	</head>
	<body>

	<div class="container">
	  <div class="table-responsive">
	  <table id="myTable" class="display table">
	    <thead>
	      <tr>
	        <th>ProdRelId</th>
	  <th>Product</th>
	  <th>ProcRelId</th>
	        <th>Process</th>
	          <th>Rule</th>
	        <th>Scenario</th>
	           </tr>
	    </thead>
	    
<%


	 for(int i = 0; i < data.size(); i++) {
            	ListBean lb = new ListBean();
                lb = data.get(i);
                //out.println(actor.getId());
                //out.println(actor.getFirstname());
                //out.println(actor.getLastname());
            %>

<tr>
<td><%=lb.getProd_relid()%></td>
<td><%=lb.getProd_name()%></td>
<td><%=lb.getProc_relid()%></td>
<td><%=lb.getProc_name()%></td>
<td><%=lb.getRule_name()%></td>
<td><%=lb.getScenario_name()%></td>
</tr>
<%}%>

   
    </tbody>
  </table>
</div>
</div>
</body>
</html>

<%@include file="footer.jsp"%>