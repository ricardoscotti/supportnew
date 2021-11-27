package com.support.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.support.model.Mensagem;
import com.support.repository.MensagemRepository;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {
	
	@Autowired
	private MensagemRepository mensagemRepository;
	
	
	  @GetMapping
	  public ArrayList<Mensagem> listar(@RequestParam String id_ticket) { 
		  List<Mensagem> mensagens = mensagemRepository.findAll();
		  ArrayList<Mensagem> lista = new ArrayList<Mensagem>();
		  	for (Mensagem u : mensagens) {
	            if (u.getId_ticket().equals(id_ticket)) {
	            	
	            	lista.add(u);
	                }
	           }
		  return lista;
	
}
	  
	  @DeleteMapping("/{id}")
		public void remover(@PathVariable Long id) {
			 mensagemRepository.deleteById(id);
		}
	  
	  @PostMapping public Mensagem adicionar(@RequestBody Mensagem mensagem) { return
			   mensagemRepository.save(mensagem); }
	  
	  @PutMapping("/{id}")
		public void updateMensagem(@RequestBody Mensagem mensagem) {
		        mensagemRepository.save(mensagem);
		  } 

}
