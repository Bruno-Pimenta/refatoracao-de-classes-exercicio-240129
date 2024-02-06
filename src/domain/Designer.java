package domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import enums.Genero;
import enums.Senioridade;

public class Designer extends Colaborador{
	private Set<String> tecnologiasUx = new HashSet<>();

	private Designer(String nome, double salarioBruto, Senioridade senioridade, Genero genero, Contrato contrato,
			Set<String> habilidadeTecnica, Set<String> tecnologiasUx) {
		super(nome, salarioBruto, senioridade, genero, contrato, habilidadeTecnica);
		this.tecnologiasUx = tecnologiasUx;
	}

	public static Designer inicializarColaboradorClt(String nome, double salarioBruto, Senioridade senioridade, Genero genero, ContratoClt contratoClt, 
			Set<String> habilidadeTecnica, Set<String> tecnologiasUx) {
		return new Designer(nome, salarioBruto, senioridade, genero, contratoClt, habilidadeTecnica, tecnologiasUx); 
	}
	
	public static Designer inicializarColaboradorPj(String nome, double salarioBruto, Senioridade senioridade, Genero genero, ContratoPj contratoPj, 
			Set<String> habilidadeTecnica, Set<String> tecnologiasUx) {
		return new Designer(nome, salarioBruto, senioridade, genero, contratoPj, habilidadeTecnica, tecnologiasUx); 
	}

	public Set<String> getTecnologiasUx() {
		return tecnologiasUx;
	}

	public String exibirColaboradorClt() {
		String tecnologias = "Conhecimento em tecnologias de desenvolvimento UX/UI:\n";
		Iterator<String> iterator = this.tecnologiasUx.iterator();
        while (iterator.hasNext()) {
        	tecnologias += "- "+iterator.next()+"\n";
		}
		return super.exibirColaboradorClt()+tecnologias;
    }
	
	public String exibirColaboradorPj() {
		String tecnologias = "Conhecimento em tecnologias de desenvolvimento desenvolvimento UX/UI:\n";
		Iterator<String> iterator = this.tecnologiasUx.iterator();
        while (iterator.hasNext()) {
        	tecnologias += "- "+iterator.next()+"\n";
		}
		return super.exibirColaboradorPj()+tecnologias;
	}
}
