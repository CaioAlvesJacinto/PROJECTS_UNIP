package models;

public class Administrador extends Empregado {
	
	private double ajudaDeCusto;
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	@Override
	public double calcularSalario () {
		double salario = ajudaDeCusto + (super.calcularSalario());
		return salario;
	}
}
