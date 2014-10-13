package es.upm.miw.pd.visitor;

public class Visitor2 extends Visitor {

	private int numeroAs;
	private int numeroBs;

	@Override
	public void visitElementA(ElementA e) {
		numeroAs++;
	}

	@Override
	public void visitElementB(ElementB e) {
		numeroBs++;
	}

	public int getAs() {
		return numeroAs;
	}

	public int getBs() {
		return numeroBs;
	}

}
