package org.acme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Produto extends AbstractEntity {
    @Version
    @Column(columnDefinition = "int default 0")
    public long version = 0;

    public String nome;


    @ManyToOne
    public Categoria categoria;
}
