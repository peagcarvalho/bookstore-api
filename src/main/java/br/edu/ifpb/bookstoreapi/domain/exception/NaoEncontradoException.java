package br.edu.ifpb.bookstoreapi.domain.exception;

public class NaoEncontradoException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public NaoEncontradoException(String mensagem) {
		super(mensagem);
	}

}
