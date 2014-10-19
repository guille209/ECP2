package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoSumar extends ComandoOperacion implements Comando {

	public ComandoSumar(Mementable<MementoCalculadora> calc) {
		super(calc);
	}

	public String name() {
		// TODO Auto-generated method stub
		return "Sumar";
	}

	public void execute() {
		// TODO Auto-generated method stub
		int valor = IO.in.readInt();
		getCalculadora().sumar(valor);
		IO.out.clear();
		IO.out.print(getCalculadora().getTotal());
	}

}
