package org.acme.rest;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import org.acme.model.Produto;

public interface ProdutoResource
        extends PanacheEntityResource<Produto, Long> {

}
