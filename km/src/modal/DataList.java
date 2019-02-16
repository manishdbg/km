package modal;
 
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import bean.ListBean;
import common_things.DB_Connection;
 

 
public class DataList {
// public static void main(String args[]) throws Exception {
//	 List<ListBean> ls = new ArrayList<ListBean>();
//	 ls = querydata();
// }
	public static List<ListBean> querydata() throws Exception {
	DB_Connection obj_DB_Connection=new DB_Connection();
	Connection connection=obj_DB_Connection.getConnection();
	
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	 List<ListBean> list = new ArrayList<ListBean>();
	
	try {
		
		String qurey="select * from DUMMY_TABLE";
		ps=connection.prepareStatement(qurey);
		rs=ps.executeQuery();
	//      PrintStream out = new PrintStream(System.out);
	      
        while (rs.next()) {
            String prod_name = rs.getString("prod_name");
            String prod_relid = rs.getString("prod_relid");
            String proc_name = rs.getString("proc_name");
            String proc_relid = rs.getString("proc_relid");
            String rule_name = rs.getString("rule_name");
            String scenario_name = rs.getString("scenario_name");
            
            ListBean listbean = new ListBean();
            listbean.setProd_name(prod_name);
            listbean.setProd_relid(prod_relid);
            listbean.setProc_name(proc_name);
            listbean.setProc_relid(proc_relid);
            listbean.setRule_name(rule_name);
            listbean.setScenario_name(scenario_name);
            list.add(listbean);
        }
      //  out.print(list);
        
	}finally {
			try {
				if(connection!=null){
					connection.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
	return list;
	
	
}
	
}