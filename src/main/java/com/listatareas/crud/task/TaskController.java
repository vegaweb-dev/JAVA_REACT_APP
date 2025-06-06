package com.listatareas.crud.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/tasks")
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> sirveTask() {
        return taskService.sirveTask();
    }

    @PostMapping
    public void postearTarea(@RequestBody Task task) {
        this.taskService.newTask(task);
    }

}
