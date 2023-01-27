package srl.neotech.model;

import java.util.ArrayList;

public class OpenMeteoDaily {
	
	    private ArrayList<String> time;
	    private ArrayList<Integer> weathercode;
	    private ArrayList<Double> temperature_2m_min;
	    private ArrayList<Double> temperature_2m_max;
	    private ArrayList<Double> rain_sum;
	    
	    
		public ArrayList<String> getTime() {
			return time;
		}
		public void setTime(ArrayList<String> time) {
			this.time = time;
		}
		public ArrayList<Integer> getWeathercode() {
			return weathercode;
		}
		public void setWeathercode(ArrayList<Integer> weathercode) {
			this.weathercode = weathercode;
		}
		public ArrayList<Double> getTemperature_2m_min() {
			return temperature_2m_min;
		}
		public void setTemperature_2m_min(ArrayList<Double> temperature_2m_min) {
			this.temperature_2m_min = temperature_2m_min;
		}
		public ArrayList<Double> getTemperature_2m_max() {
			return temperature_2m_max;
		}
		public void setTemperature_2m_max(ArrayList<Double> temperature_2m_max) {
			this.temperature_2m_max = temperature_2m_max;
		}
		public ArrayList<Double> getRain_sum() {
			return rain_sum;
		}
		public void setRain_sum(ArrayList<Double> rain_sum) {
			this.rain_sum = rain_sum;
		}
	    
	    

}
