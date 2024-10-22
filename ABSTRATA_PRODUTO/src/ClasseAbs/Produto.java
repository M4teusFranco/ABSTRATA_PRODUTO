package ClasseAbs;// Utilização do Pacote Classe Abstrata
	
//Criação da Classe Abstrata Produto
public abstract class Produto {
	 private String nome; // Atributos da Classe Produto
	 private double precoCusto;
	 private double precoVenda;
	 	
	 	// Construtor da Classe Produto
	    public Produto(String nome, double precoCusto, double precoVenda) {
	        this.nome = nome; // Inicializa o Nome do Produto
	        this.precoCusto = precoCusto; // Inicializa o Preço de Custo do Produto
	        this.precoVenda = precoVenda; // Inicializa o Preço de Venda do Produto
	    }

	    // Método para calcular o Lucro do Produto
	    public double calcularLucro() {
	        return precoVenda - precoCusto; // Retorna a diferença entre Preço de Venda e Preço de Custo
	    }

	    // Método Get do Nome do produto
	    public String getNome() {
	        return nome;
	    }

	    // Método para Salvar o produto
	    public void salvar() {
	        System.out.println("Produto '" + nome + "' está sendo Salvo.");
	    }

	    // Método para Deletar o produto	    
	    public void deletar() {
	        System.out.println("Produto '" + nome + "' está sendo Deletado.");
	    }

	    // Método para Atualizar o produto	    	    
	    public void atualizar() {
	        System.out.println("Produto '" + nome + "' está sendo Atualizado.");
	    }
	}

