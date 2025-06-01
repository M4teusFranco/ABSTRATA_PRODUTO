# Sistema de Produtos com Classes Abstratas em Java

### 📋 Descrição do Projeto

Este projeto implementa um sistema de gerenciamento de produtos utilizando classes abstratas em Java, demonstrando os conceitos de herança e polimorfismo.

O sistema consiste em:

Classe Abstrata Produto que define:

- Atributos básicos: nome, preço de custo e preço de venda
- Método concreto: calcularLucro()
- Métodos de operações CRUD: salvar(), atualizar(), deletar()

Classes Concretas que herdam de Produto:

- ProdutoAlimenticio: com atributos específicos como data de validade e informações nutricionais
- ProdutoVestuario: com atributos específicos como tamanho, cor e material
  
### 🔧 Pré-requisitos

- Java JDK 8 ou superior
- Eclipse IDE (ou outra IDE Java de sua preferência)

### 🚀 Instalação e Execução

1. Clone o repositório:

```
git clone https://github.com/seu-usuario/ABSTRATA_PRODUTO
```

2. Importe o projeto no Eclipse:
- File → Import → Existing Projects into Workspace
- Selecione a pasta do projeto clonado

3. Execute a classe Main localizada no pacote Main para ver a demonstração do sistema.


### 🛠️ Funcionalidades Implementadas

- Cálculo automático de lucro (diferença entre preço de venda e custo)
- Operações básicas de CRUD (Create, Read, Update, Delete)
- Especialização para diferentes tipos de produtos
- Exibição de informações específicas para cada tipo de produto

### 📝 Exemplo de Saída

Ao executar a classe Main, você verá:

```
- Lucro da Maçã: 0.5
- Lucro da Camisa: 15.0
---------------------------------------------
Produto 'Maçã' está sendo Salvo.
Produto 'Camisa' está sendo Salvo.
Produto 'Maçã' está sendo Atualizado.
Produto 'Camisa' está sendo Atualizado.
Produto 'Maçã' está sendo Deletado.
Produto 'Camisa' está sendo Deletado.
```

## ✒️ Autores

* **Mateus Franco Bezerra** - CLASSE ABSTRATA 2/2
