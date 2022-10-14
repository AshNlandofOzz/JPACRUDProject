package com.skilldistillery.jpafishtankwatertest.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FishTankWaterTestTest {
	
private static EntityManagerFactory emf;
private EntityManager em;
private FishTankWaterTest ftwt;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAFishTankWaterTest");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		ftwt = em.find(FishTankWaterTest.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		ftwt = null;
	}

	@Test
	void test_FishTank_Entity_mapping() {
		assertNotNull(ftwt);
		assertEquals(1, ftwt.getId());
	}


}
