package com.example.demo.service;

import java.util.List;

import com.example.demo.model.TrainOrder;

public interface TrainOrderService {
	List<TrainOrder> getCarList(String year, String month, int trainNumber);
}
