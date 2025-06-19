package com.basiccrud.crudoperation.repository;
import com.basiccrud.crudoperation.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
@Repository
public interface TaskRepository extends JpaRepository <Task, Long> {
}