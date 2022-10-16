package com.skilldistillery.jpafishtankwatertest.data;

import java.util.Date;
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
		em.persist(newWaterTest);
		return newWaterTest;
	}

	@Override
	public FishTankWaterTest update(int testId, FishTankWaterTest test) {
		FishTankWaterTest updated = em.find(FishTankWaterTest.class, testId);
		if (updated != null) {
			updated.setAmmonia(test.getAmmonia());
			updated.setNitrates(test.getNitrates());
			updated.setNitrites(test.getNitrites());
			updated.setPh(test.getPh());
			updated.setDatetested(test.getDatetested());
			em.persist(updated);
		}
		return updated;
	}

	@Override
	public boolean deleteById(int testId) {
		boolean successfullyRemoved = false;
		FishTankWaterTest removed = em.find(FishTankWaterTest.class, testId);
		if (removed != null) {
			em.remove(removed);
			successfullyRemoved = !em.contains(removed);
			em.persist(removed);
		}
		return successfullyRemoved;
	}

}
