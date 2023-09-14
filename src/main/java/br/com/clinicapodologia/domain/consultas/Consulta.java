package br.com.clinicapodologia.domain.consultas;

import br.com.clinicapodologia.domain.medico.Medico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "consultas")
@Entity(name = "Consulta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medico_id")
    private Medico medico;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "paciente_id")
//    private Paciente paciente;

    private LocalDateTime data;
}
