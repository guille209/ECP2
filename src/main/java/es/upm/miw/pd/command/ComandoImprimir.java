package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoOperacion implements Comando {

	Calculadora calculadora;

	public ComandoImprimir(Mementable<MementoCalculadora> calc) {
		super(calc);
	}

	public String name() {
		// TODO Auto-generated method stub
		return "Imprimir";
	}

	public void execute() {
		// TODO Auto-generated method stub
		IO.out.clear();
		IO.out.print(calculadora.toString());
	}

}
