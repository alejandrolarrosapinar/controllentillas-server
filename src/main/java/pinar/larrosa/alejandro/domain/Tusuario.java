package pinar.larrosa.alejandro.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tusuarios database table.
 * 
 */
@Entity
@Table(name="tusuarios")
@NamedQuery(name="Tusuario.findAll", query="SELECT t FROM Tusuario t")
public class Tusuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String login;

	private String pass;
	
	private String nombre;
	
	private String apellidos;

	public Tusuario() {
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Tusuario [login=" + login + ", pass=" + pass + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
	
	

}