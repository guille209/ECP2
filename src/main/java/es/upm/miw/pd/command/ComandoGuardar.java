package es.upm.miw.pd.command;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoMemento implements Comando {

	public ComandoGuardar(Mementable<MementoCalculadora> calc,GestorMementos<MementoCalculadora>gm) {
		super(calc,gm);
	}

	public String name() {
		// TODO Auto-generated method stub
		return "Guardar";
	}

	public void execute() {
		// TODO Auto-generated method stub
		this.gm.addMemento(IO.in.readString("Nombre para el guardado"), getCalculadora().createMemento());
	}

}
