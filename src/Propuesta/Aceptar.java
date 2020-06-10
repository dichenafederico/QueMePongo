package Propuesta;

import domain.prenda.Atuendo;
import domain.usuario.Usuario;

public class Aceptar implements EstadoDecision {
	public void setDecision(Atuendo atuendo, Usuario usuario) {
		atuendo.aceptar();
	}
}