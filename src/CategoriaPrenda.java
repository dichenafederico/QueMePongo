import java.util.ArrayList;

public class CategoriaPrenda {
	
	ArrayList<TipoPrenda> tiposPrendas = new ArrayList<TipoPrenda>();
	
	public void agregarTipoACategoria(TipoPrenda tipo) {
		tiposPrendas.add(tipo);
	}
	
	public void noSeCondiceCon(TipoPrenda tipo) throws ExcepcionTipoNoCorrespondiente
	{
		if(!tiposPrendas.contains(tipo)) throw new ExcepcionTipoNoCorrespondiente("A message that describes the error.", null);					

	}
}
