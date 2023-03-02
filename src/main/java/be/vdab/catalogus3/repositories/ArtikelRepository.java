package be.vdab.catalogus3.repositories;

import be.vdab.catalogus3.domain.Artikel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtikelRepository extends JpaRepository<Artikel, Long> {
}
