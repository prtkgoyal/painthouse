package com.painthouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.painthouse.entity.Painter;

public interface PainterRepository extends JpaRepository<Painter, Long> {

}
