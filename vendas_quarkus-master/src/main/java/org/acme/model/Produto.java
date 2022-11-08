package org.acme.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Produto extends AbstractEntity {
    public String nome;


    @ManyToOne
    public Categoria categoria;
}
