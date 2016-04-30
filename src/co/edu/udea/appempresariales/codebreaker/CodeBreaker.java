package co.edu.udea.appempresariales.codebreaker;

public class CodeBreaker {
	private String numeroSecreto = "4756";

	public static void main(String[] args) {
	}

	public String testCode(String numeroIngresado){
		
		boolean valido = validarCodigo(numeroIngresado);
		if(!valido){
			return "";
		}	
		
		String resultado;
		String guiones = "";  // Agrega guiones si el número existe 
		String posiciones=""; // Agrega X si el número existe y ademas esta en su posición
		
		for(int i = 0; i<numeroIngresado.length();i++){		
			
			if(numeroSecreto.indexOf(numeroIngresado.charAt(i)) != -1){
				if(numeroSecreto.indexOf(numeroIngresado.charAt(i))==i){
					posiciones+="X";
				}else{
					guiones+="_";
				}
			}
		}
			resultado=posiciones+guiones;
		return resultado;
	}
	
	public boolean validarCodigo(String numeroIngresado){
		/* Se compara si el tamaño del número ingresado coincide con el número secreto*/
		String pattern = "[0-9]+";
		if (numeroIngresado.length() != numeroSecreto.length()){ 
			return false;
		}
		
		if(!numeroIngresado.matches(pattern)){
			return false;			
		}
		
		return true;
	}
}
