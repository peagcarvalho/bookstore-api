package br.edu.ifpb.bookstoreapi.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.bookstoreapi.api.dto.AutorDTO;
import br.edu.ifpb.bookstoreapi.api.dto.form.AutorForm;
import br.edu.ifpb.bookstoreapi.service.AutorService;

@RestController
@RequestMapping(name = "autores")
public class AutorController {
	
	@Autowired
	private AutorService autorService;
	
	@GetMapping
	public List<AutorDTO> listar() {
		return autorService.listar();
	}
	
	@GetMapping("/{id}")
	public AutorDTO buscar(@PathVariable(name = "id") Long autorId) {
		return autorService.buscar(autorId);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public AutorDTO cadastrar(@RequestBody @Valid AutorForm form) {
		return autorService.salvar(form.parse());
	}
	
	@PutMapping
	public AutorDTO atualizar(@RequestBody @Valid AutorForm form) {
		return autorService.salvar(form.parse());
		
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void excluir(@PathVariable(name = "id") Long autorId) {
		autorService.excluir(autorId);
	}

}
