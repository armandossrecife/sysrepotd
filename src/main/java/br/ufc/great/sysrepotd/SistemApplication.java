package br.ufc.great.sysrepotd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**Classe principal do sistema que carrega os padrões e convenções do spring boot
 * @author armandosoaressousa
 *
 */
@SpringBootApplication
public class SistemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemApplication.class, args);
	}
}
