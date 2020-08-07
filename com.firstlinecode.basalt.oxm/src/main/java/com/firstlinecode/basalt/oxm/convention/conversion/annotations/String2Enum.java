package com.firstlinecode.basalt.oxm.convention.conversion.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.firstlinecode.basalt.oxm.convention.conversion.ConverterFactory;
import com.firstlinecode.basalt.oxm.convention.conversion.factories.String2EnumConverterFactory;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@ConverterFactory(String2EnumConverterFactory.class)
public @interface String2Enum {
	Class<?> value();
	boolean upperCaseString() default true;
	boolean dashToUnderline() default true;
}
