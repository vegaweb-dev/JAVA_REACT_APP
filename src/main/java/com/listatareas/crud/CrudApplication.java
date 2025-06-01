package com.listatareas.crud;

import java.time.LocalDate;
import java.util.List;
import java.time.Month;


import com.listatareas.crud.task.Task;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }


    @GetMapping(path = "/")
    public List<Task> sirveNumero() {
        return List.of(new Task(452145l, "practicar algoritmos", LocalDate.of(2025, Month.MAY, 31)));
    }
}
