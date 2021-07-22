package br.edu.ifpb.bookstoreapi.domain.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.bookstoreapi.domain.model.Cliente;
import br.edu.ifpb.bookstoreapi.domain.model.Pedido;

@Repository
public interface PedidoRepository extends PagingAndSortingRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
    List<Pedido> findByClienteOrderByDataCompraDesc(Cliente cliente);
    
}
