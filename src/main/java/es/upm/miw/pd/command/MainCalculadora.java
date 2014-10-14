package es.upm.miw.pd.command;

import es.upm.miw.pd.command.ComandoImprimir;
import es.upm.miw.pd.command.ComandoIniciar;
import es.upm.miw.pd.command.ComandoRestar;
import es.upm.miw.pd.command.ComandoSumar;
import upm.jbb.IO;

public class MainCalculadora {
    private GestorComandos gestor;
    private GestorMementos<MementoCalculadora> gm;

    private Mementable<MementoCalculadora> calc;

    public MainCalculadora() {
    	this.gm = new GestorMementos<MementoCalculadora>();
    	calc = new Calculadora2();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoImprimir(calc));
        this.gestor.add(new ComandoDeshacer(calc));
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestor.keys());
        this.gestor.execute(key);
    }
    
    public void createMemento() {
        this.gm.addMemento(IO.in.readString("Nombre para el guardado"), calc.createMemento());
    }

    public void restoreMemento() {
        this.calc.restoreMemento(this.gm.getMemento((String) IO.in.select(gm.keys(), "Restaurar a version")));
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadora());
    }
}