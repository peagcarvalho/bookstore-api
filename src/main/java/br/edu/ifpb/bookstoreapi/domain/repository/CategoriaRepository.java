package br.edu.ifpb.bookstoreapi.domain.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.bookstoreapi.domain.model.Categoria;

@Repository
public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Integer> {

    public List<Categoria> findAllByOrderByNome();
    
}
