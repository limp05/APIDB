package br.edu.fatecfranca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecfranca.model.BasqueteEntity;
import br.edu.fatecfranca.model.BasqueteRepository;

@RestController
@RequestMapping("/api/basquete")

public class BasqueteController {
	
	
	@Autowired
	BasqueteRepository injecao;
	
	
	@GetMapping
	@CrossOrigin("*")
	public List<BasqueteEntity> getJogadores(){
		return injecao.findAll();
	}
	
	@PostMapping
	
	@CrossOrigin("*")
	public BasqueteEntity addJogador(@RequestBody BasqueteEntity jogadoresBasquete) {
		return injecao.save(jogadoresBasquete);
	}

	@DeleteMapping
	@CrossOrigin("*")
	public String removeJogador(@PathVariable Long id) {
		
		injecao.deleteById(id);
		
		return "Remoção realizada com sucesso";
	}
	
	@PutMapping
	@CrossOrigin("*")
	public BasqueteEntity updateJogador(@RequestBody BasqueteEntity jogadoresBasquete) {
		
		return injecao.save(jogadoresBasquete);
	}

}
