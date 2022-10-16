package com.skilldistillery.jpafishtankwatertest.entities;



import javax.persistence.Column;
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
	
	private double nitrates;
	
	private double nitrites;
	
	private double ammonia;
	
	@Column(name="PH")
	private double ph;
	
	private String datetested;

	
	@Override
	public String toString() {
		return "FishTankWaterTest [id=" + id + ", nitrates=" + nitrates + ", nitrites=" + nitrites + ", ammonia="
				+ ammonia + ", ph=" + ph + ", datetested=" + datetested + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNitrates() {
		return nitrates;
	}

	public void setNitrates(double nitrates) {
		this.nitrates = nitrates;
	}

	public double getNitrites() {
		return nitrites;
	}

	public void setNitrites(double nitrites) {
		this.nitrites = nitrites;
	}

	public double getAmmonia() {
		return ammonia;
	}

	public void setAmmonia(double ammonia) {
		this.ammonia = ammonia;
	}

	public double getPh() {
		return ph;
	}

	public void setPh(double ph) {
		this.ph = ph;
	}

	public String getDatetested() {
		return datetested;
	}

	public void setDatetested(String datetested) {
		this.datetested = datetested;
	}

	public FishTankWaterTest() {
		
	}
	
	public FishTankWaterTest(int id, String datetested, double nitrates, double nitrites, double ammonia, double ph){
		
	}

}
