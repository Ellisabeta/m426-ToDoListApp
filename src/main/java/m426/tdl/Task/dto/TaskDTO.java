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

    private int id;

    private String name;

    private LocalDate finishBy;

    private boolean finished;

    private DificultyEnum dificulty;

}
