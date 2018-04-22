package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserDetails;

@Repository
public class UserDetailsImpl implements UserDetailsDao {
	private final Logger logger = LogManager.getLogger();
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserDetails> getUserDetails() {
		// TODO Auto-generated method stub
		String hql = "FROM UserDetails as user ORDER BY user.userId DESC";
		List<UserDetails> result = entityManager.createQuery(hql).getResultList();
		
		for (UserDetails userDetails : result) {
			logger.info(userDetails.getEmail());
		}
		
		return (List<UserDetails>)result;
	}

	@Override
	public UserDetails findUserById(String userId) {
		// TODO Auto-generated method stub
		return entityManager.find(UserDetails.class, userId);
	}

}
