package com.listatareas.crud.task;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class TaskService {
    @GetMapping()
    public List<Task> sirveTask() {
        return  List.of(new Task(452145l, "practicar algoritmos", LocalDate.of(2025, Month.MAY, 31)));
    }
}
