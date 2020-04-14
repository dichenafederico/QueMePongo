import java.util.Objects;

public class Prenda {
	
	public Prenda(String descripcion, TipoPrenda tipo,CategoriaPrenda categoria,MaterialPrenda tela,
				  ColorPrenda colorPrincipal,ColorPrenda colorSecundario) throws ExcepcionCargaPrenda 
	{
		this.descripcion = Objects.requireNonNull(descripcion, "arg1 must not be null");
		this.tipo = Objects.requireNonNull(tipo, "arg1 must not be null");
		this.categoria = Objects.requireNonNull(categoria, "arg1 must not be null");
		this.tela = Objects.requireNonNull(tela, "arg1 must not be null");
		this.colorPrincipal = Objects.requireNonNull(colorPrincipal, "arg1 must not be null");	
		categoria.noSeCondiceCon(tipo);
	}
	
	String descripcion;
	TipoPrenda tipo;
	CategoriaPrenda categoria;
	MaterialPrenda tela;
	ColorPrenda colorPrincipal;
	ColorPrenda colorSecundario;

}
