package prenda;

import domain.exceptions.ColoresIncorrectosException;
import domain.exceptions.MaterialInvalidoException;
import domain.exceptions.PrendaIncompletaException;

public class PrendaBorrador {

	private TipoDePrenda tipo;
	private Material material;
	private Color colorPrimario;
	private Color colorSecundario;
	private Imagen imagen;

	public Imagen getImagen() {
		return imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	private Float abrigo;

	public void setTipo(TipoDePrenda tipo) {
		this.tipo = tipo;
	}

	public void setAbrigo(float abrigo) {
		this.abrigo = abrigo;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public void setColorPrimario(Color colorPrimario) {
		this.colorPrimario = colorPrimario;
	}

	public void setColorSecundario(Color colorSecundario) {
		this.colorSecundario = colorSecundario;
	}

	private void validarMaterialPrendaValido() {
		if (!this.tipo.materialesValidos().contains(this.material))
			throw new MaterialInvalidoException();
	}

	private void validarColoresDistintos() {
		if (colorSecundario == colorPrimario)
			throw new ColoresIncorrectosException();
	}

	private void validarValoresNoNulos() {
		if (tipo == null || material == null || colorPrimario == null || abrigo == null)
			throw new PrendaIncompletaException();
	}

	private void validarPrenda() {
		validarValoresNoNulos();
		validarMaterialPrendaValido();
		validarColoresDistintos();
	}

	public Prenda crearPrenda() {
		validarPrenda();
		return new Prenda(this.tipo, this.material, this.colorPrimario, this.colorSecundario, this.imagen, this.abrigo);
	}
}