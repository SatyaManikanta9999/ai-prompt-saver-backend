package com.shan.aiprompts.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.shan.aiprompts.entity.Prompt;
import com.shan.aiprompts.service.PromptService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/prompts")
@CrossOrigin(origins = "http://localhost:3000")
public class PromptController {

    private final PromptService service;

    public PromptController(PromptService service) {
        this.service = service;
    }

    @GetMapping
    public List<Prompt> getAll() {
        return service.getAllPrompts();
    }

    @PostMapping
    public Prompt create(@Valid @RequestBody Prompt prompt) {
        return service.savePrompt(prompt);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deletePrompt(id);
    }

    @PutMapping("/{id}")
    public Prompt update(@PathVariable Long id, @RequestBody Prompt prompt) {
        return service.updatePrompt(id, prompt);
    }
}