package br.edu.ifpb.bookstoreapi.domain.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.bookstoreapi.domain.model.Autor;

@Repository
public interface AutorRepository extends PagingAndSortingRepository<Autor, Long> {
    
    List<Autor> findByNomeContaining(String nome);
    List<Autor> findAllByOrderByNome();

}
