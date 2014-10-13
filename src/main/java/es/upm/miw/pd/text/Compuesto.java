package es.upm.miw.pd.text;

import java.util.ArrayList;

public abstract class Compuesto extends Componente {

	ArrayList<Componente> componentes;

	public abstract void aniadir(Componente componente);

	public abstract void borrar(Componente componente);

}
