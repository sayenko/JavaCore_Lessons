package ua.lvil.lgs;

/**
 * @since java 1.8
 * @author Eugene
 * @version 2.2 
 * */
public enum Months {
	/* Month name*/
	JANUARY(31, Seasons.WINTER),
	FEBRUARY(29, Seasons.WINTER),
	MARCH(31, Seasons.SPRING),
	APRIL(30, Seasons.SPRING),
	MAY(31, Seasons.SPRING),
	JUNE(30, Seasons.SUMMER),
	JULY(31, Seasons.SUMMER),
	AUGUST(31, Seasons.SUMMER),
	SEPTEMBER(30, Seasons.FALL),
	OCTOBER(31, Seasons.FALL),
	NOVEMBER(30, Seasons.FALL),
	DECEMBER(31, Seasons.WINTER);
	
	/* Number of days in a month */
	int day;
	
	/* Season information*/
	Seasons season;
	
	/**
	 * Class constructor.
	 * Initializes a newly created object
	 * 
	 * @param day
	 * 		  Number of days in a month
	 * 
	 * @param season
	 * 		  Season information
	 * 
	 * */
	private Months(int day, Seasons season) {
		this.day = day;
		this.season = season;
	}
	
	
	
	/**
	 * Return number of days in a month
	 * 
	 * @param no input params
	 * 
	 * */
	public int getDay() {
		return day;
	}

	
	/**
	 * returns the name of the season to which the month belongs
	 * 	 * 
	 * @param no input params
	 * 
	 * */
	public Seasons getSeason() {
		return season;
	}
	
	
}
