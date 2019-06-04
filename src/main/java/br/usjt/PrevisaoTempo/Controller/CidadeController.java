package br.usjt.PrevisaoTempo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.usjt.PrevisaoTempo.Model.Cidade;
import br.usjt.PrevisaoTempo.Repository.CidadeRepository;
import br.usjt.PrevisaoTempo.Service.CidadeService;

@Controller
public class CidadeController {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private CidadeService cidadeService;
	
	@GetMapping("cidade")
	public String cidade(Cidade cidade) {
		cidadeService.salvar(cidade);
		return "redirect:/cidade";
	}
}
