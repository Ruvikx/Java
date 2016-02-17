package figuras;
import java.util.ArrayList;

public class MainFiguras {

	public static void main(String[] args) {
		ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
		
		Circulo circulo = new Circulo(3);
		Rectangulo rectangulo = new Rectangulo(2,3);
		Cuadrado cuadrado = new Cuadrado(2);
		Elipse elipse = new Elipse(2,4);
		
		listaFiguras.add(circulo);
		listaFiguras.add(rectangulo);
		listaFiguras.add(cuadrado);
		listaFiguras.add(elipse);
		
		for (Figura elemento : listaFiguras){
			System.out.println(elemento.getNombre() + " area = " + elemento.calcularArea());
		}

	}

}
