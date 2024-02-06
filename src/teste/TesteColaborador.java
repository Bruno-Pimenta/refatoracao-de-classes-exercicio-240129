package teste;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import domain.ContratoClt;
import domain.ContratoPj;
import domain.Designer;
import domain.DevBackEnd;
import domain.DevFrontEnd;
import domain.Gerente;
import domain.IColaboradorClt;
import domain.IColaboradorPj;
import enums.Genero;
import enums.Senioridade;

public class TesteColaborador {
	public static void criarObjetos() {
		Scanner sc = new Scanner(System.in);
		String nome = "Bruno";
		double salarioBruto = 10000;
		Senioridade senioridade = Senioridade.TRAINEE;
		Genero genero = Genero.HOMEM_CIS;
		ContratoClt contrato = new ContratoClt("12345");
		Set<String> habilidadeTecnicaBruno = new HashSet<>();
		habilidadeTecnicaBruno.add("Conhecimentos básicos em padrões de projeto");
		habilidadeTecnicaBruno.add("Conhecimentos básicos em modelagem de banco de dados");
		Set<String> tecnologiasDesenvolvimentoBackEnd = new HashSet<>();
		tecnologiasDesenvolvimentoBackEnd.add("Java");
		tecnologiasDesenvolvimentoBackEnd.add("PostgreSQL");
		tecnologiasDesenvolvimentoBackEnd.add("Javascript");
		tecnologiasDesenvolvimentoBackEnd.add("MySql");		
		IColaboradorClt colaborador1 = DevBackEnd.inicializarColaboradorClt(nome, salarioBruto, senioridade, genero, contrato, habilidadeTecnicaBruno, tecnologiasDesenvolvimentoBackEnd);
				
		System.out.println(colaborador1.exibirColaboradorClt());
		colaborador1.salarioLiquidoClt();
		colaborador1.salarioEquivalentePj();
		
		
		System.out.println("*********************************************************");
		nome = "Brenda";
		salarioBruto = 15000;
		senioridade = Senioridade.PLENO;
		genero = Genero.MULHER_CIS;
		ContratoPj contrato2 = new ContratoPj("98765");
		Set<String> habilidadeTecnicaBrenda = new HashSet<>();
		habilidadeTecnicaBrenda.add("Conhecimentos criação de interfaces web interativas e responsivas");
		habilidadeTecnicaBrenda.add("Conhecimento em técnicas de otimização de desempenho");
		Set<String> tecnologiasDesenvolvimentoFrontEnd = new HashSet<>();
		tecnologiasDesenvolvimentoFrontEnd.add("React");
		tecnologiasDesenvolvimentoFrontEnd.add("Angular");
		tecnologiasDesenvolvimentoFrontEnd.add("TypeScript");
		tecnologiasDesenvolvimentoFrontEnd.add("JavaScript");
		
		IColaboradorPj colaborador2 = DevFrontEnd.inicializarColaboradorPj(nome, salarioBruto, senioridade, genero, contrato2, habilidadeTecnicaBrenda, tecnologiasDesenvolvimentoFrontEnd);
		System.out.println(colaborador2.exibirColaboradorPj());
		
		System.out.println("*********************************************************");
		nome = "Lucas";
		salarioBruto = 12000;
		senioridade = Senioridade.PLENO;
		genero = Genero.HOMEM_TRANS;
		ContratoPj contrato3 = new ContratoPj("5678");
		Set<String> habilidadeTecnicaLucas = new HashSet<>();
		habilidadeTecnicaLucas.add("Experiência na realização de testes de usabilidade");
		habilidadeTecnicaLucas.add("Conhecimento em práticas e diretrizes de acessibilidade");
		habilidadeTecnicaLucas.add("Compreensão dos princípios de psicologia do usuário");
		Set<String> tecnologiasDesenvolvimentoUx = new HashSet<>();
		tecnologiasDesenvolvimentoUx.add("Figma");
		tecnologiasDesenvolvimentoUx.add("Sketch");
		tecnologiasDesenvolvimentoUx.add("Adobe XD");
		tecnologiasDesenvolvimentoUx.add("InVision");		
				
		IColaboradorPj colaborador3 = Designer.inicializarColaboradorPj(nome, salarioBruto, senioridade, genero, contrato3, habilidadeTecnicaLucas, tecnologiasDesenvolvimentoUx);
		
		System.out.println(colaborador3.exibirColaboradorPj());
		System.out.println("*********************************************************");
		
		nome = "Sandra";
		salarioBruto = 20000;
		senioridade = Senioridade.MASTER;
		genero = Genero.MULHER_TRANS;
		ContratoClt contrato4 = new ContratoClt("5678");
		Set<String> habilidadeTecnicaSandra = new HashSet<>();
		habilidadeTecnicaSandra.add("Experiência com Metodologias Ágeis");
		habilidadeTecnicaSandra.add("Conhecimento em arquitetura de sistemas");
		habilidadeTecnicaSandra.add("Análise de Requisitos Técnicos");
						
		IColaboradorClt colaborador4 = Gerente.inicializarColaboradorClt(nome, salarioBruto, senioridade, genero, contrato4, habilidadeTecnicaSandra);
		
		System.out.println(colaborador4.exibirColaboradorClt());
		colaborador4.salarioLiquidoClt();
		colaborador4.salarioEquivalentePj();
		
		System.out.println("*********************************************************");
		colaborador1.demitir(sc);
		System.out.println(colaborador1.exibirColaboradorClt());
		sc.close();
	}
}
