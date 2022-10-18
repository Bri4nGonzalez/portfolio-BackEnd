package com.prototipo.brian.Service;

import com.prototipo.brian.Entity.Persona;
import com.prototipo.brian.Interface.IPersonaService;
import com.prototipo.brian.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }
    
    /*guardar una persona*/
    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }
    
    /*borra persona por su id*/
    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona = ipersonaRepository.findById(id).orElse(null);
       return persona;
    }
    
}
