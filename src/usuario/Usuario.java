package usuario;

import prenda.*;

import java.util.ArrayList;

public class Usuario {
	
	String nombre;
	ArrayList<Atuendo> atuendos = new ArrayList<Atuendo>();
	ArrayList<Prenda> guardarropas = new ArrayList<Prenda>();
	
	public void agregarPrenda(String descripcion, TipoPrenda tipo, CategoriaPrenda categoria, MaterialPrenda tela,
							  ColorPrenda colorPrincipal, ColorPrenda colorSecundario) throws ExcepcionCargaPrenda
	{	
		Prenda nuevaPrenda = new Prenda(descripcion,tipo,categoria,tela,colorPrincipal,colorSecundario);
		this.guardarropas.add(nuevaPrenda);		
	}
	
	

}
