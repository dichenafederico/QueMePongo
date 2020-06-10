package EventosSistema;

import domain.usuario.Usuario;
import org.uqbar.commons.model.annotations.Observable;

import javax.persistence.*;
import java.time.LocalDate;

@Observable
@Entity
public class Evento {

	@Id
	@GeneratedValue
	private long id_evento;

	private String titulo;

	private LocalDate fecha;

	@ManyToOne
	@JoinColumn(name="usuario_duenio")
	private Usuario usuario;
	
	@Enumerated
	private EstadoEvento estado = EstadoEvento.NO_PROCESADO;

	public Usuario getUsuario() {
		return usuario;
	}

	public Evento(String titulo, LocalDate fecha, Usuario usuario) {
		this.titulo = titulo;
		this.fecha = fecha;
		this.usuario = usuario;
	}

	public Evento() {
	}

	public String getTitulo() {
		return this.titulo;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}

	public void setEstado(EstadoEvento estado) {
		this.estado = estado;
	}

	public long getId_evento() {
		return id_evento;
	}

	

}
