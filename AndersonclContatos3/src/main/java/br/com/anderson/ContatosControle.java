package br.com.anderson;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ContatosControle {
		
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
			
		LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 71 98565 6755"));
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
	public ModelAndView novo() {
		ModelAndView modelAndView = new ModelAndView("formulario");
		modelAndView.addObject("contato", new Contato());
		
		return modelAndView;
	}
	
	
	@PostMapping ("/contatos")
	public String cadastrar(Contato contato) {
		String id = UUID.randomUUID().toString();
		contato.setId(id);
		LISTA_CONTATOS.add(contato);
		return "redirect:/contatos";
	}
	
	
	@GetMapping("/contatos/{id}/editar")
	public ModelAndView editar(@PathVariable String id ) {
		ModelAndView modelAndView = new ModelAndView("formulario");
		modelAndView.addObject("contato", new Contato());
		
		Contato contato = prcurarContato(id);
		return modelAndView;
	}
	public Contato prcurarContato(String id) {
		for (int i = 0; i < LISTA_CONTATOS.size(); i++) {
			Contato contato = LISTA_CONTATOS.get(i);
			
			if(contato.getId().equals(id)) {
				return contato;
			}
		}
		return null;
	}
}

