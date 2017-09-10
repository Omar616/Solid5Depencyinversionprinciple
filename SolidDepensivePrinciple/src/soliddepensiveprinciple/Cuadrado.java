/*
 *Alumno: Bueno Rosas Brayan Omar
  Version: 1.0 
  Fecha: 05/09/2017
 */
package soliddepensiveprinciple;

/**
 *
 * @author Brayan
 */

public class Cuadrado extends Figura implements IOperacionFigura {
	
	private double lado;

	public Cuadrado(String nombre, double lado) {
		super(nombre);
		this.lado = lado;
	}	

	@Override
	public double calcularArea() {
		return Math.pow(lado,2);
	}

        public double getLado() {
            return lado;
        }

        public void setLado(double lado) {
            this.lado = lado;
        }

	@Override
	public Figura figura() {
		return new Figura(getNombre());
	}

}
