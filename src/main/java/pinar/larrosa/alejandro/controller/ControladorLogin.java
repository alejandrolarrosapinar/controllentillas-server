package pinar.larrosa.alejandro.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import pinar.larrosa.alejandro.domain.Tusuario;
import pinar.larrosa.alejandro.service.Service;


@RestController
public class ControladorLogin {

	@Autowired
	private Service servicio;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value="/logging")
	public List<Tusuario> logging(@RequestBody Tusuario usuario) {
		List<Tusuario> usu = servicio.logging(usuario);
		if(usu!=null && !usu.isEmpty()) {
			System.out.println(usu);
			return usu;
		}
		return null;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value="/loggup")
	public Tusuario loggup(@RequestBody Tusuario usuario) {
		try{
			return servicio.loggup(usuario);
		}catch(Exception ex) {
			if(ex instanceof MySQLIntegrityConstraintViolationException) {
				return null;
			}
			return null;
			
		}
		
	}
	
	@GetMapping("/")
	public String get() {
		return "get";
	}
}
