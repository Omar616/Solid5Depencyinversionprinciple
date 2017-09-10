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
public class Figura  {
	//nombre es el unico atributo que comparten todas las figuras que haremos
    //asi que se heredara de la clase padre figura
	private String nombre;

	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
