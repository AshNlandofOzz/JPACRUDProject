package com.skilldistillery.jpafishtankwatertest.entities;

import java.util.Date;

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
	
	private Double nitrates;
	
	private Double nitrites;
	
	private Double ammonia;
	
	@Column(name="PH")
	private Double ph;
	
	private Date datetested;

	
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


	public Double getNitrates() {
		return nitrates;
	}


	public void setNitrates(Double nitrates) {
		this.nitrates = nitrates;
	}


	public Double getNitrites() {
		return nitrites;
	}


	public void setNitrites(Double nitrites) {
		this.nitrites = nitrites;
	}


	public Double getAmmonia() {
		return ammonia;
	}


	public void setAmmonia(Double ammonia) {
		this.ammonia = ammonia;
	}


	public Double getPh() {
		return ph;
	}


	public void setPh(Double ph) {
		this.ph = ph;
	}


	public Date getDatetested() {
		return datetested;
	}


	public void setDatetested(Date datetested) {
		this.datetested = datetested;
	}


	public FishTankWaterTest() {
		
	}


	

	
	

}
