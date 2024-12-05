package com.bancolombia.app.services;

import java.util.List;

import com.bancolombia.app.entities.Articulos;

public interface IService {
	boolean insert(Articulos articulo);
	List<Articulos> getAll();
}
