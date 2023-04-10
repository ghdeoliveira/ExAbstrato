package exabstrato;

public class Retangulo extends Figura {
	
	public Retangulo (String nome, double area) {
		super(nome, area);
	}
	
	public void calculaArea (double h, double b) {
		super.area = h * b;
	}
	
	public void mostraArea () {
		System.out.print("\nRetângulo - ");
		super.mostraArea();
	}
}
