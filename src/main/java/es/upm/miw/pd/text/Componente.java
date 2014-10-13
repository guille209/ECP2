package es.upm.miw.pd.text;

public abstract class Componente {

	public abstract String dibujar(boolean mayusculas);

	public abstract boolean esCompuesto();

	public abstract void add(Componente componente);

	public abstract void supr(Componente componente);

}
