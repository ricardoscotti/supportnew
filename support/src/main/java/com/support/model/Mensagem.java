package com.support.model;

import javax.persistence.*;

@Entity
@Table(name = "mensagem")
public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mensagem")
    private Long id;

    @Column(name = "mensagem")
    private String mensagem;

    @Column(name = "id_usuario")
    private String id_usuario;
    
    @Column(name = "id_ticket")
    private String id_ticket;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(String id_ticket) {
		this.id_ticket = id_ticket;
	}

}

