package one.digitalinnovation.gof;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * Modificado por augustopelzer:
 * - Adição de classe Veiculo
 * - Integração relacional com Cliente
 * - Configuração do H2
 * - Configuração do Swagger
 *
 * @author falvojr
 * @author augustopelzer
 */

@EnableFeignClients
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "ClienteVeiculoEndereco API", version = "1.0", description = "Sistema Simples REST Spring Boot com H2 e Swagger"))
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
