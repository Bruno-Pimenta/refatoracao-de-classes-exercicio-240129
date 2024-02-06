package domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import enums.Genero;
import enums.Senioridade;

public class DevBackEnd extends Colaborador{
	private Set<String> tecnologiasDesenvolvimentoBackEnd = new HashSet<>();

	private DevBackEnd(String nome, double salarioBruto, Senioridade senioridade, Genero genero, Contrato contrato,
			Set<String> habilidadeTecnica, Set<String> tecnologiasDesenvolvimentoBackEnd) {
		super(nome, salarioBruto, senioridade, genero, contrato, habilidadeTecnica);
		this.tecnologiasDesenvolvimentoBackEnd = tecnologiasDesenvolvimentoBackEnd;
	}

	public static DevBackEnd inicializarColaboradorClt(String nome, double salarioBruto, Senioridade senioridade, Genero genero, ContratoClt contratoClt, 
			Set<String> habilidadeTecnica, Set<String> tecnologiasDesenvolvimentoBackEnd) {
		return new DevBackEnd(nome, salarioBruto, senioridade, genero, contratoClt, habilidadeTecnica, tecnologiasDesenvolvimentoBackEnd); 
	}
	
	public static DevBackEnd inicializarColaboradorPj(String nome, double salarioBruto, Senioridade senioridade, Genero genero, ContratoPj contratoPj, 
			Set<String> habilidadeTecnica, Set<String> tecnologiasDesenvolvimentoBackEnd) {
		return new DevBackEnd(nome, salarioBruto, senioridade, genero, contratoPj, habilidadeTecnica, tecnologiasDesenvolvimentoBackEnd); 
	}

	public Set<String> getTecnologiasDesenvolvimentoBackEnd() {
		return tecnologiasDesenvolvimentoBackEnd;
	}

	public String exibirColaboradorClt() {
		String tecnologias = "Conhecimento em tecnologias de desenvolvimento BackEnd:\n";
		Iterator<String> iterator = this.tecnologiasDesenvolvimentoBackEnd.iterator();
        while (iterator.hasNext()) {
        	tecnologias += "- "+iterator.next()+"\n";
		}
		return super.exibirColaboradorClt()+tecnologias;
    }
	
	public String exibirColaboradorPj() {
		String tecnologias = "Conhecimento em tecnologias de desenvolvimento BackEnd:\n";
		Iterator<String> iterator = this.tecnologiasDesenvolvimentoBackEnd.iterator();
        while (iterator.hasNext()) {
        	tecnologias += "- "+iterator.next()+"\n";
		}
		return super.exibirColaboradorPj()+tecnologias;
	}
}
