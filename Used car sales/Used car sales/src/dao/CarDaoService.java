package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import mapper.CarMapper;
import models.Car;

public class CarDaoService implements CarDao{
    @Autowired
	JdbcTemplate jt;
    
   
	@Override
	public int addCar(Car car) {
	String sql="insert into car(name,model,maker) values(?,?,?)";
	Object[] args= {car.getName(),car.getModel(),car.getMaker()};
		return jt.update(sql, args);
	}

	@Override
	public Car searchCar(int id) {
		String sql="select * from car where id=?";
		Object[] arg={id};
		CarMapper map=new CarMapper();
	   return jt.queryForObject(sql, arg, map);
	}

	@Override
	public List<Car> getAllCars() {
		String sql="select * from car";
		CarMapper map=new CarMapper();
		return jt.query(sql, map);
	}

	@Override
	public void deleteCar(int id) {
		String sql="delete  from car where id=?";
		Object[] args= {id};
		jt.update(sql, args);
		
	}

	@Override
	public int updateCar(Car car) {
		String sql="update car set name=?,model=? and maker=? where id=?";
		Object[] args= {car.getName(),car.getModel(),car.getMaker(),car.getId()};
		
		return jt.update(sql, args);
	}

}
