
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Instanciando cliente
		Cliente raysse = new Cliente();
		raysse.setNome("RAYSSE");
		
		//Instanciando contas 
        Conta cc = new ContaCorrente(raysse);
        Conta poupanca = new ContaPoupanca(raysse);
        
        int operacao = 1;
        while (operacao != 0) {
        System.out.println();
		System.out.println("Qual opera��o deseja efetuar? \n1- Dep�sito \n2- Saque \n3- Transfer�ncia \n4- Extrato \n0- Sair");
		 operacao = sc.nextInt();
			switch (operacao) {
				case 1: {
				// Deposito
				System.out.println("Qual conta deseja efetuar o dep�sito? \n1- Conta Corrente \n2- Conta Poupan�a");
				Integer tipoConta = sc.nextInt();

				System.out.println("Qual o valor do dep�sito?");
				Double valor = sc.nextDouble();
				
				if (tipoConta == 1) {
					cc.depositar(valor);
				} else {
					poupanca.depositar(valor);
				}
				cc.imprimirExtrato();
				System.out.println();
				poupanca.imprimirExtrato();
				break;
			}
		}		
				switch (operacao) {
				case 2: {
				//Saque
					System.out.println("Qual conta deseja efetuar o saque? \n1- Conta Corrente \n2- Conta Poupan�a");
					Integer tipoConta = sc.nextInt();

					System.out.println("Qual o valor do saque?");
					Double valor = sc.nextDouble();

					if (tipoConta == 1) {
						cc.sacar(valor);
					} else {
						poupanca.sacar(valor);
					}
					cc.imprimirExtrato();
					System.out.println();
					poupanca.imprimirExtrato();
					break;
				}
     }
				switch (operacao) {
				case 3: {
				//Transfer�ncia
					System.out.println("Para qual conta deseja efetuar a transfer�ncia? \n1- Conta Corrente \n2- Conta Poupan�a");
					Integer tipoConta = sc.nextInt();

					System.out.println("Qual o valor da transfer�ncia?");
					Double valor = sc.nextDouble();

					if (tipoConta == 1) {
						poupanca.transferir(valor, cc);
					} else {
						cc.transferir(valor, poupanca);
					}
					cc.imprimirExtrato();
					System.out.println();
					poupanca.imprimirExtrato();
					break;
				}
     }
				switch (operacao) {
				case 4: {
				//Extrato
					cc.imprimirExtrato();
					System.out.println();
					poupanca.imprimirExtrato();
					break;	
				}
			}	
			
	       	
		}
	}
  
}


