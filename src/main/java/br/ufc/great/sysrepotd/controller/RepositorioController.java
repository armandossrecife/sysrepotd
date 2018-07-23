package br.ufc.great.sysrepotd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Faz o controle do domínio de repositório
 * A classe ficou em português por ter dado conflito com uma classe em inglês do spring
 * @author armandosoaressousa
 *
 */
@Controller
public class RepositorioController {
	
	@RequestMapping(value="/repositories")
	public String index(){
		return "repositories/list";
	}


}
