package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoDeshacer implements Comando {

	Calculadora calculadora;

	public ComandoDeshacer(Calculadora calculadora) {
		this.calculadora = calculadora;
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
		IO.out.print("Ultima operación desecha, valor actual:"+calculadora.deshacer());
	}

}
