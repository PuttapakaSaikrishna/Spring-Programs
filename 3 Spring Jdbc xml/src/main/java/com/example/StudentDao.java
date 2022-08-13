package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDao {
	private JdbcTemplate tmp;

	public void setTmp(JdbcTemplate tmp) {
		this.tmp = tmp;
	}

	/***********
	 * Load the JDBC driver. Connection. Statement. Execute statement. Close
	 * database connection.
	 ***********************************/

	/*****
	 * JDBC Template Register the driver connection -spring .xml
	 ****************/

	// insert ,update,delete
	public int insert(Student s) {
		String sql="insert into student values("+s.getSid()+",'"+s.getName()+"')";
		return tmp.update(sql);
	}
	
	
	
	
	// retrival

	public List<Student> getallstudent() {

		String sql = "select * from student";

		return tmp.query(sql, new ResultSetExtractor<List<Student>>() {

			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {

				ArrayList<Student> list = new ArrayList<Student>();
				while (rs.next()) {
					Student s = new Student();
					s.setSid(rs.getInt(1));
					s.setName(rs.getString(2));
					list.add(s);

				}

				return null;
			}

		});

	}
}
