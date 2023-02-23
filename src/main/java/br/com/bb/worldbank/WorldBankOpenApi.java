package br.com.bb.worldbank;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        tags={@Tag(name="WorldBankAPI", description="Descrição do WorldBank API")},
        info = @Info(
                title = "WorldBank API",
                version = "1.0.0",
                contact = @Contact(
                        name = "Luiz Leão",
                        email = "luizleao@gmail.com",
                        url = "https://github.com/luizleao")),
        servers = {
                @Server(url = "http://localhost:8080")
        })
public class WorldBankOpenApi extends Application {

}
