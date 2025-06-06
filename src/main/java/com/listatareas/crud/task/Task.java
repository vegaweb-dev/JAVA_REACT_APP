package com.listatareas.crud.task;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nameOftask;
    private LocalDate fecha;

    public Task() {
    }

    public Task(long id, String nameOftask, LocalDate fecha) {
        this.id = id;
        this.nameOftask = nameOftask;
        this.fecha = fecha;
    }

    public Task(String nameOftask, LocalDate fecha) {
        this.nameOftask = nameOftask;
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameOftask() {
        return nameOftask;
    }

    public void setNameOftask(String nameOftask) {
        this.nameOftask = nameOftask;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
