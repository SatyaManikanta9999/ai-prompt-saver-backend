package com.shan.aiprompts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shan.aiprompts.entity.Prompt;

public interface PromptRepository extends JpaRepository<Prompt, Long> {
}