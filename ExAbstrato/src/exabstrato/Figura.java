package exabstrato;

public class Figura {
	
	private String nome;
	protected double area;
	
	public Figura (String nome, double area) {
		this.nome = nome;
		this.area = area;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void calculaArea () {
		
	}
	
	public void mostraArea () {
		System.out.println("Área = " + this.area + " cm");
	}
	
	/* 
	Outra maneira de fazer o método mostraArea
	
	public double mostraArea () {
		return  this.area;
	} 
	*/

}
