
public class ContaCorrente extends Conta implements Tributavel{

	/*
	 * Quando herdo uma classe m�e, eu n�o herdo seu construtor! E como a classe
	 * Conta n�o possui o construtor padr�o, ou seja, eu criei um construtor com
	 * regras, eu preciso declarar o mesmo metodo de entrada do seu construtor,
	 * dentro do MEU ContaCorrente() e depois coloco dentro do meu construtor o
	 * super(dentro exemplifico os atributos que coloquei dentro de MEU
	 * ContaCorrente que � do Construtor da classe m�e).
	 */
	

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override //para sobreescrever um m�todo
	public boolean saca(double valor) {
		double valorASacar = valor + 0.20;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return 10;
		
	}
	
	
	
}