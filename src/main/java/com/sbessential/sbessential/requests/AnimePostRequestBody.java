package com.sbessential.sbessential.requests;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

@Data
public class AnimePostRequestBody {
    @NotNull(message = "the anime name cannot be null")
    @NotEmpty(message = "the anime name cannot be empty")
    private String name;
}
