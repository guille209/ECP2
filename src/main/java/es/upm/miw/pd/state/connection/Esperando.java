package es.upm.miw.pd.state.connection;

public class Esperando extends EstadoObjeto {

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Accion no permitida... ");

	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Accion no permitida... ");

	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Accion no permitida... ");

	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		// TODO Auto-generated method stub
		if (respuesta == 0) {
			conexion.setEstado(new Preparado());
		} else if (respuesta > 0) {
			conexion.setEstado(new Cerrado());
		}

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
		return Estado.ESPERANDO;
	}

}
