package br.usjt.PrevisaoTempo.Repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Async;

import br.usjt.PrevisaoTempo.Model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

	//	public Cidade findByLatitude(String latitude);
	//	public Cidade findByLongitude(String longitude);
	//-------------------------------------------------------------------------------------
	public Cidade findBylatitudeAndLongitude(String latitude, String longitude);
	
	public List<Cidade> queryByNome(String nome);
	
	//-------------------------------------------------------------------------------------
	public Cidade findByLatitudeAndLongitudeIgnoreCase(String latitude, String longitude);
	
	public List<Cidade> queryByNomeIgnoreCase(String nome);
	
	//-------------------------------------------------------------------------------------
	@Async
	public Future <List<Cidade>>  findByLatitudeAndLongitude(String latitude, String logintude);
	
	@Async
	public Future <List<Cidade>> findByNome(String nome);
	
	@Async
	public Future <List<Cidade>> findByNomeIgnoreCase(String nome);
	
	@Query("SELECT c FROM Cidade c WHERE c.latitude = ?1 AND c.longitude = ?2")
	public Cidade findByLatitudeAndLongitude1(String latitude, String longitude);
	
	@Query("SELECT c FROM Cidade c WHERE c.latitude = ?1 AND c.longitude = ?2")
	public List<Cidade> findByLatitudesAndLongitude(String latitude, String longitude);
	
//	@Query("SELECT c FROM lower Cidade c WHERE c.latitude = ?1 AND c.longitude = ?2")
//	public List<Cidade> findByLatitudeAndLongitude2(String latitude, String longitude);
}
