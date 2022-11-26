package com.devpredator.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.entitys.EmpleadoEntity;
import com.devpredator.services.EmpleadoService;;

/*
 * @author 	DMACHACA
 * Clase controller que se encarga de procesar la informacion para la pantalla principal.xhtml
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	
	/*
	 * Lista de empleados para la tabla
	 */
	private List<EmpleadoEntity> listEmpleados;
	
	/**
	 * Lista de empleados filtrados para la tabla
	 */
	private List<EmpleadoEntity> empleadosFiltrados;
	/*
	 * Servicio con los metodos que realizan la logica de negocio de Empleados.
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * Metodo que se encarga de inicializar la informacion del pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	/*
	 * Metodo que consulta la lista de empleados
	 */
	public void consultarEmpleados() {
		
		this.listEmpleados = this.empleadoService.consultarEmpleados();
	}

	public List<EmpleadoEntity> getListEmpleados() {
		return listEmpleados;
	}

	public void setListEmpleados(List<EmpleadoEntity> listEmpleados) {
		this.listEmpleados = listEmpleados;
	}

	public List<EmpleadoEntity> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	public void setEmpleadosFiltrados(List<EmpleadoEntity> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}
	
}
