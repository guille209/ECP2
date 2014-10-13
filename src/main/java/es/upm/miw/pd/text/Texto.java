package es.upm.miw.pd.text;

public class Texto extends Compuesto{


	@Override
	public String dibujar(boolean mayusculas) {
		// TODO Auto-generated method stub
		String resultado = "";
		for(Componente componente:componentes){
			resultado += componente.dibujar(mayusculas);
		}
		return resultado+"---o---\n";
	}

	@Override
	public void add(Componente componente) {
		// TODO Auto-generated method stub
		if(componente.esCompuesto()){
			componentes.add(componente);
		}else{
			throw new UnsupportedOperationException("Accion no permitida... ");
		}
		
	}

	@Override
	public void supr(Componente componente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean esCompuesto() {
		// TODO Auto-generated method stub
		return true;
	}


}
