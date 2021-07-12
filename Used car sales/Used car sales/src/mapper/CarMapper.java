package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import models.Car;

public class CarMapper implements RowMapper<Car>{
   
	@Override
	public Car mapRow(ResultSet rs, int arg1) throws SQLException {
		Car car=new Car();
		car.setId(rs.getInt("id"));
		car.setName(rs.getString("name"));
		car.setModel(rs.getInt("model"));
		car.setMaker(rs.getString("maker"));
		return car;
	}

}
