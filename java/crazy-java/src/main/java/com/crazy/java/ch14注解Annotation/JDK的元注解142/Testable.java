package com.crazy.java.ch14注解Annotation.JDK的元注解142;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
// 定义Testable注解将被javadoc工具提取
@Documented
public @interface Testable {
}
