package com.example.demorest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demorest.model.Tarefa;

// Interface responsável por acesso a dados (CRUD automático com Spring Data JPA)
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // Aqui você pode definir métodos personalizados, se quiser, como:
    // List<Tarefa> findByResponsavel(String responsavel);
}
