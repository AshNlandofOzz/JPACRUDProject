package com.skilldistillery.jpafishtankwatertest.data;

import java.util.List;

import com.skilldistillery.jpafishtankwatertest.entities.FishTankWaterTest;

public interface FishTankDAO {
	
	List<FishTankWaterTest> findAll();
	
	FishTankWaterTest findById(int testId);
	
	FishTankWaterTest create(FishTankWaterTest newWaterTest);
	
	FishTankWaterTest update(int testId, FishTankWaterTest newtest);

	boolean deleteById(int testId); //ensure test result exists and then delete if it does
	
	
	
}
