package com.bancolombia.app.services;

import java.util.List;

import com.bancolombia.app.entities.Empleados;

public interface IService {
	boolean insert(Empleados empleados);
	List<Empleados> getAll();
}
