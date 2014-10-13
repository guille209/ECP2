package es.upm.miw.pd.text;

public class Parrafo extends Compuesto{


	@Override
	public String dibujar(boolean mayusculas) {
		// TODO Auto-generated method stub
		String resultado = "";
		for(Componente componente:componentes){
			
			resultado += componente.dibujar(mayusculas);
		}
		return resultado+"\n";
	}

	@Override
	public void add(Componente componente) {
		if(componente.esCompuesto()){
			throw new UnsupportedOperationException("Accion no permitida... ");
		}else{
			componentes.add(componente);
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
