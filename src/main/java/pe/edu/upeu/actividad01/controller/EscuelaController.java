package pe.edu.upeu.actividad01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.actividad01.model.Escuela;
import pe.edu.upeu.actividad01.service.EscuelaService;

@RestController
@RequestMapping("/api")
public class EscuelaController {

	@Autowired
	private EscuelaService escuelaService;
	
	@PostMapping("/producto")
	public ResponseEntity<Escuela> save(@RequestBody Escuela esc){
		try {
			Escuela p = escuelaService.create(new Escuela(esc.getIdescuela(), esc.getNombre()));
			return new ResponseEntity<>(p, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("producto/update/{id}")
	public ResponseEntity<Escuela> update2(@RequestBody Escuela esc, @PathVariable("id") long id){
		try {
			Escuela e = escuelaService.read(id);
			if(e.getIdescuela()>0) {
				e.setNombre(esc.getNombre());
				return new ResponseEntity<>(escuelaService.create(e),HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}			

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
