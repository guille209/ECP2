package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoImprimir extends ComandoOperacion implements Comando {

	Calculadora calculadora;

	public ComandoImprimir(Calculadora calculadora) {
		super(calculadora);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Imprimir";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		IO.out.clear();
		IO.out.print(calculadora.toString());
	}

}
