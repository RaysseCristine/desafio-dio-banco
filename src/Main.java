
public class Main {

	public static void main(String[] args) {
		Cliente raysse = new Cliente();
		raysse.setNome("RAYSSE");
		
		Conta cc = new ContaCorrente(raysse);
		Conta poupanca = new ContaPoupanca(raysse);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		System.out.println();
		poupanca.imprimirExtrato();

	}

}
