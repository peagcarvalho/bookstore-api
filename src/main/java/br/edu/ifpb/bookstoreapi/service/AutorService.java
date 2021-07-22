package br.edu.ifpb.bookstoreapi.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.bookstoreapi.api.dto.AutorDTO;
import br.edu.ifpb.bookstoreapi.domain.exception.NaoEncontradoException;
import br.edu.ifpb.bookstoreapi.domain.exception.NegocioException;
import br.edu.ifpb.bookstoreapi.domain.model.Autor;
import br.edu.ifpb.bookstoreapi.domain.repository.AutorRepository;

@Service
public class AutorService {
	
	@Autowired
	private AutorRepository autorRepository;
	
	public List<AutorDTO> listar() {
		List<Autor> autores = autorRepository.findAllByOrderByNome();
		return new AutorDTO().mapper(autores);
	}
	
	public AutorDTO buscar(Long autorId) {
		Optional<Autor> autor = autorRepository.findById(autorId);
		
		if (!autor.isPresent())
			throw new NaoEncontradoException("Autor não encontrado");
		
		return new AutorDTO(autor.get());
	}
	
	@Transactional
	public AutorDTO salvar(Autor autor) {
		try {
			return new AutorDTO(autorRepository.save(autor));
		} catch (Exception e) {
			throw new NegocioException("Não foi possível salvar o autor");
		}
	}
	
	@Transactional
	public void excluir(Long autorId) {
		try {
			autorRepository.deleteById(autorId);
		} catch (Exception e) {
			throw new NegocioException("Não foi possível excluir o autor");
		}
	}

}
