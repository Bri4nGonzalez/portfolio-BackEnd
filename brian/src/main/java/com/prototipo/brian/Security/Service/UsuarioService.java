
package com.prototipo.brian.Security.Service;

import com.prototipo.brian.Security.Entity.Usuario;
import com.prototipo.brian.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
  @Autowired
  IUsuarioRepository iusuarioRepository;
  
  public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
      return iusuarioRepository.findByNombreUsuario(nombreUsuario);
  }
  
  public Boolean existNombreUsuario(String nombreUsuario){
    return iusuarioRepository.existByNombreUsuario(nombreUsuario);
  }
  
  public Boolean existEmail(String email){
      return iusuarioRepository.existByEmail(email);
  }
  
  public void save(Usuario usuario){
      iusuarioRepository.save(usuario);
  }
}



