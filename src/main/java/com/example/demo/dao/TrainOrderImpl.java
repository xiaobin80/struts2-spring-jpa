package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TrainOrder;

@Repository
public class TrainOrderImpl implements TrainOrderDao {
	
	private final Logger logger = LogManager.getLogger();
	
	@PersistenceContext(unitName = "UP_car")
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<TrainOrder> getCarnumberList(String year, String month, int trainNumber) throws DataAccessException {
		// TODO Auto-generated method stub
		String jpql = "SELECT train FROM TrainOrder as train" 
				+ " Where yearLevel2 = \'" + year + "\' AND monthLevel3 = \'" + month 
				+ "\' AND trainNumber = \'" + trainNumber + "\' ORDER BY train.seriaryNumber ASC";
		
		List<TrainOrder> result = entityManager.createQuery(jpql).getResultList();
		
		for (TrainOrder train : result) {
			logger.info(train.getCarNumber());
		}
		
		return (List<TrainOrder>)result;
	}

}
