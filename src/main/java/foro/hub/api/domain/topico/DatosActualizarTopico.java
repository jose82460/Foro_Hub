package foro.hub.api.domain.topico;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record DatosActualizarTopico(@NotNull Long id, String titulo, LocalDateTime fechaCreacion, String mensaje, String status, String autor, String curso, String respuestas) {
}
