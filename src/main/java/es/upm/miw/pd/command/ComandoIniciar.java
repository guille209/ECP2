package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoIniciar implements Comando {

	Calculadora calculadora;
	
	public ComandoIniciar(Calculadora calculadora){
		this.calculadora = calculadora;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Iniciar";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		calculadora.iniciar();
		IO.out.clear();
		IO.out.print(calculadora.getTotal());
		
	}

}
