package DniNie;

public class Dni {
	private String dni  = null;
	private Boolean numeroSano = false;
	private Boolean letraSana 	= false;
	// Composici�n (agregaci�n) "Has - a" / "Tiene - un"
	private TablaAsignacion tabla = new TablaAsignacion();

	/* Constructores */
	
	public Dni(String dni) {
		this.dni = dni;
	}
	
	/* Encapsulacion */
	
	public void setDni(String cadena){
		this.dni = cadena;
	}

	public String getDni(){
		return this.dni;
	}

	private void setNumeroSano(Boolean valor){
		this.numeroSano = valor;
	}
	
	public Boolean getNumeroSano(){
		return this.numeroSano;
	}
	
	private void setLetraSana(Boolean valor){
		this.letraSana = valor;
	}

	public Boolean getLetraSana(){
		return this.letraSana;
	}
	
	/*
	 * L�gica 
	 */

	/* Interfaz P�blica */
	
	public Boolean checkCIF(){
		return checkDni() && checkLetra();
	}
	
	public Boolean checkDni(){
		setNumeroSano( checkLongitud() && stringEsNumero( getParteNumericaDni() ) );
		return getNumeroSano();
	}
	
	public Boolean checkLetra(){
		if (getNumeroSano() ) {
			setLetraSana ( Character.isUpperCase(getParteAlfabeticaDni()) && checkLetraValida() );
			return getLetraSana();
		}
		else {
			return false;
		}
	}
					
	public Character obtenerLetra(){
		// calcularLetra no puede ejecutarse si antes no se cumplen las condiciones previas en checkDni
		// y checkletra
		if ( getNumeroSano() ){
			return this.tabla.calcularLetra( getParteNumericaDni() );
		}
		else // EXCEPCION: aun no sabemos implementarlas - este c�digo no es admisible
			return getParteAlfabeticaDni();
	}


	public Boolean checkLongitud() {
		return getDni().length() == 9;
	}
	
	public Boolean stringEsNumero(String cadena){
		for( int i=0; i < cadena.length(); i++ ){
			if ( ! Character.isDigit(cadena.charAt(i)) ){
				return false;
			}
			else;
		}
		return true;
	}		
		
	public String getParteNumericaDni() {
		return (String) dni.substring(0, dni.length() - 1);
	}
	
	public Character getParteAlfabeticaDni() {
		return dni.charAt(dni.length() - 1);
	}
	
	public Boolean checkLetraValida() {
		if ( getNumeroSano() ) {
			return getParteAlfabeticaDni() == obtenerLetra();
		}
		else
			return false;
	}

}
