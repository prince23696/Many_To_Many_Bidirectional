package com.Many_to_Many.Many_to_Many_Bidirectional.Service;

import com.Many_to_Many.Many_to_Many_Bidirectional.Entity.Project;
import com.Many_to_Many.Many_to_Many_Bidirectional.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public List<Project> getAllProject() {
        return (List<Project>) projectRepository.findAll();
    }

    @Override
    public Project getProject(int id) {
        return projectRepository.findById(id).get();
    }

    @Override
    public String addProject(Project project) {
        projectRepository.save(project);
        return "Project Added Successfully";
    }

    @Override
    public Project updateProject(int id, Project project) {
        Project project1 = projectRepository.getById(id);
        project1.setP_name(project.getP_name());
        project1.setEmployees(project.getEmployees());
        projectRepository.save(project1);
        return project1;
    }

    @Override
    public String deleteProject(int id) {
        projectRepository.deleteById(id);
        return "Project Deleted Successfully";
    }
}
