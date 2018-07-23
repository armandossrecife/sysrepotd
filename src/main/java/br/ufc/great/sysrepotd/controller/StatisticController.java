package br.ufc.great.sysrepotd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**Faz o controle do domínio de estatísticas
 * @author armandosoaressousa
 *
 */
@Controller
public class StatisticController {

	@RequestMapping(value="/statistics")
	public String index(){
		return "/statistics/list";
	}
	
}
