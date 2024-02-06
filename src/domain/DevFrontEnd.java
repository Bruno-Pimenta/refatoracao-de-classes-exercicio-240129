package domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import enums.Genero;
import enums.Senioridade;

public class DevFrontEnd extends Colaborador{
	private Set<String> tecnologiasDesenvolvimentoFrontEnd = new HashSet<>();

	private DevFrontEnd(String nome, double salarioBruto, Senioridade senioridade, Genero genero, Contrato contrato,
			Set<String> habilidadeTecnica, Set<String> tecnologiasDesenvolvimentoFrontEnd) {
		super(nome, salarioBruto, senioridade, genero, contrato, habilidadeTecnica);
		this.tecnologiasDesenvolvimentoFrontEnd = tecnologiasDesenvolvimentoFrontEnd;
	}

	public static DevFrontEnd inicializarColaboradorClt(String nome, double salarioBruto, Senioridade senioridade, Genero genero, ContratoClt contratoClt, 
			Set<String> habilidadeTecnica, Set<String> tecnologiasDesenvolvimentoFrontEnd) {
		return new DevFrontEnd(nome, salarioBruto, senioridade, genero, contratoClt, habilidadeTecnica, tecnologiasDesenvolvimentoFrontEnd); 
	}
	
	public static DevFrontEnd inicializarColaboradorPj(String nome, double salarioBruto, Senioridade senioridade, Genero genero, ContratoPj contratoPj, 
			Set<String> habilidadeTecnica, Set<String> tecnologiasDesenvolvimentoFrontEnd) {
		return new DevFrontEnd(nome, salarioBruto, senioridade, genero, contratoPj, habilidadeTecnica, tecnologiasDesenvolvimentoFrontEnd); 
	}

	public Set<String> getTecnologiasDesenvolvimentoFrontEnd() {
		return tecnologiasDesenvolvimentoFrontEnd;
	}

	public String exibirColaboradorClt() {
		String tecnologias = "Conhecimento em tecnologias de desenvolvimento FrontEnd:\n";
		Iterator<String> iterator = this.tecnologiasDesenvolvimentoFrontEnd.iterator();
        while (iterator.hasNext()) {
        	tecnologias += "- "+iterator.next()+"\n";
		}
		return super.exibirColaboradorClt()+tecnologias;
    }
	
	public String exibirColaboradorPj() {
		String tecnologias = "Conhecimento em tecnologias de desenvolvimento FrontEnd:\n";
		Iterator<String> iterator = this.tecnologiasDesenvolvimentoFrontEnd.iterator();
        while (iterator.hasNext()) {
        	tecnologias += "- "+iterator.next()+"\n";
		}
		return super.exibirColaboradorPj()+tecnologias;
	}
}
