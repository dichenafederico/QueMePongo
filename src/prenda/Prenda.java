package prenda;

import java.util.Objects;

public class Prenda {

	private TipoDePrenda tipo;
	private Material material;
	private Color colorPrimario;
	private Color colorSecundario;
	private Imagen imagen;
	private float temperaturaAbrigo;


	public Prenda(TipoDePrenda tipo, Material material, Color colorPrimario, Color colorSecundario,Imagen imagen, float abrigo) {
		this.tipo = tipo;
		this.material = material;
		this.colorPrimario = colorPrimario;
		this.colorSecundario = colorSecundario;
		this.imagen = imagen;
		this.temperaturaAbrigo = abrigo;
	}

	public Prenda() {
	}

	public TipoDePrenda getTipo() {
		return this.tipo;
	}

	public Categoria getCategoria() {
		return this.tipo.getCategoria();
	}

	public Material getMaterial() {
		return this.material;
	}

	public Color getColorPrimario() {
		return this.colorPrimario;
	}

	public Color getColorSecundario() {
		return this.colorSecundario;
	}

	public float getTemperaturaMaxima() {
		return temperaturaAbrigo;
	}

	public Imagen getImagen() {
		return imagen;
	}

}
