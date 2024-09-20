package it.alfasoft;

import authorDao.Autore;
import authorDao.GestioneAutori;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/author")
@ApplicationScoped
public class AuthorRs {

    @Inject
    //private GestioneAutori ge;
    private IDao<Autore,Integer> ge;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAutori(@QueryParam("page") int page, @QueryParam("size") int size ) {

        try {

           List<Autore> list = ge.read(page, size);
            return Response.ok(list).build();

        } catch ( Exception e ) {

            e.printStackTrace();
            return Response.status(500).entity("Errore Rest getService").build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createAutore(@QueryParam("nameAuthor") String nameAuthor, @QueryParam("surnameAuthor") String surnameAuthor) {

        try {
            //Integer row = authorService.getIAuthorServirceImplPort().createAuthors(autore);
            Autore autore = new Autore (nameAuthor, surnameAuthor);
            Integer row = ge.create(autore);
            return Response.ok(row).build();

        } catch ( Exception e ) {

            e.printStackTrace();
            return Response.status(500).entity("Errore Rest createService").build();
        }
    }

    @DELETE
    @Path("/delete/{id}")
    public Response deleteAutore(@PathParam("id") Integer id) {

        try {

           // Integer row = authorService.getIAuthorServirceImplPort().deleteAuthors(id);
            Integer row = ge.delete(id);
            return Response.ok(row).build();

        } catch (Exception e ) {

            e.printStackTrace();
            return Response.status(500).entity("Errore Rest deleteService").build();
        }
    }



    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAutoreById(@PathParam("id") Integer id) {

        try {

           // Autore autore = authorService.getIAuthorServirceImplPort().getById(id);
            Autore autore = ge.getById(id);
            return Response.ok(autore).build();

        } catch ( Exception e ) {

            e.printStackTrace();
            return Response.status(500).entity("Errore Rest getServiceById").build();
        }

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/search")
    public Response getAutoreSearch( @QueryParam("nameAuthor") String nameAuthor, @QueryParam("surnameAuthor") String surnameAuthor ) {

        try {

            //List<Autore> list = authorService.getIAuthorServirceImplPort().find(autore);
            Autore autore = new Autore(nameAuthor, surnameAuthor);
            List<Autore> list = ge.find(autore);
            return Response.ok(list).build();

        } catch ( Exception e ) {

            e.printStackTrace();
            return Response.status(500).entity("Errore Rest getServiceById").build();

        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateAuthor(Autore autore) {

        try {

            //Integer row = authorService.getIAuthorServirceImplPort().update(autore);
            Integer row = ge.update(autore);
            return Response.ok(row).build();

        } catch (Exception e) {

            e.printStackTrace();
            return Response.status(500).entity("Errore Rest updateService").build();
        }
    }
}