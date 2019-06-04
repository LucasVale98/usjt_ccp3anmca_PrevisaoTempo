package br.usjt.PrevisaoTempo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.PrevisaoTempo.Model.Usuario;

public interface UsuarioRespository extends JpaRepository<Usuario, Long>{
	public Usuario findOneByUsuario(String login, String senhas);

	public Object findOneByLoginAndSenha(String login, String senha);
}
