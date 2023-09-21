package com.sbessential.sbessential.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AnimePostRequestBody {
    @NotEmpty(message = "the anime name cannot be empty")
    @Schema(description = "this is the anime's name", example = "Tensei Shittara Slime Datta Ken", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;
}
