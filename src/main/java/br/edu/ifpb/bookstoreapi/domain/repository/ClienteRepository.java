package br.edu.ifpb.bookstoreapi.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.bookstoreapi.domain.model.Cliente;

@Repository
public interface ClienteRepository extends PagingAndSortingRepository<Cliente, String> {
    
}
