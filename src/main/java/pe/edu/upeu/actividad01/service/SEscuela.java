package pe.edu.upeu.actividad01.service;

import java.util.List;

import pe.edu.upeu.actividad01.model.Escuela;

public interface SEscuela {
	Escuela create(Escuela p);
	List<Escuela> readAll();
	Escuela read(Long id);
	void delete(Long id);
	Escuela update(Escuela p);
}
