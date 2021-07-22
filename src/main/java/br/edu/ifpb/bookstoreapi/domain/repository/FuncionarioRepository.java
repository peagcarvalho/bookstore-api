package br.edu.ifpb.bookstoreapi.domain.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.bookstoreapi.domain.model.Funcionario;

@Repository
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Integer> {
    
    List<Funcionario> findByEmail(String email);
    List<Funcionario> findByEmailAndSenha(String email, String senha);
    List<Funcionario> findByAdminTrue();

}
