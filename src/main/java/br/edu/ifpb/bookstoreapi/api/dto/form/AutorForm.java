package br.edu.ifpb.bookstoreapi.api.dto.form;

import javax.validation.constraints.NotBlank;

import br.edu.ifpb.bookstoreapi.domain.model.Autor;

public class AutorForm {
	
	private Long id;
	
	@NotBlank
    private String nome;
	
	@NotBlank
    private String resumo;
	
	@NotBlank
    private String foto;
	
	public Autor parse() {
		var autor = new Autor();
		autor.setId(id);
		autor.setNome(nome);
		autor.setResumo(resumo);
		autor.setFoto(foto);
		
		return autor;
	}

	public void setId(Long id) {
		this.id = id;
	}
    
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}

}
