package com.basespringboot.dto;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;

public class ReplyRequest {
    @NotBlank
    @Size(max = 500)
    String reply_content;
}
