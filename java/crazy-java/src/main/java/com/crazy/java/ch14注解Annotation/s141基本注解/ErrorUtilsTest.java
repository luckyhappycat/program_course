package com.crazy.java.ch14注解Annotation.s141基本注解;
import java.util.*;
public class ErrorUtilsTest {
    public static void main(String[] args) {
        ErrorUtils.faultyMethod(Arrays.asList("Hello!"),
                Arrays.asList("World!"));        // ①
    }
}