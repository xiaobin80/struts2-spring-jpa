package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainOrder")
public class TrainOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "train_number")
	private int trainNumber;
	
	@Column(name = "seriary_number")
	private int seriaryNumber;
	
	@Column(name = "car_number")
	private String carNumber;
	
	@Column(name = "car_marque")
	private String carMarque;
	
	@Column(name = "carry_weight1")
	private double carryWeight1;
	
	@Column(name = "self_weight1")
	private double selfWeight1;
	
	@Column(name = "past_time")
	private String pastTime;
	
	private String outFlag;
	
	private boolean badFlag;
	
	@Column(name = "year_level2")
	private String yearLevel2;
	
	@Column(name = "month_level3")
	private String monthLevel3;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sn;
	
	
	/* JavaBeans Properties */
	
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	public int getSeriaryNumber() {
		return seriaryNumber;
	}
	public void setSeriaryNumber(int seriaryNumber) {
		this.seriaryNumber = seriaryNumber;
	}
	
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber1(String carNumber) {
		this.carNumber = carNumber;
	}
	
	public String getCarMarque() {
		return carMarque;
	}
	public void setCarMarque(String carMarque) {
		this.carMarque = carMarque;
	}
	
	public double getCarryWeight1() {
		return carryWeight1;
	}
	public void setCarryWeight1(double carryWeight1) {
		this.carryWeight1 = carryWeight1;
	}
	
	public double getSelfWeight1() {
		return selfWeight1;
	}
	public void setSelfWeight1(double selfWeight1) {
		this.selfWeight1 = selfWeight1;
	}
	
	public String getPastTime() {
		return pastTime;
	}
	public void setPastTime(String pastTime) {
		this.pastTime = pastTime;
	}
	
	public String getOutFlag() {
		return outFlag;
	}
	public void setOutFlag(String outFlag) {
		this.outFlag = outFlag;
	}
	
	public boolean isBadFlag() {
		return badFlag;
	}
	public void setBadFlag(boolean badFlag) {
		this.badFlag = badFlag;
	}
	private int getBadFlagAsInt() {
		// TODO Auto-generated method stub
		return badFlag ? 1 : 0;
	}
	
	public String getYearLevel2() {
		return yearLevel2;
	}
	public void setYearLevel2(String yearLevel2) {
		this.yearLevel2 = yearLevel2;
	}
	
	public String getMonthLevel3() {
		return monthLevel3;
	}
	public void setMonthLevel3(String monthLevel3) {
		this.monthLevel3 = monthLevel3;
	}
	
	public int getSn() {
		return sn;
	}
	public void setSn(int sn) {
		this.sn = sn;
	}
	
}