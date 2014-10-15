package es.upm.miw.pd.command;

public abstract class ComandoMemento extends ComandoOperacion {
	GestorMementos<MementoCalculadora> gm;

	public ComandoMemento(Mementable<MementoCalculadora> calc,GestorMementos<MementoCalculadora> gm) {
		super(calc);
		this.gm = gm;
	}
}
