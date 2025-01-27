package m426.tdl.Task;

import m426.tdl.Task.dto.TaskDTO;
import java.util.List;

public interface TaskService {
    TaskDTO getById(int Id);
    List<TaskDTO> getAll();
    TaskDTO createTask(TaskDTO taskDTO);
    TaskDTO updateTask(int id, TaskDTO taskDTO);
    void deleteTask(int id);

}
