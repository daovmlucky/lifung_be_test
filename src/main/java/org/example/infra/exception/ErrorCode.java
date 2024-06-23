package org.example.infra.exception;

public enum ErrorCode {

  UNKNOWN_ERROR("001", "Unknown error"),
  MISSING_HEADER("002", "Missing header"),
  INVALID_INPUT_FIELD("003", "Invalid input field %s");

  private final String value;

  private final String message;

  ErrorCode(String value, String message) {
    this.value = value;
    this.message = message;
  }

  public String toUniversalCode() {
    return value;
  }

  public String getMessage() {
    return message;
  }
}