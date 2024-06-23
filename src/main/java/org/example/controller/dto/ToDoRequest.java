package org.example.controller.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;
import org.example.infra.validator.NullOrNotBlank;
import org.example.infra.validator.VerifyString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@Jacksonized
@JsonIgnoreProperties(ignoreUnknown = true)
public class ToDoRequest {

    @NullOrNotBlank
    @Size(max = 50)
    @VerifyString
    @NotNull
    private String userId;

    @Size(max = 255)
    private String description;

    private boolean completed;
}
