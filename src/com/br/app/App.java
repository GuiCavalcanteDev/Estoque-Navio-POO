package com.br.app;

import java.util.Scanner;

import estoque.Estoque;
import estoque.Peca;
import usuarios.Usuario;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        Peca peca = new Peca();
        Usuario usuario = new Usuario();

        System.out.println("Digite o seu usuário: ");
        usuario.setUsuario(scanner.nextLine());
        System.out.println("Digite sua senha: ");
        usuario.setSenha(scanner.nextLine());

		System.out.println("Digite o nome da peça que você deseja: ");
		String nomePeca = scanner.nextLine();
		System.out.println("Digite a quantidade: ");
		int quantidade = scanner.nextInt();
		peca.setNome(nomePeca);
		peca.setQuantidade(quantidade);

		scanner.nextLine();

		System.out.println("Deseja adicionar ou remover a peça (adicionar/remover): ");
		String opcao = scanner.nextLine();

		if (opcao.equals("adicionar")) {
			estoque.adicionarPeca(peca);
		} else if (opcao.equals("remover")) {

			estoque.removerPeca(peca.getNome(), peca.getQuantidade());
		}
		

		System.out.println("Login do Usuário: " + usuario.getUsuario());
		System.out.println("Peça selecionada: " + peca.getNome());
		System.out.println("Quantidade selecionada: " + peca.getQuantidade());
		System.out.println("Operação realizada: " + opcao);
		System.out.println("\n******************************************************\n");
		System.out.println("Usuario: " + usuario.getUsuario() + "\nFez a seguinte alteração: " + opcao + " " + peca.getNome()+ " " + peca.getQuantidade());
		
		
		scanner.close();
	}
}
