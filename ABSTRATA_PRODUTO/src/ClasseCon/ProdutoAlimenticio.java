package ClasseCon; // Utilização do Pacote Classe Concreta
import ClasseAbs.Produto; // Importação da Classe Produto do Pacote Classe Abstrata

// Criação da Classe Produto Alimentício, herdando a Classe Produto
public class ProdutoAlimenticio extends Produto {
    private String dataValidade; // Atributos da Classe Produto Alimentício
    private String informacoesNutricionais;
    
    // Construtor da Classe Produto Alimentício
    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
		// Chama o construtor da Classe Produto para inicializar os valores
    	super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade; // Inicializa a Data de Validade do Alimento
        this.informacoesNutricionais = informacoesNutricionais; // Inicializa as Informações Nutricionais do Alimento
    }
}
