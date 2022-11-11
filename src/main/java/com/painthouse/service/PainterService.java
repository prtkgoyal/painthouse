package com.painthouse.service;

import java.util.List;

import com.painthouse.entity.Painter;

public interface PainterService {

	public void saveOnePainter(Painter p) ;

	public List<Painter> listAllLeads();
	
	public void deletePainter(long cid);
	
	public Painter getById(long cid);
	}
