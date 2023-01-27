package srl.neotech.model;

public class OpenMeteoRoot {

	private double latitude;
    private double longitude;
    private double generationtime_ms;
    private int utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private double elevation;
    private OpenMeteoDailyUnits daily_units;
    private OpenMeteoDaily daily;
    
    
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getGenerationtime_ms() {
		return generationtime_ms;
	}
	public void setGenerationtime_ms(double generationtime_ms) {
		this.generationtime_ms = generationtime_ms;
	}
	public int getUtc_offset_seconds() {
		return utc_offset_seconds;
	}
	public void setUtc_offset_seconds(int utc_offset_seconds) {
		this.utc_offset_seconds = utc_offset_seconds;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getTimezone_abbreviation() {
		return timezone_abbreviation;
	}
	public void setTimezone_abbreviation(String timezone_abbreviation) {
		this.timezone_abbreviation = timezone_abbreviation;
	}
	public double getElevation() {
		return elevation;
	}
	public void setElevation(double elevation) {
		this.elevation = elevation;
	}
	public OpenMeteoDailyUnits getDaily_units() {
		return daily_units;
	}
	public void setDaily_units(OpenMeteoDailyUnits daily_units) {
		this.daily_units = daily_units;
	}
	public OpenMeteoDaily getDaily() {
		return daily;
	}
	public void setDaily(OpenMeteoDaily daily) {
		this.daily = daily;
	}
    
    
}
