package br.edu.univas.si8.ta.hello.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/inventory")
public interface InventoryService {

	@GET
	@Path("/product/names")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listProductNames();

	@POST
	@Path("/product/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	String saveNewProduct(@PathParam("name") String name);

}
