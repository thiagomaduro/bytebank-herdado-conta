
public class ContaCorrente extends Conta {

	/*
	 * Quando herdo uma classe mãe, eu não herdo seu construtor! E como a classe
	 * Conta não possui o construtor padrão, ou seja, eu criei um construtor com
	 * regras, eu preciso declarar o mesmo metodo de entrada do seu construtor,
	 * dentro do MEU ContaCorrente() e depois coloco dentro do meu construtor o
	 * super(dentro exemplifico os atributos que coloquei dentro de MEU
	 * ContaCorrente que é do Construtor da classe mãe).
	 */

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override //para sobreescrever um método
	public boolean saca(double valor) {
		double valorASacar = valor + 0.20;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
	
	
}