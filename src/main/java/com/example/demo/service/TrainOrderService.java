package com.example.demo.service;

import java.util.List;

import com.example.demo.model.TrainOrder;
import com.google.code.ssm.api.ParameterValueKeyProvider;

public interface TrainOrderService {
	List<TrainOrder> getCarList(String year, String month, @ParameterValueKeyProvider int trainNumber);
}
