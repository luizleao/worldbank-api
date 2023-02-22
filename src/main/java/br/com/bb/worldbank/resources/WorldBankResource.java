package br.com.bb.worldbank.resources;

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
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/indicators")
    public ArrayList<Object> getIndicatorsByCountry(@QueryParam("country") String country) {
        String format = "json";
        return worldBankRestClient.getIndicatorsByCountry(country, format);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/countries")
    public ArrayList<Object> getCountriesList(@QueryParam("country") String country) {
        String format = "json";
        int per_page = 299;
        return worldBankRestClient.getCountriesList(format, per_page);
    }
}