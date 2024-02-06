package domain;

import java.util.Set;
import enums.Genero;
import enums.Senioridade;

public class Gerente extends Colaborador{
	
	private Gerente(String nome, double salarioBruto, Senioridade senioridade, Genero genero, Contrato contrato,
			Set<String> habilidadeTecnica) {
		super(nome, salarioBruto, senioridade, genero, contrato, habilidadeTecnica);
	}
	
	public static Gerente inicializarColaboradorClt(String nome, double salarioBruto, Senioridade senioridade, Genero genero, ContratoClt contratoClt, 
			Set<String> habilidadeTecnica) {
		return new Gerente(nome, salarioBruto, senioridade, genero, contratoClt, habilidadeTecnica); 
	}
	
	public static Gerente inicializarColaboradorPj(String nome, double salarioBruto, Senioridade senioridade, Genero genero, ContratoPj contratoPj, 
			Set<String> habilidadeTecnica) {
		return new Gerente(nome, salarioBruto, senioridade, genero, contratoPj, habilidadeTecnica); 
	}
}
