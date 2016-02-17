package hora;

public class Hora {
	private int horas = 0;
	private int minutos = 0;
	private int segundos = 0;
	public Hora(){
		
	}
	public Hora(int horas, int minutos, int segundos){
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHoras() {
		return this.horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return this.minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return this.segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	public void setHora(int horas, int minutos, int segundos){
		this.setHoras(horas);
		this.setMinutos(minutos);
		this.setSegundos(segundos);
	}
	public String getHora(){
		String horas = Integer.toString(this.getHoras());
		String minutos = Integer.toString(this.getMinutos());
		String segundos = Integer.toString(this.getSegundos());
		String hora = horas + ":" + minutos + ":" + segundos;
		return hora;
	}
	
	public void imprimirHora(){
		System.out.println(this.getHora());
	}
}
