package es.upm.miw.pd.command;

public abstract class ComandoOperacion {
	protected Calculadora2 calculadora;
	
	public ComandoOperacion(Mementable<MementoCalculadora> calc){
		this.calculadora = (Calculadora2) calc;
	}
}
