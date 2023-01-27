package srl.neotech.model;

public class MeteoGiornaliero {
	private String data;
	private String codiceMeteo;
	private String tempMin;
	private String tempMax;
	private String precipitazione;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getCodiceMeteo() {
		return codiceMeteo;
	}
	public void setCodiceMeteo(String codiceMeteo) {
		this.codiceMeteo = codiceMeteo;
	}
	

	public String getTempMin() {
		return tempMin;
	}
	public void setTempMin(String tempMin) {
		this.tempMin = tempMin;
	}
	public String getTempMax() {
		return tempMax;
	}
	public void setTempMax(String tempMax) {
		this.tempMax = tempMax;
	}
	public String getPrecipitazione() {
		return precipitazione;
	}
	public void setPrecipitazione(String precipitazione) {
		this.precipitazione = precipitazione;
	}
	
	@Override
	public String toString() {
		return "MeteoGiornaliero [data=" + data + ", codiceMeteo=" + codiceMeteo + ", tempMin=" + tempMin + ", tempMax="
				+ tempMax + ", precipitazione=" + precipitazione + "]";
	}
	
	
	
	

}
