package com.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.exception.MyException;

@Repository("testExceptionDao")
public class TestExceptionDao {

	public void daodb()throws Exception{
		throw new SQLException("Dao数据库异常！");
	}
	public void daomy()throws Exception {
		throw new MyException("Dao中自定义异常！");
	}
	public void daono()throws Exception {
		throw new Exception("dao中未知异常！");
	}

}
