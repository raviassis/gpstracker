package com.gpstracker.gpstracker.repository;

import com.gpstracker.gpstracker.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository  extends JpaRepository<Position, Long> {
}
