package es.upm.miw.pd.state.connection;

public abstract class Estado {
    
	public abstract void parar(Conexion conexion);
	public abstract void iniciar(Conexion conexion);
	public abstract void cerrar(Conexion conexion);
	public abstract void recibir(Conexion conexion,int respuesta);
	public abstract void enviar(Conexion conexion,String msg,Link link);
	public abstract void abrir(Conexion conexion);
}
