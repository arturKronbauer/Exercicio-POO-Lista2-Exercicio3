package aplicacao;

import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		double salarioBruto, imposto, percentual;
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		imposto = sc.nextDouble();
		Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);
		System.out.println();
		System.out.println("Empregado: "+ funcionario);
		System.out.println();
		System.out.print("Qual o percentual de aumento do salário? ");
		percentual = sc.nextDouble();
		funcionario.reajusteSalario(percentual);
		System.out.println();
		System.out.println("Dados Atualizados:"+funcionario);
	}

}
