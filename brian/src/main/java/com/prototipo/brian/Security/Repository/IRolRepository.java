package com.prototipo.brian.Security.Repository;

import com.prototipo.brian.Security.Entity.Rol;
import com.prototipo.brian.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Integer> {
    Optional<Rol> FindByRolNombre(RolNombre rolNombre);
    
}
