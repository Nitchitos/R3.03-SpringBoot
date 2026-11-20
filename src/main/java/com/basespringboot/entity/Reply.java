package com.basespringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter // Getters 
@Setter // Setters
public class Reply {
    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
    private Long reply_id;
    
    @NotBlank // Not Null
    private String reply_content;
}
