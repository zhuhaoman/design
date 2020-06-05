package com.zhuhaoman.strategy.factory.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.ANNOTATION_TYPE,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface SortAlg {
    String name() default "";
}
