import java.util.Collection;

public abstract class Produto {

	private string nome;

	private int seriaNumber;

	private string codProduto;

	private string status;

	private int quantidade;

	private float tamanho;

	private string tipo;

	private double local;

	private float precoProduto;

	private string material;

	private double peso;

	private double dimensoes;

	private string cor;

	private string marca;

	private int garantia;

	private Collection<Cliente> venda;

	private Estoque estoque;

	/**
	 *  
	 */
	public void atualizarProduto() {

	}

	/**
	 *  
	 */
	public void cadastrarProduto() {

	}

	/**
	 *  
	 */
	public void pesquisarProduto() {

	}

	/**
	 *  
	 */
	public void deletarProduto() {

	}

	public boolean verificarGarantia() {
		return false;
	}

	public boolean realizarEntrega() {
		return false;
	}

	/**
	 *  
	 */
	public void statusProduto() {

	}

}
