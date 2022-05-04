package com.crazy.java.ch14注解Annotation.s142JDK的元注解;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
// 定义Testable注解将被javadoc工具提取
@Documented
public @interface Testable {
}
