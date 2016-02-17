package hora;

public class MainHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSetGet();
		testSetGetHora();
		testImprimirHora();
	}
	public static void testSetGet(){
		Hora españa=new Hora();
		españa.setHoras(7);
		españa.setMinutos(28);
		españa.setSegundos(40);
		if(españa.getHoras() == 7){
			System.out.println("Ok test Set Get");}
		else{
			System.out.println("Fail test Set Get");}
		if(españa.getMinutos() == 28){
			System.out.println("Ok test Set Get");}
		else{
			System.out.println("Fail test Set Get");}
		if(españa.getSegundos() == 40){
			System.out.println("Ok test Set Get");}
		else{
			System.out.println("Fail test Set Get");}
		
			
	}
	public static void testSetGetHora(){
		Hora españa=new Hora();
		españa.setHora(7,28,40);
		if(españa.getHoras() == 7){
			System.out.println("Ok test Set Get Hora");}
		else{
			System.out.println("Fail test Set Get Hora");}
		if(españa.getMinutos() == 28){
			System.out.println("Ok test Set Get Hora");}
		else{
			System.out.println("Fail test Set Get Hora");}
		if(españa.getSegundos() == 40){
			System.out.println("Ok test Set Get Hora");}
		else{
			System.out.println("Fail test Set Get Hora");}
		if(españa.getHora().equals("7:28:40")){
			System.out.println("Ok test Set Get Hora");}
		else{
			System.out.println("Fail test Set Get Hora");}
	}
		
	public static void testImprimirHora(){
		Hora españa = new Hora();
		españa.imprimirHora();
	}
} 

