package com.example.demo.models.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Usuario")
	private Integer idUsuario;
	@Column(name = "nombre_Usuario")
	private String nombreUsuario;
	@Column(name = "correo_Usuario")
	private String correoUsuario;
	@Column(name = "username")
	private String usuario;
	@Column(name = "contraseña_Usuario")
	private String contraseña;

	public Usuario() {
	}

	public Usuario(int idUsuario, String nombreUsuario, String correoUsuario, String usuario, String contraseña) {
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.correoUsuario = correoUsuario;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
