package com.serik.implementation;

import com.serik.dto.ProjectDTO;
import com.serik.dto.TaskDTO;
import com.serik.dto.UserDTO;
import com.serik.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl extends AbstractMapService<TaskDTO, Long> implements TaskService {
    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public TaskDTO save(TaskDTO object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void update(TaskDTO object) {

        TaskDTO newTask = findById(object.getId());

        if(object.getTaskStatus() == null){
            object.setTaskStatus(newTask.getTaskStatus());
        }
        if(object.getAssignedDate() == null){
            object.setAssignedDate(newTask.getAssignedDate());
        }

        super.update(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(TaskDTO object) {
        super.delete(object);
    }

    @Override
    public TaskDTO findById(Long id) {
        return super.findById(id);
    }

    @Override
    public List<TaskDTO> findTaskByManager(UserDTO manager) {
        return super.findAll().stream().filter(task -> task.getProject().getAssignedManager().equals(manager)).collect(Collectors.toList());
    }
}
