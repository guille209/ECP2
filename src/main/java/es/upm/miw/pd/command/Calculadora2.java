package es.upm.miw.pd.command;

import upm.jbb.IO;

public class Calculadora2 extends Calculadora implements
		Mementable<MementoCalculadora> {

	public Calculadora2() {
		this.iniciar();
	}

	@Override
	public MementoCalculadora createMemento() {
		// TODO Auto-generated method stub
		System.out.println("guardo el total que es "+total);
		return new MementoCalculadora(total);
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
		// TODO Auto-generated method stub
		this.setTotal(memento.getTotal());
		IO.out.clear();
		IO.out.print(total);

	}

}