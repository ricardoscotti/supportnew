package com.support.model;



import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "id_usuario")
    private String id_usuario;
    
    @Column(name = "status")
    private String status;

	
	  @Temporal(TemporalType.TIMESTAMP)
	  
	  @Column(name = "lastUpdate") private Date LastUpdate;
	  
	  @PrePersist private void onCreate() { LastUpdate = new Date(); }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLastUpdate() {
		return LastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		LastUpdate = lastUpdate;
	}
	 

	 

    
    
}

