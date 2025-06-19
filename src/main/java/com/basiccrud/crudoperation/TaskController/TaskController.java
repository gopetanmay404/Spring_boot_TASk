package com.basiccrud.crudoperation.TaskController;
import com.basiccrud.crudoperation.entity.Task;
import com.basiccrud.crudoperation.Taskservice.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

//    public TaskController(TaskService taskService) {
//        this.taskService = taskService;
//    }
    @PostMapping
    public Task create(@RequestBody Task task){
        return taskService.save(task);
    }



    @GetMapping("/check")
    public ResponseEntity<List<Task>> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        return ResponseEntity.ok(tasks);
        //return new ResponseEntity<>(tasks, HttpStatus.OK);
    }



    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        Task task = taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }

//    @PutMapping("/{id")
//    public  ResponseEntity<Task> changeid(@PathVariable Long id, @RequestBody Task updatedTask){
//        Task task=taskService.changeid(id,updatedTask);
//        if (task != null) {
//            return ResponseEntity.ok(task);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    // this is somewhere getting the whole data in the part...
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task updatedTask) {
        Task existingTask = taskService.getTaskById(id);

        if (existingTask == null) {
            return ResponseEntity.notFound().build(); // 404 Not Found k liye hota hai bro , that's it now lets do something new bro....
        }

        existingTask.setTitle(updatedTask.getTitle());
        existingTask.setCompleted(updatedTask.isCompleted());

        Task savedTask = taskService.save(existingTask);
        return ResponseEntity.ok(savedTask);
    }
//   @DeleteMapping("{Tanmay}")
//    public boolean delete(@PathVariable Long id) {
//       taskService.deletebyid(id);
//       return true;
//   }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete2(@PathVariable Long id) {
        boolean deleted = taskService.deletebyid(id);
        if (deleted) {
            return ResponseEntity.ok("Deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found");
        }
    }
    @DeleteMapping("/delete-all")
    public ResponseEntity<String> deleteAll() {
        taskService.deleteAllTasks();
        return ResponseEntity.ok("All tasks deleted successfully.");
    }
}
