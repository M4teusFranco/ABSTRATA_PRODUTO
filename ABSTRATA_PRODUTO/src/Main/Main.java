package Main; // Utilização do Pacote Main
import ClasseAbs.Produto; // Importação da Classe Produto do Pacote Classe Abstrata
import ClasseCon.ProdutoAlimenticio; // Importação da Classe Produto Alimentício do Pacote Classe Concreta
import ClasseCon.ProdutoVestuario; // Importação da Classe Produto Vestuário do Pacote Classe Concreta

public class Main {

	public static void main(String[] args) {
		
		// Cria o Objeto do Alimento. Alimento: Maçã. Custo: 1.00. Venda: 1.50. Validade: 2024-12-31. Informação Nutricional: 52 kcal por 100g 
		ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio("Maçã", 1.00, 1.50, "2024-12-31", "52 kcal por 100g");
        
		// Cria o Objeto do Vestuário. Roupa: Camisa. Custo: 20.00. Venda: 35.00. Tamanho: M. Cor: Azul. Material: Algodão
		ProdutoVestuario produtoVestuario = new ProdutoVestuario("Camisa", 20.00, 35.00, "M", "Azul", "Algodão");
		
		// Puxa e Exibe o Lucro do Alimento
        System.out.println("- Lucro da Maçã: " + produtoAlimenticio.calcularLucro());
        
        // Puxa e Exibe o Lucro do Vestuário
        System.out.println("- Lucro da Camisa: " + produtoVestuario.calcularLucro());
        System.out.println("---------------------------------------------");

        produtoAlimenticio.salvar();   // Puxa o Método para Salvar o Alimento
        produtoVestuario.salvar();     // Puxa o Método para Salvar o Vestuário

        produtoAlimenticio.atualizar();  // Puxa o Método para Atualizar o Alimento
        produtoVestuario.atualizar();  	// Puxa o Método para Atualizar o Vestuário
        
        produtoAlimenticio.deletar();      // Puxa o Método para Deletar o Alimento
        produtoVestuario.deletar();      // Puxa o Método para Deletar o Vestuário
	}

}
