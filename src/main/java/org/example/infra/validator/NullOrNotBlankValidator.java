package org.example.infra.validator;



import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Slf4j
@Component
public class NullOrNotBlankValidator implements ConstraintValidator<NullOrNotBlank, String> {

  public static final String STRING_REGEX = "^[A-Za-z0-9_-]+$";

  @Override
  public void initialize(NullOrNotBlank constraintAnnotation) {
    // Do nothing
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    return value == null || value.matches(STRING_REGEX);
  }
}
