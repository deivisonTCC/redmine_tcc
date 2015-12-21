package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import play.db.DB;
import play.mvc.Controller;

public class Issues extends Controller{
	
	public static void filtarTasksResponsavelStatus() throws SQLException{
		
		ResultSet rs = null;
		Connection con = null;
		Statement s = null;
		
		con = DB.getConnection();
		
		String sql = " SELECT id, description FROM issues WHERE 1=1 ";
		List<models.Issues> tarefas = new ArrayList<models.Issues>();
		
		try {
			s = con.createStatement();
			rs = s.executeQuery(sql);
			
			while (rs.next()) {
				
				models.Issues issue = new models.Issues();
				issue.setId(rs.getLong("id"));
				issue.setDescription(rs.getString("description"));
				
				tarefas.add(issue);
				
			}
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		} finally {
			if (rs != null)
				rs.close(); // usado quando o rs for do tipo ResultSet
			if (s != null)
				s.close();
			if (con != null)
				con.close();
		}
		
		render(tarefas);
	}
	
}
