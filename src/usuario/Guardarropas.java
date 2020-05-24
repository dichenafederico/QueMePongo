package usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Guardarropas {

	private Usuario duenio = new Usuario();
	private List<Prenda> prendas = new ArrayList<Prenda>();

	public Guardarropas() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
	public List<Prenda> getPrendas() {
		return prendas;
	}

}
