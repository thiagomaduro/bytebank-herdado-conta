
public class TestesContas {

	public static void main(String[] args) {
		
	ContaCorrente cc = new ContaCorrente(111, 111);
	cc.deposita(100.0);
	
	ContaPoupanca cp = new ContaPoupanca(222, 222);
	cp.deposita(200.0);
	
	cc.transfere(10, cp);
	
	System.out.println("Conta corrente tem: " + cc.getSaldo());
	System.out.println("Conta poupanca tem: " + cp.getSaldo());
	
	
	}
}
