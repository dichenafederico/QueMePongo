package notificaciones;

import domain.exceptions.CamposRequeridosFaltantesExcepcion;

import javax.management.RuntimeErrorException;

public class NotificacionBuilder {
	
	public Notificacion construirNotificacion(String unEmail,
			String unMensaje,
			NivelPrioridadNotificacion unNivelPrioridadNotificacion,
			String unNumeroTelefono) {
		
		if(unEmail == null && unNumeroTelefono == null) {
			throw new RuntimeErrorException(new CamposRequeridosFaltantesExcepcion());
		}
		
		return new Notificacion(unEmail,
				unMensaje,
				unNivelPrioridadNotificacion,
				unNumeroTelefono);
	}

}
