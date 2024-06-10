package cat.itacademy.barcelonactiva.SanchezMesa.JuanManuel.s05.t01.n02.S05T01N02.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ApiConfig {
    @Value("${JuanManuel_Sanchez.openapi.dev-url}")
    private String devUrl;

    @Value("${JuanManuel_Sanchez.openapi.prod-url}")
    private String prodUrl;

    @Bean
    public OpenAPI myOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl(devUrl);
        devServer.setDescription("Server URL in Development environment");

        Server prodServer = new Server();
        prodServer.setUrl(prodUrl);
        prodServer.setDescription("Server URL in Production environment");

        Contact contact = new Contact();
        contact.setEmail("juanma.sme@gmail.com");
        contact.setName("JuanManuel_Sanchez");
        contact.setUrl("https://github.com/juanmaMesa");

        License mitLicense = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info = new Info()
                .title("Bloom Care and Tracking Suite API Documentation")
                .version("1.0")
                .contact(contact)
                .description("This API provides comprehensive endpoints for the detailed management, care, and tracking of various flower species.")
                .license(mitLicense);

        return new OpenAPI().info(info).servers(List.of(devServer, prodServer));
    }

}

