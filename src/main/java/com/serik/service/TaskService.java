package com.serik.service;

import com.serik.dto.TaskDTO;
import com.serik.dto.UserDTO;

import java.util.List;

public interface TaskService extends CrudService<TaskDTO, Long>{

    List<TaskDTO> findTaskByManager(UserDTO manager);

}
