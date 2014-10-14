package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoOperacion implements Comando {

	public ComandoDeshacer(Mementable<MementoCalculadora> calc) {
		super(calc);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Deshacer";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		IO.out.clear();
		IO.out.print("Ultima operacion desecha, valor actual:"+calculadora.deshacer());
	}

}
