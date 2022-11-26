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
		EmpleadoEntity empleadoNetflix = new EmpleadoEntity();
		EmpleadoEntity empleadoAmazon = new EmpleadoEntity();
		EmpleadoEntity empleadoHp = new EmpleadoEntity();
		EmpleadoEntity empleadoOracle = new EmpleadoEntity();
		EmpleadoEntity empleadoDeloitte = new EmpleadoEntity();
		EmpleadoEntity empleadoDisney = new EmpleadoEntity();
		
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
		
		empleadoIBM.setNombre("Diego");
		empleadoIBM.setPrimerApellido("Paniagua");
		empleadoIBM.setSegundoApellido("Lopez");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		////////////
		empleadoAmazon.setNombre("Jesus");
		empleadoAmazon.setPrimerApellido("Lopez");
		empleadoAmazon.setSegundoApellido("Romero");
		empleadoAmazon.setPuesto("CEO");
		empleadoAmazon.setEstatus(true);
		
		empleadoHp.setNombre("Guille");
		empleadoHp.setPrimerApellido("Paniagua");
		empleadoHp.setSegundoApellido("Romero");
		empleadoHp.setPuesto("Architec");
		empleadoHp.setEstatus(true);
		
		empleadoDeloitte.setNombre("Yeny");
		empleadoDeloitte.setPrimerApellido("Paniagua");
		empleadoDeloitte.setSegundoApellido("Lopez");
		empleadoDeloitte.setPuesto("Senior Developer Java");
		empleadoDeloitte.setEstatus(true);
		
		empleadoNetflix.setNombre("Carlos");
		empleadoNetflix.setPrimerApellido("Lopez");
		empleadoNetflix.setSegundoApellido("Romero");
		empleadoNetflix.setPuesto("CEO");
		empleadoNetflix.setEstatus(true);
		
		empleadoDisney.setNombre("Mirian");
		empleadoDisney.setPrimerApellido("Paniagua");
		empleadoDisney.setSegundoApellido("Romero");
		empleadoDisney.setPuesto("Architec");
		empleadoDisney.setEstatus(true);
		
		empleadoOracle.setNombre("Pedro");
		empleadoOracle.setPrimerApellido("Paniagua");
		empleadoOracle.setSegundoApellido("Lopez");
		empleadoOracle.setPuesto("Senior Developer Java");
		empleadoOracle.setEstatus(true);
		
		
		listEmpleados.add(empleadoIBM);
		listEmpleados.add(empleadoMicrosoft);
		listEmpleados.add(empleadoApple);
		listEmpleados.add(empleadoAmazon);
		listEmpleados.add(empleadoDeloitte);
		listEmpleados.add(empleadoHp);
		listEmpleados.add(empleadoDisney);
		listEmpleados.add(empleadoNetflix);
		listEmpleados.add(empleadoOracle);
		
		return listEmpleados;
	
	}
}
