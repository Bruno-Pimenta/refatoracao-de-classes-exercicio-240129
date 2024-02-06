package domain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import enums.Genero;
import enums.Senioridade;

public abstract class Colaborador implements IColaboradorClt, IColaboradorPj{
	private String nome;
	private double salarioBruto;
	private Senioridade senioridade;
	private Genero genero;
	private Contrato contrato;
	private Set<String> habilidadeTecnica = new HashSet<>();
	private boolean statusAtivo = true;
	
	public Colaborador(String nome, double salarioBruto, Senioridade senioridade, Genero genero,
			Contrato contrato, Set<String> habilidadeTecnica) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.senioridade = senioridade;
		this.genero = genero;
		this.contrato = contrato;
		this.habilidadeTecnica = habilidadeTecnica;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	private void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Senioridade getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(Senioridade senioridade) {
		this.senioridade = senioridade;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
	
	public Set<String> getHabilidadeTecnica() {
		return habilidadeTecnica;
	}

	public boolean isStatusAtivo() {
		return statusAtivo;
	}

	public void aumentarSalario(Scanner sc) {
		double percentual = 0;
		do {
			System.out.println("Determine o valor em percentual que o salário deve ser reajustado:");
			percentual = sc.nextDouble();
			if(percentual>0) {
				percentual = 1+percentual/100;
				setSalarioBruto(getSalarioBruto()*percentual);
			}
			else {
				System.out.println("Percentual de reajuaste deve ser maior que 0");
			}
		}
		while(percentual<=0);
	};

	public void demitir(Scanner sc) {
		boolean controle = true;
		while(controle) {
			System.out.println("Tem certeza que deseja desvincular " + this.nome + "?");
			String resposta = sc.next();
			Character respostaFormatada = resposta.toLowerCase().charAt(0);
			if(respostaFormatada.equals('s') && resposta.length()==1) {
				System.out.println(this.nome + " está demitido(a)");
				this.statusAtivo = false;
				this.salarioBruto = 0.0;
				controle = false;
			}
			else if(respostaFormatada.equals('n') && resposta.length()==1) {
				System.out.println(this.nome + " permanece vinculado!");
				controle = false;
			}
			else {
				System.out.println("Entrada inválida! Utilize 's' para confirmar e 'n' para cancelar");
			}
		}
	}
	
	public String exibirColaboradorClt() {
		ContratoClt contratoClt = (ContratoClt)this.contrato;
		String exibirColaborador = "Nome: " + this.nome;
		exibirColaborador += "\nSalário bruto: " + String.format("%.2f", this.salarioBruto);
		exibirColaborador += "\nCpf: "+contratoClt.getCpf();
		exibirColaborador += "\nSenioridade: " + senioridade.getMensagem();
		exibirColaborador += ", Gênero: " + genero.getMensagem();
		exibirColaborador += statusAtivo? contratoClt.beneficios():"";		
        exibirColaborador += statusAtivo? "\nStatus: ativo" : "\nStatus: demitido";
        exibirColaborador += "\nHabilidades técnicas:\n";
		Iterator<String> iterator = this.habilidadeTecnica.iterator();
        while (iterator.hasNext()) {
        	exibirColaborador += "- "+iterator.next()+"\n";
		}
        return exibirColaborador;
    }
	
	public void salarioLiquidoClt() {
		ContratoClt contratoClt = (ContratoClt)this.contrato;
		contratoClt.salarioLiquidoClt(this.salarioBruto);
	}
	
	public String beneficios() {
		ContratoClt contratoClt = (ContratoClt)this.contrato;
		return contratoClt.beneficios();
	}
	
	public void salarioEquivalentePj() {
		ContratoClt contratoClt = (ContratoClt)this.contrato;
		contratoClt.salarioEquivalentePj(this.salarioBruto);
	}
	
	public String exibirColaboradorPj() {
		ContratoPj contratoPj = (ContratoPj)this.contrato;
		String exibirColaborador = "Nome: " + this.nome;
		exibirColaborador += "\nSalário bruto: " + String.format("%.2f", this.salarioBruto);
		exibirColaborador += "\nCnpj: "+contratoPj.getCnpj();
		exibirColaborador += "\nSenioridade: " + senioridade.getMensagem();
		exibirColaborador += ", Gênero: " + genero.getMensagem();
		exibirColaborador += statusAtivo? "\nStatus: ativo" : "\nStatus: demitido";
		exibirColaborador += "\nHabilidades técnicas:\n";
		Iterator<String> iterator = this.habilidadeTecnica.iterator();
        while (iterator.hasNext()) {
        	exibirColaborador += "- "+iterator.next()+"\n";
		}
        return exibirColaborador;
	}
}
