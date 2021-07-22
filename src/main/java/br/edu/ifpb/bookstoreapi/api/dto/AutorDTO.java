package br.edu.ifpb.bookstoreapi.api.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.edu.ifpb.bookstoreapi.domain.model.Autor;

public class AutorDTO {
	
    private Long id;
    private String nome;
    private String resumo;
    private String foto;
    
    public AutorDTO() {}
    
    public AutorDTO(Autor autor) {
    	id = autor.getId();
    	nome = autor.getNome();
    	resumo = autor.getResumo();
    	foto = autor.getFoto();
    }
    
    public List<AutorDTO> mapper(List<Autor> autores) {
    	return autores.stream().map(AutorDTO :: new).collect(Collectors.toList());
    }

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getResumo() {
		return resumo;
	}

	public String getFoto() {
		return foto;
	}

}
