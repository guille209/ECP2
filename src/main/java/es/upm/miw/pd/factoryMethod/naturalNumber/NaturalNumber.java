package es.upm.miw.pd.factoryMethod.naturalNumber;

public abstract class NaturalNumber {

	protected int value;
	 private static String[] textValue;
	
	public NaturalNumber(int value,String[] textValue){
		this.value = value;
		NaturalNumber.textValue = textValue;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		assert value >= 0;
		this.value = value;
	}

	public void add(int value) {
		this.setValue(this.value + value);
	}
	
	 public String getTextValue() {
	        if (this.value < textValue.length) {
	            return NaturalNumber.textValue[this.value];
	        } else {
	            return "???";
	        }
	    }

}
