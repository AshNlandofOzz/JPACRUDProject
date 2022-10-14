package com.skilldistillery.jpafishtankwatertest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "watertestresult")
public class FishTankWaterTest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Double nitrates;
	
	public Double getNitrates() {
		return nitrates;
	}

	public void setNitrates(Double nitrates) {
		this.nitrates = nitrates;
	}

	public FishTankWaterTest() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "FishTankWaterTest [id=" + id + ", nitrates=" + nitrates + "]";
	}
	

	
	

}
