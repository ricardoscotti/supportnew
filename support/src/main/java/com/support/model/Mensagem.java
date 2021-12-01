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

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    
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



	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getId_ticket() {
		return id_ticket;
	}

	public void setId_ticket(String id_ticket) {
		this.id_ticket = id_ticket;
	}

}

