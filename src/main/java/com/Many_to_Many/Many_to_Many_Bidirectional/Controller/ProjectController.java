package com.Many_to_Many.Many_to_Many_Bidirectional.Controller;

import com.Many_to_Many.Many_to_Many_Bidirectional.Entity.Project;
import com.Many_to_Many.Many_to_Many_Bidirectional.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping("getProject/{id}")
    public Project getProject(@PathVariable int id) {
        Project project = projectService.getProject(id);
        return project;
    }

    @GetMapping("/getProjects")
    public List<Project> getAllProject() {
        return (List<Project>) projectService.getAllProject();
    }

    @PostMapping("/saveProject")
    public Project addProject(@RequestBody Project project) {
        projectService.addProject(project);
        return project;
    }

    @DeleteMapping("/deleteProject/{id}")
    public String deleteProject(@PathVariable int id) {
        projectService.deleteProject(id);
        return "Project deleted form database id-" + id;
    }

    @PutMapping("/updateProject/{id}")
    public Project updateProject(@PathVariable int id, @RequestBody Project project) {
        projectService.updateProject(id, project);
        return project;
    }
}
