package es.upm.miw.pd.composite;

public class Numero extends Expresion{

	private int valor;
	
	public Numero(int valor){
		this.valor = valor;
	}
	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return valor;
		
	}

}
