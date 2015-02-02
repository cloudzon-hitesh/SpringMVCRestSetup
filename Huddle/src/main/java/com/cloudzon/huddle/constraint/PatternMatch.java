package com.cloudzon.huddle.constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.cloudzon.huddle.constraint.impl.PatternMatchImpl;

@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PatternMatchImpl.class)
public @interface PatternMatch {

	String message() default "";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String pattern();

	boolean isRequire();

	String emptyString() default "";

	String wrongPattern();
}
