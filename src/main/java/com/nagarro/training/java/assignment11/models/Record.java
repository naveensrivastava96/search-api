package com.nagarro.training.java.assignment11.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import com.nagarro.training.java.assignment11.constants.Constants;



@XmlRootElement
@Entity
@Table(name=Constants.tableName)
public class Record {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(generator=Constants.increment)
    @GenericGenerator(name=Constants.increment, strategy = Constants.increment)
	@NotNull
	@Column(name=Constants.Id)
	public int Id;

	@NotEmpty
	@Column(name=Constants.flightNo)
	public String flightNo="";
	
	@Column(name=Constants.depLoc)
	public String depLoc="";
	
	@Column(name=Constants.arrLoc)
	public String arrLoc="";
	
	@Column(name=Constants.validTill)
	public String ValidTill;
	
	@Column(name=Constants.flightTime)
	public String flightTime;
	
	@Column(name=Constants.flightDuration)
	public Double flightDur;
	
	@Column(name=Constants.fare)
	public Double fare;
	
	@Column(name=Constants.seatAvailability)
	public String seatAvailability;
	
	@Column(name=Constants.flightClass)
	public String flightClass;
	
	
	public Record()
	{
		
	}
	
	
	public Record(String flightNo, String depLoc, String arrLoc, String validTill, String flightTime, double flightDur,
			Double fare, String seatAvailability, String flightClass) {
		super();
		this.flightNo = flightNo;
		this.depLoc = depLoc;
		this.arrLoc = arrLoc;
		ValidTill = validTill;
		this.flightTime = flightTime;
		this.flightDur = flightDur;
		this.fare = fare;
		this.seatAvailability = seatAvailability;
		this.flightClass = flightClass;
	}
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getDepLoc() {
		return depLoc;
	}
	public void setDepLoc(String depLoc) {
		this.depLoc = depLoc;
	}
	public String getArrLoc() {
		return arrLoc;
	}
	public void setArrLoc(String arrLoc) {
		this.arrLoc = arrLoc;
	}
	public String getValidTill() {
		return ValidTill;
	}
	public void setValidTill(String validTill) {
		ValidTill = validTill;
	}
	public String getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	public double getFlightDur() {
		return flightDur;
	}
	public void setFlightDur(double flightDur) {
		this.flightDur = flightDur;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public String getSeatAvailability() {
		return seatAvailability;
	}
	public void setSeatAvailability(String seatAvailability) {
		this.seatAvailability = seatAvailability;
	}
	public String getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	
	
}
