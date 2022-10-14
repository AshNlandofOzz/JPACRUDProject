package com.skilldistillery.jpafishtankwatertest.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpafishtankwatertest.entities.FishTankWaterTest;

@Service
@Transactional
public class FishTankWaterTestDaoImpl implements FishTankDAO {
		
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<FishTankWaterTest> findAll() {
		String stringQuery = "SELECT t FROM FishTankWaterTest t";
		return em.createQuery(stringQuery, FishTankWaterTest.class).getResultList();
	}

	@Override
	public FishTankWaterTest findById(int testId) {
		return em.find(FishTankWaterTest.class, testId);
	}

	@Override
	public FishTankWaterTest create(FishTankWaterTest newWaterTest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FishTankWaterTest update(int testId, FishTankWaterTest newtest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int testId) {
		// TODO Auto-generated method stub
		return false;
	}

}
