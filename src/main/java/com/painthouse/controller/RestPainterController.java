package com.painthouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.painthouse.entity.Painter;
import com.painthouse.repository.PainterRepository;

@RestController
@RequestMapping("/appy/painters")
public class RestPainterController {

	@Autowired
	private PainterRepository paintrepo;
	
	@GetMapping
	public List<Painter> getAllPainters() {
		List<Painter> painters = paintrepo.findAll();
		return painters;
	}
	
	@PostMapping
	public void savePainter(@RequestBody Painter painter) {
		paintrepo.save(painter);
	}
	
	@PutMapping
	public void updatePainter(@RequestBody Painter paint  ) {
		paintrepo.save(paint);
	}
	
}

