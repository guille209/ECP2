package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoSumar extends ComandoOperacion implements Comando {

	public ComandoSumar(Mementable<MementoCalculadora> calc) {
		super(calc);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Sumar";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		int valor = IO.in.readInt();
		calculadora.sumar(valor);
		IO.out.clear();
		IO.out.print(calculadora.getTotal());
	}

}
