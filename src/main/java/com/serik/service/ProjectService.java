package com.serik.service;

import com.serik.dto.ProjectDTO;

public interface ProjectService extends CrudService<ProjectDTO,String>{

    void complete(ProjectDTO project);
}
