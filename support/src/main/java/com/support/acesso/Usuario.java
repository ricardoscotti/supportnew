package com.support.acesso;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="usuario")
public class Usuario {
	
	//@Id
	//@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id_usuario;
	private String email_usuario;
	private String senha_usuario;
	
	public Usuario() {
		
	}
	public Usuario(Long id_usuario, String email_usuario, String senha_usuario) {
		
		this.id_usuario = id_usuario;
		this.email_usuario = email_usuario;
		this.senha_usuario = senha_usuario;
	}
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getSenha_usuario() {
		return senha_usuario;
	}
	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}
	
	
}
