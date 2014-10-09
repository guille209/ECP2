package es.upm.miw.pd.factoryMethod.naturalNumber;

public class EsCreator extends NaturalNumberCreator{

	@Override
	public NaturalNumber createNaturalNumber(int numero) {
		// TODO Auto-generated method stub
		return new NaturalNumberEs(numero);
		
	}

}
