public abstract class Usuário {

	private string matricula;

	private string nome;

	private string cpf;

	private string endereco;

	private string cidade;

	private string telefone;

	private string email;

	private string login;

	private string senha;

	private date ultimoLogin;

	private string status;

	private Loja loja;

	public boolean efetuarLogin() {
		return false;
	}

	public boolean efetuarLogout() {
		return false;
	}

	public void verificarComunicado() {

	}

	public boolean consultarMaterial() {
		return false;
	}

}
