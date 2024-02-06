package domain;

public class ContratoPj extends Contrato{
	private String cnpj;

	public ContratoPj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	/*public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}*/
}
