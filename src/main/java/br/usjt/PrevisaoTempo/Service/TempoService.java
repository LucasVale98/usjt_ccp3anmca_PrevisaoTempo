package br.usjt.PrevisaoTempo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.PrevisaoTempo.Model.Cidade;
import br.usjt.PrevisaoTempo.Model.Tempo;
import br.usjt.PrevisaoTempo.Repository.TempoRepository;

@Service
public class TempoService {

	@Autowired
	private TempoRepository tempoRepository;

	@Autowired
	public void salvar(Tempo tempo) {
		tempoRepository.save(tempo);
	}
	
	
	public java.util.List<Tempo> Listar(){
		return tempoRepository.findAll();
	}

}
