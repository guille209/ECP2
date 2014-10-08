package es.upm.miw.pd.composite;

public class Numero extends Expresion{

	private double valor;
	
	public Numero(double valro){
		this.valor = valor;
	}
	@Override
	public double operar() {
		// TODO Auto-generated method stub
		return valor;
		
	}

}
