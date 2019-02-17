package info.sjd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import info.sjd.model.SpringEntity1;
import info.sjd.service.Entity1Service;

@Controller
@RequestMapping( path = "/entity" )
public class Entity1Controller {

	@Autowired
	Entity1Service entity1Service;
	
	@PostMapping
	public ResponseEntity save(SpringEntity1 entity1){
		SpringEntity1 entity = entity1Service.save(entity1);
		if(entity != null) {
			return new ResponseEntity<SpringEntity1>(entity, HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
	public ResponseEntity edit(SpringEntity1 entity1){
		SpringEntity1 entity = entity1Service.edit(entity1);
		if(entity != null) {
			return new ResponseEntity<SpringEntity1>(entity, HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping(path = "/find-one")
	public ResponseEntity findOne(Integer id){
		SpringEntity1 entity = entity1Service.findOne(id);
		if(entity != null) {
			return new ResponseEntity<SpringEntity1>(entity, HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping(path = "/find-by-flag")
	public ResponseEntity findOne(Boolean flag){
		List<SpringEntity1> entities = entity1Service.findAllByBooleanProperty(flag);
		return new ResponseEntity<List>(entities, HttpStatus.OK);
	}
	
	@DeleteMapping
	public ResponseEntity delete(Integer id){
		entity1Service.delete(id);
		return new ResponseEntity(HttpStatus.OK);
	}
}
