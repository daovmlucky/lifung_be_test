package org.example.controller.dto;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Data
@Builder
@Jacksonized
public class ErrorResponse {
  private List<ErrorResponseEntry> errors;
}
