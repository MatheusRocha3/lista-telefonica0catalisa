package com.listaTelefonica.lista.telefonica.repository;

import com.listaTelefonica.lista.telefonica.model.ContatosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatosRepository extends JpaRepository<ContatosModel, Long> {
}
