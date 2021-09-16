package pe.edu.upeu.actividad01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.actividad01.model.Escuela;
import pe.edu.upeu.actividad01.repository.EscuelaRepository;
@Service
public class EscuelaService implements SEscuela{
@Autowired
private EscuelaRepository productoRepository;
	@Override
	public Escuela create(Escuela p) {
		// TODO Auto-generated method stub
		return productoRepository.save(p);
	}

	@Override
	public List<Escuela> readAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

	@Override
	public Escuela read(Long id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(id);
		
	}

	@Override
	public Escuela update(Escuela p) {
		// TODO Auto-generated method stub
		return null;
	}

}
