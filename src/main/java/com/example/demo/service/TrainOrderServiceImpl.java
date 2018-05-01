package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TrainOrderDao;
import com.example.demo.model.TrainOrder;

@Service("trainOrderService")
public class TrainOrderServiceImpl implements TrainOrderService {

	@Autowired
	TrainOrderDao trainOrderDao;
	@Override
	public List<TrainOrder> getCarList(String year, String month, int trainNumber) {
		// TODO Auto-generated method stub
		return trainOrderDao.getCarnumberList(year, month, trainNumber);
	}

}
