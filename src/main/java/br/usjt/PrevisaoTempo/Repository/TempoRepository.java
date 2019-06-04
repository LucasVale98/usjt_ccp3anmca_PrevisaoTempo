package br.usjt.PrevisaoTempo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.PrevisaoTempo.Model.Tempo;

public interface TempoRepository extends JpaRepository<Tempo, Long>{

}
