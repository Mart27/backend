/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mv.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Marti
 */
@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombrep;
    private String descripcionp;
    private String direccionp;

    public Proyecto() {
    }

    public Proyecto(String nombrep, String descripcionp, String direccionp) {
        this.nombrep = nombrep;
        this.descripcionp = descripcionp;
        this.direccionp = direccionp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getDescripcionp() {
        return descripcionp;
    }

    public void setDescripcionp(String descripcionp) {
        this.descripcionp = descripcionp;
    }

    public String getDireccionp() {
        return direccionp;
    }

    public void setDireccionp(String direccionp) {
        this.direccionp = direccionp;
    }
    
}
