<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="student.SecondaryData"%>
<%@page import="student.TableResponse"%>
<%@page import="student.PrimaryData"%>
<%@page import="java.util.List"%>
<%
  List <PrimaryData> primaryResponse = TableResponse.getPrimaryTable();
  List <SecondaryData> secondaryResponse = TableResponse.getSecondaryTable();
  
  Map<String,PrimaryData>  primaryMap= new HashMap<String,PrimaryData>();
  
  for(PrimaryData primaryData:primaryResponse)
  {
	  primaryMap.put(primaryData.getNumber(), primaryData);
  }
  
%>

<!DOCTYPE html>
<html>
<body>
<center><table border="2px">
<tr>
<th>Number</th>
<th>Name</th>
<th>Address</th>
</tr>
<tr>
<%
   for(SecondaryData secondaryData:secondaryResponse)
   {
	   PrimaryData primaryData=primaryMap.get(secondaryData.getNumber());
	   if(primaryData!=null)
	   {
		   String name=primaryData.getName();
		   String number=primaryData.getNumber();
		   String address=secondaryData.getAddess();
%>
       <td><%=number %></td>
       <td><%=name %></td>
       <td><%=address %></td>
       </tr>
<%       
	   }
	   else
	   {
		   System.out.println("No primary data found for number:"+secondaryData.getNumber());
	   }
   }
%>

</table>
</center>
</body>
</html>




