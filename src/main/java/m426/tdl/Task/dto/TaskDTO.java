package m426.tdl.Task.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import m426.tdl.Task.DificultyEnum;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private LocalDate finishBy;

    @Column (nullable = false)
    private boolean finished;

    @Enumerated(EnumType.STRING)
    private DificultyEnum dificulty;

}
