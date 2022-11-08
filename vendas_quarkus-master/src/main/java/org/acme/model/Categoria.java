package org.acme.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Locale;

@Entity
public class Categoria extends AbstractEntity {
    public String titulo;
    public String descricao;


    public Categoria() {
    }

    public Categoria(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao=descricao;
    }
}