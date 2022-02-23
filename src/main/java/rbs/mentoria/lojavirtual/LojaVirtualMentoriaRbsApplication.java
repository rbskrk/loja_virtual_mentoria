package rbs.mentoria.lojavirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "rbs.mentoria.lojavirtual.model")
@ComponentScan(basePackages = {"rbs.*"})
@EnableJpaRepositories(basePackages = {"rbs.mentoria.lojavirtual.repository"})
@EnableTransactionManagement
public class LojaVirtualMentoriaRbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaVirtualMentoriaRbsApplication.class, args);
	}

}
