/*
 *Alumno: Bueno Rosas Brayan Omar
  Version: 1.0 
  Fecha: 05/09/2017
 */
package soliddepensiveprinciple;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brayan sss
 */
public class DependencyInversion {

   
    public static void main(String[] args) {
        
        IOperacionFigura opeCuadrado = new Cuadrado ("cuadrado",5.0);
        IOperacionFigura opeTriangulo = new Triangulo("triangulo", 4.0, 3.0);
        IOperacionFigura opeRectangulo = new Rectangulo("rectangulo", 4.0, 3.0);
	IOperacionFigura opeCirculo = new Circulo("circulo", 10.0);
        
                
		List<IOperacionFigura> listaOperacion = new ArrayList<IOperacionFigura>();
                listaOperacion.add(opeCuadrado);
		listaOperacion.add(opeTriangulo);
		listaOperacion.add(opeCirculo);
                listaOperacion.add(opeRectangulo);
                
		
		calcularArea(listaOperacion);
	}
	
	public static void calcularArea(List<IOperacionFigura> listaIOperacionFiguras) {
            //Da un recorrido de los objetos de la lista instaurados en la interfaz
		for (IOperacionFigura opeFigura : listaIOperacionFiguras) {
			
                        System.out.println("O--O--O--O--O--O--O--O--O--O--O--O--O--O--O");
			System.out.println("Nombre de la figura: " + opeFigura.figura().getNombre());
                        System.out.println("Area:  " + opeFigura.calcularArea()+" unidades cuadradas");
                        
                        
		}
               
                System.out.println(" ");
                System.out.println("FIN DEL PROGRAMA");
	}
    }
    
