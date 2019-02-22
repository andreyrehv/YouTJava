package ytJava;

public class Conta {
	String cliente;
	double saldo;
	
	
	void exibeSaldo () {
		System.out.println(cliente + " seu saldo é de " + saldo);
	}
	
	void saca(double valor) {
		 saldo -= valor;		
	}
	void deposito (double valor) {
		saldo += valor;
	}
	
	void transferencia(Conta destino, double valor) {
		this.saca(valor);
		destino.deposito(valor);
	}
}
