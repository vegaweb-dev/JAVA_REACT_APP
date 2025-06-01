package com.listatareas.crud.task;

import java.time.LocalDate;

public class Task {
    private long id;
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
