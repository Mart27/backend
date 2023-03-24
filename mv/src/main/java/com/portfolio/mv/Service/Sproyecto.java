/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mv.Service;

import com.portfolio.mv.Entity.Proyecto;
import com.portfolio.mv.Repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marti
 */
@Service
@Transactional
public class Sproyecto {
 @Autowired RProyecto rproyecto;
 
  public List<Proyecto> list(){
        return rproyecto.findAll();
    }
      public Optional<Proyecto> getOne(int id){
    return rproyecto.findById(id);
    }
    public Optional<Proyecto> getByNombrep(String nombrep){
    return rproyecto.findByNombrep(nombrep);
    }
    public void save(Proyecto proyec){
    rproyecto.save(proyec);
    }
    public void delete(int id){
    rproyecto.deleteById(id);
    }
    public boolean existeById(int id){
    return rproyecto.existsById(id);
    }
    public boolean existByNombrep(String nombrep){
    return rproyecto.existsByNombrep(nombrep);
    }
}
