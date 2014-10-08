package es.upm.miw.pd.composite;

import java.util.ArrayList;

public class Multiplicar extends Operacion {

	public Multiplicar(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
	}

	@Override
	public int operar() {
		int resultado = 0;
		resultado = expresion1.operar()*expresion2.operar();
		return resultado;
	}

}
