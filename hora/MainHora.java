package hora;

public class MainHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSetGet();
		testSetGetHora();
		testImprimirHora();
	}
	public static void testSetGet(){
		Hora espa�a=new Hora();
		espa�a.setHoras(7);
		espa�a.setMinutos(28);
		espa�a.setSegundos(40);
		if(espa�a.getHoras() == 7){
			System.out.println("Ok test Set Get");}
		else{
			System.out.println("Fail test Set Get");}
		if(espa�a.getMinutos() == 28){
			System.out.println("Ok test Set Get");}
		else{
			System.out.println("Fail test Set Get");}
		if(espa�a.getSegundos() == 40){
			System.out.println("Ok test Set Get");}
		else{
			System.out.println("Fail test Set Get");}
		
			
	}
	public static void testSetGetHora(){
		Hora espa�a=new Hora();
		espa�a.setHora(7,28,40);
		if(espa�a.getHoras() == 7){
			System.out.println("Ok test Set Get Hora");}
		else{
			System.out.println("Fail test Set Get Hora");}
		if(espa�a.getMinutos() == 28){
			System.out.println("Ok test Set Get Hora");}
		else{
			System.out.println("Fail test Set Get Hora");}
		if(espa�a.getSegundos() == 40){
			System.out.println("Ok test Set Get Hora");}
		else{
			System.out.println("Fail test Set Get Hora");}
		if(espa�a.getHora().equals("7:28:40")){
			System.out.println("Ok test Set Get Hora");}
		else{
			System.out.println("Fail test Set Get Hora");}
	}
		
	public static void testImprimirHora(){
		Hora espa�a = new Hora();
		espa�a.imprimirHora();
	}
} 

