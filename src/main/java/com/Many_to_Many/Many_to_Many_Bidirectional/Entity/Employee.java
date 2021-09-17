package com.Many_to_Many.Many_to_Many_Bidirectional.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String e_name;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Project> projects;

    public Employee() {
    }

    public Employee(int id, String e_name, List<Project> projects) {
        this.id = id;
        this.e_name = e_name;
        this.projects = projects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", e_name='" + e_name + '\'' +
                ", projects=" + projects +
                '}';
    }
}
