package br.edu.ifpb.bookstoreapi.domain.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Funcionario")
public class Funcionario extends Usuario {

	private static final long serialVersionUID = 1L;
	
	private boolean admin;
    
    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
}
