package Modificador;

import java.util.Scanner;

public class ObjetoPessoaAutomovel {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        String cor, nome;
        int velocidade;

        System.out.println("Informe a cor do carro: ");
        cor = sc.next();

        System.out.println("Informe o nome do carro: ");
        nome = sc.next();

        System.out.println("Informe a velociade do carro: ");
        velocidade = sc.nextInt();

        pessoa.compracarro(cor, nome, velocidade);

        Automovel carro = pessoa.getAutomovel();

        System.out.println("\n O carro comprado foi: "+ carro.getNome()+ "\n Cor: " + carro.getCor()+ "\n Velocidade atingida: " + carro.getVelocidade());

        sc.close();

    }
}