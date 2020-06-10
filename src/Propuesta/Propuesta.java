package Propuesta;

import domain.prenda.Atuendo;

public class Propuesta
{
	Atuendo atuendo;
	EstadoDecision decision;

	public Propuesta(Atuendo atuendo, EstadoDecision decision) {
		this.atuendo = atuendo;
		this.decision = decision;
	}

	public void deshacer() {
		this.atuendo.decisionNoTomada();
	}
}