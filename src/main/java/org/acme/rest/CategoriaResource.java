package org.acme.rest;

import jdk.jfr.TransitionTo;
import org.acme.model.Categoria;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/categoria")
@Produces(MediaType.APPLICATION_JSON)
public class CategoriaResource {

    @Transactional
    @POST

    public void insert(Categoria categoria) {
         Categoria.persist(categoria);

    }


    @Path("{id}")
    @GET



    public Categoria getById(@PathParam("id") long id) {
        /*var categoria = new Categoria(
                "Eletronicos",
                "Equipamentos eletronicos"
        );

        categoria.id = id;
        categoria.titulo="Eletronicos Importados";
        */
                return Categoria.findById(id);

    }


}