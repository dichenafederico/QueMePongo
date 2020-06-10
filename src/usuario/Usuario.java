package usuario;

import prenda.*;

import java.util.ArrayList;

public class Usuario {
	
	String nombre;
	ArrayList<Atuendo> propuestas = new ArrayList<Atuendo>();
	ArrayList<Prenda> guardarropas = new ArrayList<Prenda>();
	
	public void agregarPrenda(String descripcion, TipoPrenda tipo, CategoriaPrenda categoria, MaterialPrenda tela,
							  ColorPrenda colorPrincipal, ColorPrenda colorSecundario) throws ExcepcionCargaPrenda
	{	
		Prenda nuevaPrenda = new Prenda(descripcion,tipo,categoria,tela,colorPrincipal,colorSecundario);
		this.guardarropas.add(nuevaPrenda);		
	}

	public List<Atuendo> obtenerSugerencias(Evento evento) {
		return guardarropas.stream().map(guardarropa -> guardarropa.generarSugerencia(evento))
				.flatMap(atuendosSugeridos -> atuendosSugeridos.stream()).collect(Collectors.toList());
	}

	public List<Atuendo> sugerenciasAceptadas() {
		return sugerencias.stream().filter(atuendo -> atuendo.estaAceptado()).collect(Collectors.toList());
	}

	public List<Atuendo> sugerenciasRechazadas() {
		return sugerencias.stream().filter(atuendo -> atuendo.estaRechazado()).collect(Collectors.toList());
	}

	public void elegirPropuesta(Atuendo propuesta, Decision decision) {
		// TODO rename a tomarDecision o algo aprox
		// Esto sirve para tomar una decision sobre una sugerencia
		this.acciones.add(new Accion(sugerencia, decision));
		decision.setDecision(propuesta, this);
	}

	public void deshacerUltimaAccion() {
		Accion ultimaAccion = this.acciones.getLast();
		ultimaAccion.deshacer();
		this.acciones.removeLast();
	}

	public void propuestaParaEvento(Evento evento) {
		propuestas.addAll(this.obtenerSugerencias(evento));
	}

	public void addPropuestas(List<Atuendo> nuevasPropuestas) {
		this.propuestas.addAll(nuevasPropuestas);
	}

	public List<Atuendo> getPropuestas() {
		return this.propuestas;
	}
	

}
