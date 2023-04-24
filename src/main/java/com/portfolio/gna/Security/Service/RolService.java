/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.gna.Security.Service;

import com.portfolio.gna.Security.Entity.Rol;
import com.portfolio.gna.Security.Enums.RolNombre;
import com.portfolio.gna.Security.Repository.RolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
    return rolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
