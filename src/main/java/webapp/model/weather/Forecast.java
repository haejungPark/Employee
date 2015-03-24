package webapp.model.weather;

import java.util.Date;

//<forecast shortday="금" day="금요일" date="2015-03-13" precip="10" skytextday="구름 없음" skycodeday="32" high="10" low="-4"/>
public class Forecast {
	Integer low;
	Integer high;
	String skycodeday;
	String skytextday;
	Date date;
	String shortday;
	String day;
	Integer precip;
	
	public Integer getLow() {
		return low;
	}
	public void setLow(Integer low) {
		this.low = low;
	}
	public Integer getHigh() {
		return high;
	}
	public void setHigh(Integer high) {
		this.high = high;
	}
	public String getSkycodeday() {
		return skycodeday;
	}
	public void setSkycodeday(String skycodeday) {
		this.skycodeday = skycodeday;
	}
	public String getSkytextday() {
		return skytextday;
	}
	public void setSkytextday(String skytextday) {
		this.skytextday = skytextday;
	}
	public String getShortday() {
		return shortday;
	}
	public void setShortday(String shortday) {
		this.shortday = shortday;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getPrecip() {
		return precip;
	}
	public void setPrecip(Integer precip) {
		this.precip = precip;
	} 
			
			 
			
	
	

}
