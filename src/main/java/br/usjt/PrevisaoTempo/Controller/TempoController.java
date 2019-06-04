package br.usjt.PrevisaoTempo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.PrevisaoTempo.Repository.TempoRepository;

public class TempoController {

	@Autowired
	private TempoRepository tempoRepository;
	
	public TempoController (TempoRepository tempoRepository) {
		this.tempoRepository = tempoRepository;
	}
}
