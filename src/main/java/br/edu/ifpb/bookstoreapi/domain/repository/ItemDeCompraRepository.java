package br.edu.ifpb.bookstoreapi.domain.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.bookstoreapi.domain.model.ItemDeCompra;
import br.edu.ifpb.bookstoreapi.domain.model.Livro;
import br.edu.ifpb.bookstoreapi.domain.model.Pedido;

@Repository
public interface ItemDeCompraRepository extends PagingAndSortingRepository<ItemDeCompra, Integer> {

    List<ItemDeCompra> findDistinctByLivroComprado(Livro livro);
    List<ItemDeCompra> findByPedido(Pedido pedido);

    /*@Query(value = "SELECT DISTINCT livro_id, sum(quantidade) FROM ItemDeCompra order by quantidade desc")
    List<ItemDeCompra> findTheBestSellers();*/

}
