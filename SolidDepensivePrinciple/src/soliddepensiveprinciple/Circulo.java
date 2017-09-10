/*
 *Alumno: Bueno Rosas Brayan Omar
  Version: 1.0 
  Fecha: 05/09/2017
 */
package soliddepensiveprinciple;

/**
 *
 * @author Brayans
 */


public class Circulo extends Figura implements IOperacionFigura {

	private double radio;

	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	}
	

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public Figura figura() {
		return new Figura(getNombre());
	}

}

