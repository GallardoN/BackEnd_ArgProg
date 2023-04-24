package com.portfolio.gna.Repository;

import com.portfolio.gna.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
