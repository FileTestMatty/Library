package it.alfasoft;

//import javax.enterprise.context.ApplicationScoped;
//import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/author")
//@ApplicationScoped
public class AuthorRs {


    private AuthorDaoJPA ge =  new AuthorDaoJPA();


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAutori(@QueryParam("page") int page, @QueryParam("size") int size ) {

        try {

           List<Author> list = ge.read(page, size);
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
            Author autore = new Author (nameAuthor, surnameAuthor);
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
            Author autore = ge.getById(id);
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
            Author autore = new Author(nameAuthor, surnameAuthor);
            List<Author> list = ge.find(autore);
            return Response.ok(list).build();

        } catch ( Exception e ) {

            e.printStackTrace();
            return Response.status(500).entity("Errore Rest getServiceById").build();

        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateAuthor(Author autore) {

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