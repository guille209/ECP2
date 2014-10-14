package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoRestaurar extends ComandoOperacion implements Comando {
	
	GestorMementos<MementoCalculadora> gm;

	public ComandoRestaurar(Mementable<MementoCalculadora> calc,GestorMementos<MementoCalculadora> gm) {
		super(calc);
		this.gm = gm;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Deshacer";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		 this.getCalculadora().restoreMemento(this.gm.getMemento((String) IO.in.select(gm.keys(), "Restaurar a version")));
	}

}
