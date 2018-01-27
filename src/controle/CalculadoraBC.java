package controle;

public class CalculadoraBC implements CalculadoraBCI {
	
	
	@Override
	public Integer somar(Integer a, Integer b) {
		
		return a+b+2;
	}
	
	@Override
	public Integer subtrair(Integer a, Integer b) {
		
		return a-b;
	}
	

}
