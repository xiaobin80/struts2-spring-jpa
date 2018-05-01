package com.example.demo.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.model.TrainOrder;

public interface TrainOrderDao {	
	List<TrainOrder> getCarnumberList(String year, String month, int trainNumber) throws DataAccessException;
}
