package enums;

public enum Senioridade {
	ESTAGIO("est�gio"),
	TRAINEE("trainee"),
	JUNIOR("j�nior"),
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
