package br.usjt.PrevisaoTempo.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="tb_cidade")
@NamedQuery (name = "Cidade.buscarLatitudeELongitude",
			 query = "SELECT c FROM Cidade c WHERE latitude = :latitude AND longitude = :longitude")
public class Cidade implements Serializable{
	
	private static final long serialVersuinUID = 1l;
	
	@Id
	@GeneratedValue
	private long id;
	private String cidade;
	private double latitude, longitude;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
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
	public static long getSerialversuinuid() {
		return serialVersuinUID;
	}
	@Override
	public String toString() {
		return "Cidade [id=" + id + ", cidade=" + cidade + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", getId()=" + getId() + ", getCidade()=" + getCidade() + ", getLatitude()=" + getLatitude()
				+ ", getLongitude()=" + getLongitude() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
}
