package com.basespringboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity 
@Getter // Getters 
@Setter // Setters
public class Reply {
    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
    @Column(name = "reply_id") // Column name
    private Long reply_id;
    

    @NotBlank // Not Null
    @Column(name = "reply_content") // Column name
    private String reply_content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")   // Foreign Key
    private Post post;
}
