package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoRestar extends ComandoOperacion implements Comando {

	public ComandoRestar(Mementable<MementoCalculadora> calc) {
		super(calc);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Restar";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		int valor = IO.in.readInt();
		calculadora.restar(valor);
		IO.out.clear();
		IO.out.print(calculadora.getTotal());

	}

}
