package notificaciones;

import com.mashape.unirest.http.exceptions.UnirestException;

public interface MedioComunicacion {
	void enviar(Notificacion notificacion) throws UnirestException;
}
