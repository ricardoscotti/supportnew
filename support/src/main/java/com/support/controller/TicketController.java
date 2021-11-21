package com.support.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.support.model.Ticket;
import com.support.repository.TicketRepository;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	
	  @GetMapping
	  public ArrayList<Ticket> listar(@RequestParam String id_usuario) { 
		  List<Ticket> tickets = ticketRepository.findAll();
		  ArrayList<Ticket> lista = new ArrayList<Ticket>();
		  	for (Ticket u : tickets) {
	            if (u.getId_usuario().equals(id_usuario)) {
	            	
	            	lista.add(u);
	                }
	           }
		  return lista;
	
}}
