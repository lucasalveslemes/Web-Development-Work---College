package com.example.demorest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demorest.model.Tarefa;
import com.example.demorest.repository.TarefaRepository;

@RestController
@RequestMapping("/tarefas")
@CrossOrigin(origins = "*") // permite chamadas de qualquer origem (útil pra testes com frontend)
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    // GET todas as tarefas
    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    // GET tarefa por ID
    @GetMapping("/{id}")
    public Optional<Tarefa> buscarPorId(@PathVariable Long id) {
        return tarefaRepository.findById(id);
    }

    // POST nova tarefa
    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    // PUT (atualizar) tarefa
    @PutMapping("/{id}")
    public Tarefa atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefaAtualizada) {
        return tarefaRepository.findById(id).map(tarefa -> {
            tarefa.setTitulo(tarefaAtualizada.getTitulo());
            tarefa.setResponsavel(tarefaAtualizada.getResponsavel());
            tarefa.setDataEntrega(tarefaAtualizada.getDataEntrega());
            return tarefaRepository.save(tarefa);
        }).orElseGet(() -> {
            tarefaAtualizada.setId(id);
            return tarefaRepository.save(tarefaAtualizada);
        });
    }

    // DELETE tarefa
    @DeleteMapping("/{id}")
    public void deletarTarefa(@PathVariable Long id) {
        tarefaRepository.deleteById(id);
    }
}
