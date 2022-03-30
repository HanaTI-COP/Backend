package com.hanati.cop.Project.repository;

import com.hanati.cop.Project.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
