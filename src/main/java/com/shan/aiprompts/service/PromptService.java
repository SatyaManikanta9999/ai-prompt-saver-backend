package com.shan.aiprompts.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.shan.aiprompts.entity.Prompt;
import com.shan.aiprompts.repository.PromptRepository;

@Service
public class PromptService {

    private final PromptRepository repository;

    public PromptService(PromptRepository repository) {
        this.repository = repository;
    }

    public List<Prompt> getAllPrompts() {
        return repository.findAll();
    }

    public Prompt savePrompt(Prompt prompt) {
        return repository.save(prompt);
    }

    public void deletePrompt(Long id) {
        repository.deleteById(id);
    }

    public Prompt updatePrompt(Long id, Prompt updatedPrompt) {
        Prompt existing = repository.findById(id).orElseThrow();

        existing.setText(updatedPrompt.getText());

        return repository.save(existing);
    }
}