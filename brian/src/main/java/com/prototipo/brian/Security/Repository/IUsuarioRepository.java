package com.prototipo.brian.Security.Repository;

import com.prototipo.brian.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{
   Optional<Usuario> findByNombreUsuario(String nombreUsuario);
   
   //preguntamos si existen usario y email y nos retornara un valor true o false
   Boolean existByNombreUsuario(String nombreUsuario);
   Boolean existByEmail(String email);
}
