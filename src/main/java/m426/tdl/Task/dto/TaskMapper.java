package m426.tdl.Task.dto;


import m426.tdl.Task.Task;
import m426.tdl.Task.dto.TaskDTO;

public class TaskMapper {

    public static TaskDTO mapToTaskDTO(Task task){
        return new
                TaskDTO(
                task.getId(),
                task.getName(),
                task.getFinishBy(),
                task.isFinished(),
                task.getDificulty()
        );
    }

    public static Task mapToTask(TaskDTO taskDTO){
        return new
                Task(
                taskDTO.getId(),
                taskDTO.getName(),
                taskDTO.getFinishBy(),
                taskDTO.isFinished(),
                taskDTO.getDificulty()
        );
    }
}
