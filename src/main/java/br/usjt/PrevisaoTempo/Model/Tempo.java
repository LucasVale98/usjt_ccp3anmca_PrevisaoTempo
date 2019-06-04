package br.usjt.PrevisaoTempo.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_tempo")
public class Tempo implements Serializable{
	private static final long serialVersuinUID = 1l;
	
	@Id
	@GeneratedValue
	private long id;
	private String dia,descricao,data_Hora;
	private double temp_Min,temp_Max,umidade,latitude,longitude;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getData_Hora() {
		return data_Hora;
	}
	public void setData_Hora(String data_Hora) {
		this.data_Hora = data_Hora;
	}
	public double getTemp_Min() {
		return temp_Min;
	}
	public void setTemp_Min(double temp_Min) {
		this.temp_Min = temp_Min;
	}
	public double getTemp_Max() {
		return temp_Max;
	}
	public void setTemp_Max(double temp_Max) {
		this.temp_Max = temp_Max;
	}
	public double getUmidade() {
		return umidade;
	}
	public void setUmidade(double umidade) {
		this.umidade = umidade;
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
		return "Tempo [id=" + id + ", dia=" + dia + ", descricao=" + descricao + ", data_Hora=" + data_Hora
				+ ", temp_Min=" + temp_Min + ", temp_Max=" + temp_Max + ", umidade=" + umidade + ", latitude="
				+ latitude + ", longitude=" + longitude + "]";
	}
	
	
}
