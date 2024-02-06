package enums;

public enum Genero {
	HOMEM_CIS("homem cis"),
	HOMEM_TRANS("homem trans"),
	MULHER_CIS("mulher cis"),
	MULHER_TRANS("mulher trans"),
	NAO_BINARIO("não binário"),
	NAO_DECLARADO("não declarado");
	
	private String mensagem;

	private Genero(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}
