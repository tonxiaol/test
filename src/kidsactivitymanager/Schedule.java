package kidsactivitymanager;

import java.time.LocalDate;
import java.time.LocalTime;


public class Schedule {

	private LocalDate startDate;
	private LocalDate endDate;
	private LocalTime startTime;
	private LocalTime endTime;

	public LocalDate getStartDate() {
		return this.startDate;
	}

	/**
	 * 
	 * @param startDate
	 */
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return this.endDate;
	}

	/**
	 * 
	 * @param endDate
	 */
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalTime getStartTime() {
		return this.startTime;
	}

	/**
	 * 
	 * @param startTime
	 */
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return this.endTime;
	}

	/**
	 * 
	 * @param endTime
	 */
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public double getHours() {
		// TODO - implement Schedule.getHours
		throw new UnsupportedOperationException();
	}

	public int getPeriod() {
		// TODO - implement Schedule.getPeriod
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Schedule.toString
		throw new UnsupportedOperationException();
	}

}