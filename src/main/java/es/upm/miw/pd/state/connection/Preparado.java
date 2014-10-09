package es.upm.miw.pd.state.connection;

public class Preparado extends EstadoObjeto {

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(new Parado());

	}

	@Override
	public void iniciar(Conexion conexion) {

	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(new Cerrado());

	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Accion no permitida... ");

	}

	@Override
	public void enviar(Conexion conexion, String msg, Link link) {
		link.enviar(msg);
		conexion.setEstado(new Esperando());

	}

	@Override
	public void abrir(Conexion conexion) {
		// TODO Auto-generated method stub

	}

	@Override
	public Estado getEstado() {
		// TODO Auto-generated method stub
		return Estado.PREPARADO;
	}

}
