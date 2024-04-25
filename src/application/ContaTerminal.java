package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta:");
		Integer numeroDaConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o numero da agencia");
		String agencia = (String) sc.nextLine();
		System.out.println("Digite seu nome: ");
		String nomeDoCliente = sc.nextLine();
		System.out.println("Digite o saldo inicial");
		Double saldoInicial = sc.nextDouble();
		
		System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta no nosso banco, sua agencia é " + agencia + ", conta " + numeroDaConta + ", e seu saldo de " + saldoInicial + " já esta disponivel para saque.");
		
		sc.close();
	}

}
