
public class TesteTributavel {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroVida sv = new SeguroVida();

		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);
		System.out.println(ci.getTotalImposto());
		
		
		
	} 
	
	
}
