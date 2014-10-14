package es.upm.miw.pd.command;

public class Calculadora {
    protected int total;
    private int valorAnterior;

    public Calculadora() {
        this.iniciar();
    }

    public int getTotal() {
        return total;
    }

    protected void setTotal(int total) {
        this.total = total;
    }

    public void sumar(int valor) {
    	valorAnterior = total;
        this.setTotal(this.total + valor);
    }

    public void restar(int valor) {
    	valorAnterior = total;
        this.setTotal(this.total - valor);
    }

    public void iniciar() {
        this.setTotal(0);
    }
    
    public int deshacer(){
    	total = valorAnterior;
    	return total;
    }
    public String toString(){
    	return "Resultado Total es :"+total;
    }
}