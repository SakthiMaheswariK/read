package com.database.newtable.sql;

public class collection {
	
	public static employee<newtable> throws ClassNotFoundException, SQLException {
	    Connection conn=DBConnection.getDBConnection().getConnection();
	    Statement stm;
	    stm = conn.createStatement();
	    String sql = "Select * From newtable";
	    ResultSet rst;
	    rst = stm.executeQuery(sql);
	    ArrayList<employee> customerList = new ArrayList<>();
	    while (rst.next()) {
	        employee emp = new employee(rst.getString("empname"), rst.getString("fathername"), rst.getString("gender"), rst.getLong("joining date"));
	        employee.add(employee);
	    }
	    return employee;
	}