package br.usjt.PrevisaoTempo.Teste;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.usjt.PrevisaoTempo.Model.Tempo;
import br.usjt.PrevisaoTempo.Repository.TempoRepository;

@SpringBootTest
@RunWith (SpringRunner.class)
public class AllTests {

	@Autowired
	private TempoRepository tempoRepository;
	
	@Test
	public void inserirTemperatura() {
		Tempo tempo = new Tempo();
		
		tempo.setDia("Segunda-Feira");
		tempo.setTemp_Min(15);
		tempo.setTemp_Max(34);
		tempo.setUmidade(89);
		tempo.setDescricao("Parcialmente Ensolarado");
		tempo.setData_Hora("12/03/2019");
		tempo.setLatitude(-12.1245);
		tempo.setLongitude(-45.2376);
		tempoRepository.save(tempo);

		
	}
}
