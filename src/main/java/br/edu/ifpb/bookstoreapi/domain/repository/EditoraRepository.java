package br.edu.ifpb.bookstoreapi.domain.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.bookstoreapi.domain.model.Editora;

@Repository
public interface EditoraRepository extends PagingAndSortingRepository<Editora, Integer> {

    public List<Editora> findAllByOrderByNomeAsc();

}
