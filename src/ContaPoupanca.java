
public class ContaPoupanca extends Conta {
	//Construtor em cima do Construtor da super classe
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	
}
