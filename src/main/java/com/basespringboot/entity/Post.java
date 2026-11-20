package com.basespringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter // Getters 
@Setter // Setters
public class Post {
    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
    @Column(name = "post_id") // Column name 
    private Long post_id;

    @NotBlank // Not null
    @Column(name = "post_title") // Column name 
    private String post_title;

    @Column(name = "post_desc") // Column name 
    private String post_desc;
}
