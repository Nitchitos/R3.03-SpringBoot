package com.basespringboot.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PostRequest {
    @NotBlank(message = "Post title is mandatory")
    @Size(max = 100)
    String post_title;

    @Size(max = 500)
    String post_desc;
}
