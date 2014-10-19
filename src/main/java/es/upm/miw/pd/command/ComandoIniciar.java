package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoIniciar extends ComandoOperacion  implements Comando {
	
	public ComandoIniciar(Mementable<MementoCalculadora> calc){
		super(calc);
	}

	public String name() {
		// TODO Auto-generated method stub
		return "Iniciar";
	}

	public void execute() {
		// TODO Auto-generated method stub
		getCalculadora().iniciar();
		IO.out.clear();
		IO.out.print(getCalculadora().getTotal());
		
	}

}
