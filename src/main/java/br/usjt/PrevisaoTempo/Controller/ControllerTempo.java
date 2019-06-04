package br.usjt.PrevisaoTempo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import antlr.collections.List;
import br.usjt.PrevisaoTempo.Model.Tempo;
import br.usjt.PrevisaoTempo.Repository.TempoRepository;

@Controller
public class ControllerTempo {	
	
	@Autowired
	private TempoRepository tempoRepository;
	@Autowired
	private br.usjt.PrevisaoTempo.Service.TempoService tempoService;
	
	/*@GetMapping("tempo")
	public ModelAndView listarTempo() {
		ModelAndView mv = new ModelAndView("lista_temperatura");
		
		mv.addObject(new Tempo());
		
		List tempo = (List) ((JpaRepository<Tempo, String>) tempoService).findAll();
		
		mv.addObject("tempo", tempo);
		
		return mv;
	}*/
	
	@PostMapping("tempo")
	public String salvar(Tempo tempo) {
		tempoService.salvar(tempo);
		return "redirect:/tempo";
	}
}
