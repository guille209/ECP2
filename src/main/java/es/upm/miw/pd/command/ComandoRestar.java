package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoRestar implements Comando{

	Calculadora calculadora;
	
	public ComandoRestar(Calculadora calculadora){
		this.calculadora = calculadora;
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
