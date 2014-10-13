package es.upm.miw.pd.text;

import java.util.*;

public class FactoriaCaracter {
	
	private static FactoriaCaracter factoriaCaracter;
	Map<Character,Caracter> caracteres = new HashMap<Character,Caracter>();
	
	private FactoriaCaracter(){
		
	}
	
	public static FactoriaCaracter getFactoria(){
		if(factoriaCaracter == null){
			factoriaCaracter = new FactoriaCaracter();
		}
		return factoriaCaracter;
		
	}
	
	public Caracter get(char caracter){
		if(caracteres.containsKey(caracter)){
			return caracteres.get(caracter);
		}else{
			Caracter caracterNuevo = new Caracter(caracter);
			caracteres.put(caracter, caracterNuevo);
			return caracterNuevo;
		}
	}

}
