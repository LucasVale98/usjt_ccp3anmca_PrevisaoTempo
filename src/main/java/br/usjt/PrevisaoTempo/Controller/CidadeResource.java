package br.usjt.PrevisaoTempo.Controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.usjt.PrevisaoTempo.Model.Cidade;
import br.usjt.PrevisaoTempo.Repository.CidadeRepository;

@RestController
public class CidadeResource {
	
	@Autowired
	private CidadeRepository cidadeRepository;
		
	//Listar todas as Cidades
	@GetMapping("/listarCidade")
	public List<Cidade> listarCidade(){
		return cidadeRepository.findAll();
	}
	
	//Listar todas as cidade cujo nome comeca com uma letra especifica
	@GetMapping("/listarEspecifica")
	public List<Cidade> listarEspecifica(@RequestBody Cidade cidade, String especifca, 
			HttpServletResponse response){
		int retorno = 0;
		for (int i = 0; i < cidade.getCidade().length(); i++) {
			int ocorreu = cidade.getCidade().indexOf(especifca, i);
			if (retorno > -1) {
				retorno++;
				i = (ocorreu + especifca.length());
			}
		}
		return (List<Cidade>) cidade;
	}
	
	
	//Cadastrar novas cidades
	@PostMapping("/salvar")
	public ResponseEntity<Cidade> carregarNova(@RequestBody Cidade cidade, HttpServletResponse response){
		Cidade city = cidadeRepository.save(cidade);
		
		URI uri = ServletUriComponentsBuilder.
				fromCurrentServletMapping().path("/{id}").
				buildAndExpand(city.getId()).
				toUri();
				//desnecessário também
				//response.setHeader("Location", uri.toASCIIString());
				return ResponseEntity.created(uri).body(city);	
	
	}
	
	
	
	@PostMapping("salvar")
	@ResponseStatus(HttpStatus.CREATED)
	public void salvar(@RequestBody Cidade cidade, HttpServletResponse response) {
		cidadeRepository.save(cidade);
	}
	
	
	
	/*public Cidade obterCidade(Cidade cidade) {
	double lati = cidade.getLatitude();
	double longi = cidade.getLongitude();
	
	return cidade;
}*/
}
