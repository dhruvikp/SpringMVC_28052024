package com.simplilearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.model.EProduct;

@Repository
public class EProductDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<EProduct> getProducts() {
		return jdbcTemplate.query("select * from eproduct", new RowMapper<EProduct>() {
			
			@Override
			public EProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
				EProduct eProduct = new EProduct();
				eProduct.setProductId(rs.getInt(1));
				eProduct.setProductName(rs.getString(2));
				eProduct.setPrice(rs.getDouble(3));
				eProduct.setProductDate(rs.getDate(4));
				return eProduct;
			}
		});
	}
}
