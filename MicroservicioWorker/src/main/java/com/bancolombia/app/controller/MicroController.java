package com.bancolombia.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.app.entities.Empleados;
import com.bancolombia.app.services.IService;

@RestController
@RequestMapping("/empleados")
public class MicroController {
	@Autowired
	private IService servicio;
	
	@PostMapping
	public ResponseEntity<String> insert (@RequestBody Empleados empleados){
		if(servicio.insert(empleados))
			return new ResponseEntity<String>("Ok", HttpStatus.CREATED);
		return new ResponseEntity<String>("NOT OK", HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping // GET -> http://ip:port/item 
	public ResponseEntity<List<Empleados>> get(){
		return new ResponseEntity<List<Empleados>>(servicio.getAll(), HttpStatus.OK);
	}
}
