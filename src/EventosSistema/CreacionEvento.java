package EventosSistema;

import domain.usuario.Usuario;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CreacionEvento {

	Usuario usuario;
	static LinkedList<Evento> eventos = new LinkedList<Evento>();

	public CreacionEvento(Usuario usuario) {
		this.usuario = usuario;
	}

	public void obtenerSugerenciasDelDia(LocalDate fecha) {
		List<Evento> eventosDelDia;
		eventosDelDia = eventos.stream().filter(evento -> this.igualDia(evento.getFecha(), fecha))
				.collect(Collectors.toList());

		eventosDelDia.forEach(evento -> this.usuario.sugerenciasParaEvento(evento));
	}

	public static void crearEvento(String titulo, LocalDate fecha) {
		eventos.add(new Evento(titulo, fecha, null));
	}

	public boolean igualDia(LocalDate fechaEvento, LocalDate fechaAComparar) {
		return fechaAComparar.getDayOfMonth() == fechaEvento.getDayOfMonth()
				&& fechaAComparar.getMonthValue() == fechaEvento.getMonthValue()
				&& fechaAComparar.getYear() == fechaEvento.getYear();
	}
}
