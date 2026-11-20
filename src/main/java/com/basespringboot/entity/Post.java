package com.basespringboot.entity;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import jakarta.persistence.CascadeType;

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

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true) 
    private List<Reply> replies = new ArrayList<>();
}
