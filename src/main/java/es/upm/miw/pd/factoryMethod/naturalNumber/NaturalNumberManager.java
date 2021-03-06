package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {

	private NaturalNumberCreator creator;

	private NaturalNumber naturalNumber;

	public void createNaturalNumber(int numero) {
		naturalNumber = creator.createNaturalNumber(numero);
	}

	public void setCreator(NaturalNumberCreator creator) {
		this.creator = creator;
	}

	public NaturalNumber getNaturalNumber() {
		return naturalNumber;
	}
}
