package es.upm.miw.pd.state.connection;

public class Parado extends EstadoObjeto {

	@Override
	public void parar(Conexion conexion) {

	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(new Preparado());

	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Accion no permitida... ");

	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Accion no permitida... ");

	}

	@Override
	public void enviar(Conexion conexion, String msg, Link link) {
		throw new UnsupportedOperationException("Accion no permitida... ");

	}

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Accion no permitida... ");

	}

	@Override
	public Estado getEstado() {
		// TODO Auto-generated method stub
		return Estado.PARADO;
	}

}
