package br.usjt.PrevisaoTempo.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// pega a sessão
		HttpSession session = request.getSession();
		// se ainda não logou, manda para a página de login
		if (session.getAttribute("usuarioLogado") == null)
			response.sendRedirect("login");
		return true;
	}

}
