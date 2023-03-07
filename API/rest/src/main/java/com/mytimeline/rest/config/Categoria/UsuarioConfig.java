package com.mytimeline.rest.config.Categoria;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

public class UsuarioConfig {
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("User")
                        .description("Usuarios")
                        .contact(new Contact()
                                .name("Grupete")
                                .email("a@a.a")
                                .url("uia"))
                        .version("1.0"));

    }
}
