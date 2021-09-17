package com.Many_to_Many.Many_to_Many_Bidirectional.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String p_name;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "projects")
    @JsonBackReference
    List<Employee> employees;

    public Project() {
    }

    public Project(int id, String p_name, List<Employee> employees) {
        this.id = id;
        this.p_name = p_name;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", p_name='" + p_name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
