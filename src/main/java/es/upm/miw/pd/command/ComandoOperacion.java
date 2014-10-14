package es.upm.miw.pd.command;

public abstract class ComandoOperacion {
	private Calculadora2 calculadora;
	
	public ComandoOperacion(Mementable<MementoCalculadora> calc){
		this.setCalculadora((Calculadora2) calc);
	}

	public Calculadora2 getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(Calculadora2 calculadora) {
		this.calculadora = calculadora;
	}
}
