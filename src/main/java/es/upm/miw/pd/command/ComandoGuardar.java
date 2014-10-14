package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoOperacion implements Comando {
	GestorMementos<MementoCalculadora> gm;

	public ComandoGuardar(Mementable<MementoCalculadora> calc,GestorMementos<MementoCalculadora>gm) {
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
		this.gm.addMemento(IO.in.readString("Nombre para el guardado"), getCalculadora().createMemento());
	}

}
