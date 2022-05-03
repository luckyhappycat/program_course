# 面向对象

## 类和对象

类的修饰符：public, final, abstract。static成员不能访问非static成员。

成员变量的修饰符：public, protected, private, static, final。

方法的修饰符：public, protected, private, static, final, abstract。

static成员表示它属于类，而不是属于类的对象。因此通常把static成员变量和static方法称为类变量、类方法，或者称为静态变量和静态方法。

非static成员称为非静态变量和非静态方法。

静态成员不能直接访问非静态成员。

### 对象、引用和指针

类是引用数据类型。

```java
Person p = new Person();
```

**p是一个引用，存放在栈内存中，真正的Person对象存放在堆内存中。**

引用变量p只存储了一个地址值，用来指向实际的Person对象。

如果没有任何变量指向堆内存中的对象，那么该对象就变成了垃圾，Java的垃圾回收机制将回收该对象。

如果希望主动回收某个对象，只需要令该引用变量为null。

### 对象的this引用

this总是指向调用该方法的对象。

可以出现在成员方法和构造方法中。

- 在成员方法中，表示引用调用该方法的对象。
- 在构造方法中，表示引用该构造方法正在初始化的对象。

大部分情况下，在成员方法中访问该类的其他方法、成员变量可以不加this，效果是一样的。

```java
public class ThisInMethod {
    public void jump() {
        System.out.println("jump");
    }
    public void run() {
        this.jump();
        System.out.println("run");
    }
}

public class Main {
    public static void main(String[] args) {
        // 错误
        // run();
        // 正确
        ThisInMethod d = new ThisInMethod();
        d.run();
    }
}
```

```java
public class ThisInConstructor {
    public int foo;
    public ThisInConstructor() {
        int foo = 0;
        this.foo = 1;
    }
    public static void main(String[] args) {
        System.out.println(new ThisInConstructor().foo);
    }
}
```

**在static方法中，可以使用类来直接调用该方法。而不能用this来调用，因为static方法不属于对象。**因此Java语法规定：静态成员不能直接访问非静态成员。

**如果希望在静态方法中访问另一个普通方法，只能new一个对象。**

```java
public class StaticAccessNoStatic {
    public void info() {
        System.out.println("info");
    }
    public static void main(String[] args) {
        // 错误
        //info();
        // 正确
        new StaticAccessNoStatic().info();
        // or
        StaticAccessNoStatic m = new StaticAccessNoStatic();
        m.info();
    }
}
```

## 方法

### static方法和非static方法

static方法属于类，调用的时候可以通过类来调用，也可以通过对象来调用（底层依然使用类来调用）。

非static方法属于对象，调用的时候只能通过对象来调用。

### 方法的参数传递

Java里方法的参数传递只有一种：值传递。

Java对于引用类型的参数传递，同样是采用值传递。



