package com.painthouse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.painthouse.entity.Painter;
import com.painthouse.repository.PainterRepository;

@Service
public class PainterServiceImpl implements PainterService {

	@Autowired
	private PainterRepository paintrepo;

	@Override
	public void saveOnePainter(Painter p) {
		paintrepo.save(p);
	}
	@Override
	public List<Painter> listAllLeads(){
		List<Painter> paint = paintrepo.findAll();
		return paint;
	}
	@Override
	public void deletePainter(long cid) {
		paintrepo.deleteById(cid);
	}
	@Override
	public Painter getById(long cid) {
		Optional<Painter> findById = paintrepo.findById(cid);
		Painter paint = findById.get();
		return paint;
	}
}
