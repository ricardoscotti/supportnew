package com.support.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.support.model.Mensagem;


@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Long> {
	
	

}
