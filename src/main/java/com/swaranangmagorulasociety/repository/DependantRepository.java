package com.swaranangmagorulasociety.repository;

import com.swaranangmagorulasociety.model.Dependant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependantRepository extends JpaRepository<Dependant, Integer> {

}
