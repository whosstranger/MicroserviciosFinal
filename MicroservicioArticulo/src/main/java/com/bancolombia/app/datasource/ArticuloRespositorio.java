package com.bancolombia.app.datasource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bancolombia.app.entities.Articulos;

@Component
public class ArticuloRespositorio {
	private final List<Articulos> lista=new ArrayList<>();
	
		public boolean insert(Articulos articulos) {
			return lista.add(articulos);
		}
		public List<Articulos> getAll(){
			return lista;
		}
}
