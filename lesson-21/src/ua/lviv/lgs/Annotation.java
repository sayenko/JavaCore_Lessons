package ua.lviv.lgs;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface Annotation {
	String params() default "my annotation";
}
