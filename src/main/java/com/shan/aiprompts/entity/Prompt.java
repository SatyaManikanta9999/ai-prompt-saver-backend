package com.shan.aiprompts.entity;
import jakarta.validation.constraints.NotBlank;

import jakarta.persistence.*;

@Entity
public class Prompt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Prompt text cannot be empty")
    private String text;

    public Prompt() {}

    public Prompt(String text) {
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}