package com.devpredator.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.entitys.EmpleadoEntity;

/**
 * 
 * @author DMACHACA
 * Clase que permite realizar la logica de negocio para empleados
 *
 */
public class EmpleadoService {
	public List<EmpleadoEntity> consultarEmpleados(){
		//Generar la lista de empleados a consultar
		List<EmpleadoEntity> listEmpleados = new ArrayList<EmpleadoEntity>();
		EmpleadoEntity empleadoIBM = new EmpleadoEntity();
		EmpleadoEntity empleadoMicrosoft = new EmpleadoEntity();
		EmpleadoEntity empleadoApple = new EmpleadoEntity();
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis Jesus");
		empleadoMicrosoft.setPrimerApellido("Lopez");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("Paniagua");
		empleadoApple.setSegundoApellido("Romero");
		empleadoApple.setPuesto("Architec");
		empleadoApple.setEstatus(true);
		
		listEmpleados.add(empleadoIBM);
		listEmpleados.add(empleadoMicrosoft);
		listEmpleados.add(empleadoApple);
		
		return listEmpleados;
	
	}
}
