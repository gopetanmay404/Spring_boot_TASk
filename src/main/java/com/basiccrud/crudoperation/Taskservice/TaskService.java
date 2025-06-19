package com.basiccrud.crudoperation.Taskservice;
import com.basiccrud.crudoperation.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import com.basiccrud.crudoperation.entity.*;
import java.util.*;
@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepo;

    public TaskService(TaskRepository taskRepo) {

        this.taskRepo = taskRepo;
    }
    public Task save(Task task){
       return  taskRepo.save(task);
    }

    public List<Task> getAllTasks(){

        return taskRepo.findAll();
    }
    public Task getTaskById(Long id) {

        return taskRepo.findById(id).orElse(null);
    }
    public boolean deletebyid(Long id) {
        if (taskRepo.existsById(id)) {
            taskRepo.deleteById(id);
            return true;
        }
        return false;
    }

    public void deleteAllTasks() {
        taskRepo.deleteAll();
    }
}
