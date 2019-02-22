package ytJava;

public class ContaTeste {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.cliente = "Andrey";
		conta.saldo = 10_000.0;
		conta.exibeSaldo();
	
		
		
		Conta destino = new Conta();
		destino.cliente  = "Lidia";
		destino.saldo = 8_000.00;
		destino.exibeSaldo();
		
		
		conta.transferencia(destino, 1550.00);
		conta.exibeSaldo();
		destino.exibeSaldo();
	}

}
