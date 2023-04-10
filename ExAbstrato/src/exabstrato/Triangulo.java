package exabstrato;

public class Triangulo extends Figura {
	
	public Triangulo (String nome, double area) {
		super(nome, area);
	}
	
	public void calculaArea (double h, double b) {
		super.area = (h * b)/2;
	}
	
	public void mostraArea () {
		System.out.print("\nTriângulo - ");
		super.mostraArea();
	}
}
