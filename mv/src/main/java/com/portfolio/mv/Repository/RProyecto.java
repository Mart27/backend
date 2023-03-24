/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.mv.Repository;

import com.portfolio.mv.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marti
 */
@Repository
public interface RProyecto extends JpaRepository<Proyecto,Integer>{
    public Optional<Proyecto> findByNombrep(String nombrep);
    public boolean existsByNombrep(String nombrep);
    
}
