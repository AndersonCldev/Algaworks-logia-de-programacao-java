package br.com.anderson;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ContatosControle {
		
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
			
		LISTA_CONTATOS.add(new Contato("1", "MAria", "+55 71 98565 6755"));
		LISTA_CONTATOS.add(new Contato("2", "José", "+55 71 9789 6541"));
		LISTA_CONTATOS.add(new Contato("3", "Cleitom", "+55 71 99756 3942"));
		LISTA_CONTATOS.add(new Contato("4", "Terma", "+55 71 95555 5555"));
		
	}
	
	@GetMapping("/")
	public String index() {
			return "index" ;
		}
	
	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("listar");
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		return modelAndView;
	}
	
	@GetMapping("/contatos/novo")
	public String novo() {
		return "formulario";
	}
}

