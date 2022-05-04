package com.crazy.java.ch14注解Annotation.编译时处理注解144;
import java.lang.annotation.*;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface Property {
    String column();
    String type();
}