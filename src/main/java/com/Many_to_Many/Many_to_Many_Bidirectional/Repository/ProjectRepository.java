package com.Many_to_Many.Many_to_Many_Bidirectional.Repository;

import com.Many_to_Many.Many_to_Many_Bidirectional.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
