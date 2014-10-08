package es.upm.miw.pd.composite;

import java.util.ArrayList;

public class Dividir extends Operacion {

	public Dividir(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
	}

	@Override
	public int operar() {
		int resultado = 0;
		resultado = expresion1.operar()/expresion2.operar();
		return resultado;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+expresion1.toString()+"/"+expresion2.toString()+")";
	}

}
