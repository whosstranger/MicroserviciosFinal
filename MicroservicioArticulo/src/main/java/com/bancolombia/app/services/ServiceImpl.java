package com.bancolombia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.app.datasource.ArticuloRespositorio;
import com.bancolombia.app.entities.Articulos;

@Service
public class ServiceImpl implements IService{
	@Autowired
	private ArticuloRespositorio repositorio;
	@Override
	public boolean insert(Articulos articulo) {
		// TODO Auto-generated method stub
		return repositorio.insert(articulo);
	}

	@Override
	public List<Articulos> getAll() {
		return repositorio.getAll();
	}

}
