package es.upm.miw.pd.factoryMethod.naturalNumber;

public class EnCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber createNaturalNumber(int numero) {
		// TODO Auto-generated method stub
		return new NaturalNumberEn(numero);
		
	}

}
