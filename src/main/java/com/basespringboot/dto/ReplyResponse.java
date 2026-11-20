package com.basespringboot.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ReplyResponse {
    @NotBlank
    @Size(max = 500)
    String reply_content;
}
