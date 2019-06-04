package br.usjt.PrevisaoTempo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import br.usjt.PrevisaoTempo.Model.Usuario;
import br.usjt.PrevisaoTempo.Repository.UsuarioRespository;

public class LoginService {

	@Autowired
	UsuarioRespository usuarioRespository;
	
	@Autowired
	public boolean logar(Usuario usuario) {
		return usuarioRespository.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
	
	
}
