package br.com.bb.worldbank.resources;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import br.com.bb.worldbank.restclient.WorldBankRestClient;
import br.com.bb.worldbank.restclient.model.indicators.ResponseIndicators;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/worldbank")
public class WorldBankResource {

    @Inject
    @RestClient
    WorldBankRestClient worldBankRestClient;

    @GET
    @Operation(summary = "Retorna os indicadores por país")
    @APIResponse(responseCode = "200",
            content = @Content(
                    mediaType = MediaType.APPLICATION_JSON,
                    schema = @Schema(
                            implementation = Object.class,
                            type = SchemaType.ARRAY)))
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/indicators")
    public ArrayList<Object> getIndicatorsByCountry(@QueryParam("country") String country) {
        String format = "json";
        return worldBankRestClient.getIndicatorsByCountry(country, format);
    }

    @GET
    @Operation(summary = "Retorna a lista dos paises")
    @APIResponse(responseCode = "200",
            content = @Content(
                    mediaType = MediaType.APPLICATION_JSON,
                    schema = @Schema(
                            implementation = Object.class,
                            type = SchemaType.ARRAY)))
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/countries")
    public ArrayList<Object> getCountriesList() {
        String format = "json";
        int per_page = 299;
        return worldBankRestClient.getCountriesList(format, per_page);
    }
}