package es.upm.miw.pd.composite;

import java.util.ArrayList;

public class Restar extends Expresion {

	ArrayList<Expresion> expresiones;
	
	public Restar(Expresion expresion,Numero numero){
		
	}

	@Override
	public double operar() {
		double resultado = 0;
		for (Expresion expresion : expresiones) {
			resultado -= expresion.operar();
		}
		return resultado;
	}

}
