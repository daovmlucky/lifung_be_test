package org.example.infra.validator;



import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({METHOD, FIELD, PARAMETER, ANNOTATION_TYPE, LOCAL_VARIABLE, TYPE_USE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = NullOrNotBlankValidator.class)
public @interface NullOrNotBlank {

  String message() default "Invalid string format";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}