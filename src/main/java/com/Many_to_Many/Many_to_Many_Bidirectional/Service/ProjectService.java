package com.Many_to_Many.Many_to_Many_Bidirectional.Service;

import com.Many_to_Many.Many_to_Many_Bidirectional.Entity.Project;

import java.util.List;

public interface ProjectService {

    public List<Project> getAllProject();

    public Project getProject(int id);

    public String addProject(Project project);

    public Project updateProject(int id, Project project);

    public String deleteProject(int id);
}
