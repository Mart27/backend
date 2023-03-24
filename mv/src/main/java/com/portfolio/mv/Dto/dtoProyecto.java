/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mv.Dto;

import jakarta.validation.constraints.NotBlank;

/**
 *
 * @author Marti
 */
public class dtoProyecto {
    @NotBlank
    private String nombrep;
    @NotBlank
    private String descripcionp;
    @NotBlank
    private String direccionp;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombrep, String descripcionp, String direccionp) {
        this.nombrep = nombrep;
        this.descripcionp = descripcionp;
        this.direccionp = direccionp;
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
