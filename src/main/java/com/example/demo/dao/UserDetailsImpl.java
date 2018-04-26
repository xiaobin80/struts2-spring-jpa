package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

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
		String jpql = "SELECT user FROM UserDetails as user ORDER BY user.userId ASC";
		
		List<UserDetails> result = entityManager.createQuery(jpql).getResultList();
		
		for (UserDetails userDetails : result) {
			logger.info(userDetails.getEmail());
		}
		
		return (List<UserDetails>)result;
	}

	@Override
	public UserDetails findUserById(String userId) {
		// TODO Auto-generated method stub
		//return entityManager.find(UserDetails.class, userId); 
		// Create Criteria
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<UserDetails> criteria = builder.createQuery(UserDetails.class);
		
        Root<UserDetails> userDetailsTable = criteria.from(UserDetails.class);
        
        builder.construct(UserDetails.class, userDetailsTable.get("userId"));
        
        Path<UserDetails> uId = userDetailsTable.get("userId");
        Predicate condition = builder.equal(uId, userId);
        criteria.where(condition);
		
        UserDetails result = entityManager.createQuery(criteria).getSingleResult();
        
		return result;
	}
	
	@Override
	@Transactional
	public int delUserById(int userId) {
		int result = 0;
		
		String jpql = "DELETE FROM UserDetails as user WHERE user.userId = :uId";
		Query query = entityManager.createQuery(jpql);
		result = query.setParameter("uId", userId).executeUpdate();
		
		return result;
	}
	
	@Override
	@Transactional
	public int insertUser(UserDetails user) {
		int result = 0; 
		
		logger.info(result);
		entityManager.persist(user);
		
		return result;
	}
	
	@Override
	@Transactional
	public int updateUser(String userName, int userId) {
		// http://www.objectdb.com/java/jpa/query/jpql/update
		Query query = entityManager.createQuery(
			      "UPDATE UserDetails as user SET userName = \'" + userName +
			      "\' WHERE user.userId = :uId");
		int updateCount = query.setParameter("uId", userId).executeUpdate();
		
		return updateCount;
	}

}
