package com.basespringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
public class Reply {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reply_id;
    
    @NotBlank 
    private String reply_content;
}
