package com.bancolombia.app.datasource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bancolombia.app.entities.Empleados;

@Component
public class EmpleadosRespositorio {
	private final List<Empleados> lista=new ArrayList<>();
	
	public boolean insert(Empleados empleados) {
		return lista.add(empleados);
	}
	public List<Empleados> getAll(){
		return lista;
	}
}
