package Propuesta;

import domain.prenda.Atuendo;
import domain.usuario.Usuario;

public interface EstadoDecision {
	void setDecision(Atuendo atuendo, Usuario usuario);
}