package es.upm.miw.pd.command;

public interface Mementable<T> {

	T createMemento();

	void restoreMemento(T memento);

}
