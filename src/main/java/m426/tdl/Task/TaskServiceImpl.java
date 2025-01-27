package m426.tdl.Task;

import lombok.AllArgsConstructor;
import m426.tdl.Task.dto.TaskDTO;
import m426.tdl.Task.dto.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import m426.tdl.Task.TaskService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Override
    public TaskDTO getById(int Id){
        Optional<Task> taskOptional = taskRepository.findById(Id);
        if (taskOptional.isPresent()) {
            Task task = taskOptional.get();
            return TaskMapper.mapToTaskDTO(task);

        } else {
            throw new RuntimeException("Task not found");
        }
    };

    @Override
    public List<TaskDTO> getAll(){
        List<Task> tasks = taskRepository.findAll();
        return tasks.stream()
                .map(TaskMapper::mapToTaskDTO)
                .collect(Collectors.toList());
    };

    @Override
    public TaskDTO createTask(TaskDTO taskDTO) {
        Task task = TaskMapper.mapToTask(taskDTO);
        Task savedTask = taskRepository.save(task);
        return TaskMapper.mapToTaskDTO(savedTask);
    }

    @Override
    public TaskDTO updateTask(int id, TaskDTO taskDTO){
        Optional<Task> taskOptional = taskRepository.findById(id);
        if (taskOptional.isPresent()) {
            Task task = taskOptional.get();
            task.setName(taskDTO.getName());
            task.setFinishBy(taskDTO.getFinishBy());
            task.setFinished(taskDTO.isFinished());
            task.setDificulty(taskDTO.getDificulty());
            Task updatedTask = taskRepository.save(task);
            return TaskMapper.mapToTaskDTO(updatedTask);

        } else {
            throw new RuntimeException("Task not found");
        }
    };

    @Override
    public void deleteTask(int id){
        taskRepository.deleteById(id);
    };

}
