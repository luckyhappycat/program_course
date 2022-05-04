package com.crazy.java.ch14注解Annotation.JDK的元注解142;
import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Inheritable {
}