package es.upm.miw.pd.command;

public abstract class ComandoOperacion {
	protected Calculadora calculadora;
	
	public ComandoOperacion(Calculadora calculadora){
		this.calculadora = calculadora;
	}
}
