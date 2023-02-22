package br.com.bb.worldbank.restclient;

import br.com.bb.worldbank.restclient.model.indicators.ResponseIndicators;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@RegisterRestClient(configKey="extensions-api")
public interface WorldBankRestClient {

    @GET
    @Path("/{country}/indicator/SI.POV.DDAY")
    @Produces(MediaType.APPLICATION_JSON)
    ArrayList<Object> getIndicatorsByCountry(@PathParam("country") String country,
                                             @QueryParam("format") String format);

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    ArrayList<Object> getCountriesList(@QueryParam("format") String format,
                                       @QueryParam("per_page") int per_page);
}
