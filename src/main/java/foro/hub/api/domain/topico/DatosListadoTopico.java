package foro.hub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosListadoTopico(Long id, String titulo, LocalDateTime fechaCreacion, String mensaje, String status, String autor, String curso, String respuestas) {


     public DatosListadoTopico(Topico topico) {
        this(topico.getId(),topico.getTitulo(), topico.getMensaje(), LocalDateTime.parse(topico.getFechaCreacion().toString()), topico.getStatus(),topico.getAutor(), topico.getCurso(), topico.getRespuestas());
    }
}


