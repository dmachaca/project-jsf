package com.devpredator.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.devpredator.dto.UsuarioDTO;

@ManagedBean
public class LoginController {
	
	private String usuario;
	private String password;
	
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void ingresar() {
		System.out.println("Muestra el usuario despues de dar clic -> " + this.getUsuario());
		if (usuario.equals("devpredator") && password.equals("123456")) {
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				FacesContext.getCurrentInstance().addMessage("formLogin:txtusuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "Page no found", ""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtusuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrecto", ""));
		}
	}
	
	public void redireccionar(String urlPagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(urlPagina);
	}
	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}
	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}
	
}
