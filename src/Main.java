
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
		System.out.println("Qual operação deseja efetuar? \n1- Depósito \n2- Saque \n3- Transferência \n4- Extrato \n0- Sair");
		 operacao = sc.nextInt();
			switch (operacao) {
				case 1: {
				// Deposito
				System.out.println("Qual conta deseja efetuar o depósito? \n1- Conta Corrente \n2- Conta Poupança");
				Integer tipoConta = sc.nextInt();

				System.out.println("Qual o valor do depósito?");
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
					System.out.println("Qual conta deseja efetuar o saque? \n1- Conta Corrente \n2- Conta Poupança");
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
				//Transferência
					System.out.println("Para qual conta deseja efetuar a transferência? \n1- Conta Corrente \n2- Conta Poupança");
					Integer tipoConta = sc.nextInt();

					System.out.println("Qual o valor da transferência?");
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


