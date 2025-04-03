package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Registros;
import com.example.demo.repository.RegistrosRepository;

@RestController
@RequestMapping("sensores")
public class RegistrosController {
	@Autowired
	RegistrosRepository registrosRepository;
	
	@PostMapping("guardar")
	public String guardar(@RequestBody Registros lectura) {
		lectura.setFecha(LocalDateTime.now());
		registrosRepository.save(lectura);
			return "Lectura guardada exitosamente";
	}
	
	
	@GetMapping("listar")
	public List<Registros> listar() {
		return registrosRepository.findAll();
	}
}
