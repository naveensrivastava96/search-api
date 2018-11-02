package com.nagarro.training.java.assignment11.constants;

public class Constants {

	public static final String getAllRecords="/getallrecords";
	public static final String searchRecord = "/searchrecord";
	public static final String tableName="flightrecords";
	public static final String increment = "increment";
	public static final String Id = "Id";
	public static final String flightNo = "flight_No";
	public static final String depLoc = "DEP_LOC";
	public static final String arrLoc = "ARR_LOC";
	public static final String validTill = "Valid_Till";
	public static final String flightTime = "flight_Time";
	public static final String flightDuration = "flight_Dur";
	public static final String fare = "fare";
	public static final String seatAvailability = "seat_Availability";
	public static final String flightClass = "Class";
	public static final String selectAllFlight="select * from flightRecords";
	public static final String selectWhereQuery = "Select * From flightRecords where ( ";
	public static final String Empty = "";
	public static final String and = "' and ";
	public static final String depLocLike = "DEP_LOC like '";
	public static final String arrLocLike = "ARR_LOC like '" ;
	public static final String classLike = "CLASS like '" ;
	public static final String validTillLike = "VALID_TILL like '";
	public static final String whereEnd = "1=1 )";
	public static final String errorMessage = "Unable to connect to db !!!!";
	public Constants() {
		// TODO Auto-generated constructor stub
	}

}
