package es.upm.miw.pd.text;

public class Caracter extends Componente{
	
	char representacion;

	public Caracter(char representacion){
		this.representacion = representacion;
	}
	
	@Override
	public void dibujar(boolean mayusculas) {
		// TODO Auto-generated method stub
		if(mayusculas){
			System.out.println(representacion+"".toUpperCase());
		}else{
			System.out.println(representacion);
		}
		
	}


}
