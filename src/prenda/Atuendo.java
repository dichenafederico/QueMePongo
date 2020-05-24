package prenda;

import java.util.ArrayList;

public class Atuendo {

	List<Prenda> parteSuperior;
	List<Prenda> parteInferior;
	List<Prenda> calzado;
	List<Prenda> accesorio;
	Guardarropas guardarropasCreador; // Guardarropas desde donde se creo el atuendo


	public Atuendo(List<Prenda> parteSuperior, List<Prenda> parteInferior, List<Prenda> calzado, List<Prenda> accesorio,
				   Guardarropas guardarropasCreador) {
		this.parteSuperior = parteSuperior;
		this.parteInferior = parteInferior;
		this.calzado = calzado;
		this.accesorio = accesorio;
		this.guardarropasCreador = guardarropasCreador;
	}
	public Atuendo() {
	}

	public Guardarropas getGuardarropasCreador() {
		return guardarropasCreador;
	}


	public float rangoTemperaturaAtuendo() {}

	public boolean aptoParaTemperatura(float celsuis) {
		return true;
	}

}
