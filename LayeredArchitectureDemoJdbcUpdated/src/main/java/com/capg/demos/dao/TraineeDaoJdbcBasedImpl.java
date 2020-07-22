package com.capg.demos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capg.demos.model.Trainee;

public class TraineeDaoJdbcBasedImpl implements TraineeDao {

	Connection con;
	PreparedStatement ps;
	
	public TraineeDaoJdbcBasedImpl() throws SQLException {
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl",
														"scott","tiger");
		
	}
	
	@Override
	public Trainee addTrainee(Trainee trainee) throws SQLException {
		ps=con.prepareStatement("insert into trainee values(?,?,?)");
		ps.setInt(1, trainee.getId());
		ps.setString(2, trainee.getName());
		ps.setString(3, trainee.getEmail());
		int rowsUpdated=ps.executeUpdate();
		if(rowsUpdated>0) {
			return trainee;
		}
		else
			return null;

	}

	@Override
	public int findTrainee(int id) throws SQLException {
		// TODO Auto-generated method stub
		ps=con.prepareStatement("select * from trainee where id=?");
	    ps.setInt(1, id);
	int r=ps.executeUpdate();
	if(r>0) {
   return id;
	}
	else
		return 0;
}


	@Override
	public int removeTrainee(int id) throws SQLException {
		// TODO Auto-generated method stub
		ps=con.prepareStatement("delete from trainee where id=?");
		    ps.setInt(1, id);
		int r=ps.executeUpdate();
		if(r>0) {
       return id;
		}
		else
			return 0;
	}

}
