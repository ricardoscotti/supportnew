package com.support.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.support.model.Mensagem;
import com.support.repository.MensagemRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {
	
	@Autowired
	private MensagemRepository mensagemRepository;
	
	@GetMapping
	public List<Mensagem> listar() {
		return mensagemRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Mensagem adicionar(@RequestBody Mensagem mensagem) {
		return mensagemRepository.save(mensagem);
	}

}
