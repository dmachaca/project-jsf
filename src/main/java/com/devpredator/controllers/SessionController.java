package com.devpredator.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.devpredator.dto.UsuarioDTO;

@ManagedBean
@SessionScoped
public class SessionController {
	
	private UsuarioDTO usuarioDTO;
	
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en la sesion....");
	}
	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
}
