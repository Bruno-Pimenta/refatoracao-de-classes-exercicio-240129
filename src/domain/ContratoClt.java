package domain;

public class ContratoClt extends Contrato{
	private String cpf;
	private double valeAlimentacao = 400.00;
	private double valeTransporte = 200.00;
	
	public ContratoClt(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	/*public void setCpf(String cpf) {
		this.cpf = cpf;
	}*/

	public void salarioLiquidoClt(double salarioBruto) {
		double inss=0;
		double impostoRenda = 0;
		
		if(salarioBruto<=1.412) {
			inss=salarioBruto*0.075;
		}
		else if(salarioBruto>=1412.01 && salarioBruto<= 2666.68) {
			inss=salarioBruto*0.09;
		}
		else if(salarioBruto>=2666.69 && salarioBruto<= 4000.03) {
			inss=salarioBruto*0.12;
		}
		else{
			inss=salarioBruto*0.14;
		}
		
		double baseDeCalculo=salarioBruto-inss;
		
		if(baseDeCalculo<=2112.00) {
			impostoRenda = 0;
		}
		else if(baseDeCalculo>=2112.01 && baseDeCalculo<=2826.65) {
			impostoRenda = baseDeCalculo*0.075;
		}
		else if(baseDeCalculo>=2826.66 && baseDeCalculo<=3751.05) {
			impostoRenda = baseDeCalculo*0.15;
		}
		else if(baseDeCalculo>=3751.06 && baseDeCalculo<=4664.68) {
			impostoRenda = baseDeCalculo*0.225;
		}
		else{
			impostoRenda = baseDeCalculo*0.275;
		}
		
		double salarioLiquido = baseDeCalculo-impostoRenda;
		
		System.out.printf("Sal�rio L�quido: R$ %.2f\n", salarioLiquido);
	};
	
	public String beneficios() {
		return "\nValor do vale alimenta��o (mensal): R$ " + String.format("%.2f", this.valeAlimentacao)
		+ "\nValor do vale transporte (mensal): R$ " + String.format("%.2f", this.valeTransporte);
	}
	
	public void salarioEquivalentePj(double salarioBruto) {
		double salarioEquivalentePj = 1.08*salarioBruto; //adicional equivalente ao benef�cio do FGTS sobre o sal�rio bruto
		salarioEquivalentePj += 2*1.08*salarioBruto/12;//adicional equivalente ao benef�cio do FGTS sobre "f�rias" e 13�
		salarioEquivalentePj += 1.08*(salarioBruto*0.3)/12;//adicional equivalente ao benef�cio do FGTS sobre abono de "f�rias" 
		salarioEquivalentePj += this.valeAlimentacao+this.valeTransporte;//adicional equivalente aos benef�cios de vale transporte e vale alimenta��o
		System.out.printf("O sal�rio como PJ equivalente �: R$ %.2f%n", salarioEquivalentePj);
	}
}
