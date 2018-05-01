package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TrainOrderDao;
import com.example.demo.model.TrainOrder;
import com.google.code.ssm.api.ParameterValueKeyProvider;
import com.google.code.ssm.api.ReadThroughSingleCache;

@Service("trainOrderService")
public class TrainOrderServiceImpl implements TrainOrderService {

	@Autowired
	TrainOrderDao trainOrderDao;
	
	@Override
	@ReadThroughSingleCache(namespace = "carnum", expiration = 300)
	public List<TrainOrder> getCarList(String year, String month, @ParameterValueKeyProvider int trainNumber) {
		// TODO Auto-generated method stub
		return trainOrderDao.getCarnumberList(year, month, trainNumber);
	}

}
