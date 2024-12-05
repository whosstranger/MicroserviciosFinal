package com.bancolombia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.app.datasource.EmpleadosRespositorio;
import com.bancolombia.app.entities.Empleados;

@Service
public class ServiceImpl implements IService {
	@Autowired
	private EmpleadosRespositorio repositorio;
	@Override
	public boolean insert(Empleados empleados){
		return repositorio.insert(empleados);
	}
	@Override
	public List<Empleados> getAll(){
		return repositorio.getAll();
	}

}
