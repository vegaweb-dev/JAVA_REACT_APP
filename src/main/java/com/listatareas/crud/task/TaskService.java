package com.listatareas.crud.task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @GetMapping()
    public List<Task> sirveTask() {
    /*
    en el momento que hago la inyeccion de dependencia del repositorio crado ya estariamos trabajando con ifo
    de la base de daros por tanto este codigo de abajo ya no seria necesario
        return  List.of(new Task(452145l, "practicar algoritmos", LocalDate.of(2025, Month.MAY, 31)));
        */
        return this.taskRepository.findAll();
    }

    public void newTask(Task task) {
        Optional<Task> res = taskRepository.findTaskBynameOftask(task.getNameOftask());
        if (res.isPresent()) {
            throw new IllegalStateException("esta tarea ya existe");
        }
        taskRepository.save(task);
    }
}
