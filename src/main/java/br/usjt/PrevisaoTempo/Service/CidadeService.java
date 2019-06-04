package br.usjt.PrevisaoTempo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import br.usjt.PrevisaoTempo.Model.Cidade;
import br.usjt.PrevisaoTempo.Repository.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	public void salvar(Cidade cidade) {
		cidadeRepository.save(cidade);
	}
	
	public java.util.List<Cidade> Listar(){
		return cidadeRepository.findAll();
	}


}
