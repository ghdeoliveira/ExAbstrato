package exabstrato;

public class ExAbstrato {

	public static void main(String[] args) {
		
		Retangulo ret = new Retangulo("retangulo", 23);
		
		Triangulo tri = new Triangulo("triangulo", 210);
		
		ret.calculaArea(2, 5);
		ret.mostraArea();
		
		tri.calculaArea(2, 6);
		tri.mostraArea();

	}

}
