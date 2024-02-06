/**
 * Este programa em Java representa um sistema simples de controle de estoque para uma loja.
 * Ele cria um objeto Produto, onde o usuário pode fornecer o nome e a quantidade do produto.
 * O programa verifica se há necessidade de reposição de estoque com base em uma quantidade mínima predefinida.
 *
 * @author [Seu Nome]
 * @version 1.0
 * @since [Data de Criação]
 */

package Produto_Loja;

import java.util.Scanner;

public class Cap09_Exercicio03 {

    public static void main(String[] args) {
        // Criação do Scanner para entrada de dados
        Scanner ler = new Scanner(System.in);

        // Criação do objeto Produto
        Produto produto = new Produto();
        produto.nome = "";
        produto.Quantidade = null;

        // Definição do nível mínimo de estoque
        int minimoEstoque = 10;

        // Chamada do método para obter informações do produto
        qualProduto(produto, ler);
        linhas(); // Exibe uma linha de separação

        // Verifica se é necessário repor o estoque
        necessitaRepor(produto, minimoEstoque);
    }

    /**
     * Método para obter informações do produto a partir do usuário.
     *
     * @param produto Objeto Produto a ser preenchido
     * @param ler     Scanner para entrada de dados
     */
    public static void qualProduto(Produto produto, Scanner ler) {
        System.out.print("Digite o nome do produto: ");
        produto.nome = ler.nextLine();
        System.out.print("Escreva a quantidade disponível: ");
        produto.Quantidade = ler.nextInt();
    }

    /**
     * Método para exibir uma linha de separação no console.
     */
    static void linhas() {
        System.out.println("___________________________________");
    }

    /**
     * Método para verificar se há necessidade de repor o estoque com base na quantidade mínima.
     *
     * @param produto      Objeto Produto contendo as informações do produto
     * @param minimoEstoque Quantidade mínima desejada em estoque
     */
    static void necessitaRepor(Produto produto, int minimoEstoque) {
        if (minimoEstoque >= produto.Quantidade) {
            // Exibe uma mensagem de alerta se a quantidade for inferior ao mínimo
            System.err.println("Quantidade do produto é inferior a 10 unidades, por favor, solicite aumento de quantidade de produtos em estoque.");
            System.err.println("Abra o chamado e reinicie o sistema!");
        } else if (minimoEstoque < produto.Quantidade) {
            // Informa que a quantidade em estoque é suficiente
            System.out.println("Quantidade em estoque suficiente.");
        } else {
            // Exibe uma mensagem de erro se a quantidade for inválida
            System.err.println("Quantidade inválida, reinicie o código.");
        }
    }
}
