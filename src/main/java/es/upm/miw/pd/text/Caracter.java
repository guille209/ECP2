package es.upm.miw.pd.text;

public class Caracter extends Componente{
	
	char representacion;

	public Caracter(char representacion){
		this.representacion = representacion;
	}
	
	@Override
	public String dibujar(boolean mayusculas) {
		// TODO Auto-generated method stub
		if(mayusculas){
			return (representacion+"").toUpperCase();
		}else{
			return representacion+"";
		}
		
	}

	@Override
	public boolean esCompuesto() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(Componente componente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supr(Componente componente) {
		// TODO Auto-generated method stub
		
	}
	
	


}
