package enums;

public enum Senioridade {
	ESTAGIO("estágio"),
	TRAINEE("trainee"),
	JUNIOR("júnior"),
	PLENO("pleno"),
	SENIOR("senior"),
	MASTER("master");
	
	private String mensagem;

	private Senioridade(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}
