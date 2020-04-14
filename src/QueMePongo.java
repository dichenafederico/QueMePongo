import java.util.ArrayList;

public class QueMePongo {
	
	 public static void main( String[] args )
	 {	
		 Usuario carlos = new Usuario();
		 Usuario juan = new Usuario();
		 Usuario pepe = new Usuario();
		 
		ColorPrenda rojo = new ColorPrenda();
		ColorPrenda verde = new ColorPrenda();
		ColorPrenda amarillo = new ColorPrenda();
		ColorPrenda violeta = new ColorPrenda();
		ColorPrenda negro = new ColorPrenda();
		
		MaterialPrenda algodon = new MaterialPrenda();
		MaterialPrenda seda = new MaterialPrenda();
		MaterialPrenda cuero = new MaterialPrenda();
		
		CategoriaPrenda calzado = new CategoriaPrenda();
		CategoriaPrenda parteSuperior = new CategoriaPrenda();
		CategoriaPrenda parteInferior = new CategoriaPrenda();
		CategoriaPrenda accesorios = new CategoriaPrenda();
		
		TipoPrenda zapatos = new TipoPrenda();
		TipoPrenda camisaMangaCorta = new TipoPrenda();
		TipoPrenda pantalonLargo = new TipoPrenda();
		TipoPrenda pantalonCorto = new TipoPrenda();
		TipoPrenda remeraMangaLarga = new TipoPrenda();
		TipoPrenda anteojos = new TipoPrenda();
		
		calzado.agregarTipoACategoria(zapatos);
		parteSuperior.agregarTipoACategoria(camisaMangaCorta);
		parteInferior.agregarTipoACategoria(pantalonLargo);
		parteInferior.agregarTipoACategoria(pantalonCorto);
		parteSuperior.agregarTipoACategoria(remeraMangaLarga);		
		accesorios.agregarTipoACategoria(anteojos);			
		
		//pepe.agregarPrenda("remera de los power ranger", remeraMangaLarga, parteSuperior, algodon, rojo, null);
		
	
	}
	
	
	

}
