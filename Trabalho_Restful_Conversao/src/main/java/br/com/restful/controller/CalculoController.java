package br.com.restful.controller;

import br.com.restful.service.CalculoService;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/calculo")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class CalculoController {

    @EJB
    private CalculoService calculoService;

    @GET
    @Path("/metros-para-polegadas/{valor}")
    public Response metrosParaPolegadas(@PathParam("valor") Double valor) {
        return Response.ok(calculoService.metrosToPolegadas(valor)).build();
    }

    @GET
    @Path("/polegadas-para-metro/{valor}")
    public Response polegadasParaMetros(@PathParam("valor") Double valor) {
        return Response.ok(calculoService.polegadasToMetro(valor)).build();
    }

    @GET
    @Path("/metros-para-pes/{valor}")
    public Response metrosParaPes(@PathParam("valor") Double valor) {
        return Response.ok(calculoService.metrosToPes(valor)).build();
    }

    @GET
    @Path("/pes-para-metros/{valor}")
    public Response pesParaMetros(@PathParam("valor") Double valor) {
        return Response.ok(calculoService.pesToMetros(valor)).build();
    }

    @GET
    @Path("/polegadas-para-pes/{valor}")
    public Response polegadasParaPes(@PathParam("valor") Double valor) {
        return Response.ok(calculoService.polegadasToPes(valor)).build();
    }

    @GET
    @Path("/pes-para-polegadas/{valor}")
    public Response pesParaPolegadas(@PathParam("valor") Double valor) {
        return Response.ok(calculoService.pesToPolegadas(valor)).build();
    }
}
