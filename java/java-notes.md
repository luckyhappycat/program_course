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

### 可变长度的形参

和其他语言一样，可变形参只能位于形参列表的最后。

```java
public class VarArgs {
    public static void test(int a, String... books) {
        for (var tmp : books) {
            System.out.println(tmp);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        test(1, "hello", "world");
    }
}
```

### 递归

略。

### 方法重载

一个类中包含两个或两个以上的方法，方法名相同，但形参列表不同。

注意：返回值类型不能用于区分重载的方法。

可变长度的形参也支持重载，但是不建议这么做。

### 成员变量和局部变量

所有变量：

- 成员变量
  - 实例变量（非static）
  - 类变量（static）
- 局部变量
  - 形参
  - 方法局部变量（在方法内定义）
  - 代码块局部变量（在代码块定义）

#### 成员变量的初始化和内存中的运行机制

```java
class Person {
    public String name;
    public static int eyeNum;
}
public class PersonTest {
    public static void main(String[] args) {
        //初始化后，eyeNum=0
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "张三";
        p2.name = "孙悟空";
        p1.eyeNum = 2;
        p2.eyeNum = 3;
    }
}
```

第一次使用Person类时加载并初始化Person类，此时堆内存中eyeNum=0。

Person p1 = new Person(); 将Person对象赋值给p1，并为name实例变量分配内存，给定初始值null。

#### 局部变量的初始化和内存中的运行机制

用完就回收。

## 封装和隐藏

封装指的是将对象的状态信息隐藏在对象内部，不允许外部程序直接访问对象内部的信息，而是通过该类所提供的方法来实现对内部信息的操作和访问。

封装是为了把该隐藏的隐藏，把该暴露的暴露。

### 访问控制符

访问控制符的级别：

```
private < default < protected < public
```

- private（**当前类访问权限**）：如果类里的一个成员（包括成员变量、方法和构造器等）使用private访问控制符来修饰，则这个成员只能在当前类的内部被访问。很显然，这个访问控制符用于修饰成员变量最合适，使用它来修饰成员变量就可以把成员变量隐藏在该类的内部。
- default（**包访问权限**）：如果类里的一个成员（包括成员变量、方法和构造器等）或者一个外部类不使用任何访问控制符修饰，就称它是包访问权限的，default访问控制的成员或外部类可以被相同包下的其他类访问。
-  protected（**子类访问权限**）：如果一个成员（包括成员变量、方法和构造器等）使用protected访问控制符修饰，那么这个成员既可以被同一个包中的其他类访问，也可以被不同包中的子类访问。在通常情况下，如果使用protected来修饰一个方法，通常是希望其子类来重写这个方法。
- public（**公共访问权限**）：这是一个最宽松的访问控制级别，如果一个成员（包括成员变量、方法和构造器等）或者一个外部类使用public访问控制符修饰，那么这个成员或外部类就可以被所有类访问，不管访问类和被访问类是否处于同一个包中，是否具有父子继承关系。

访问控制级别表：

|            | private | default | protected | public |
| ---------- | ------- | ------- | --------- | ------ |
| 同一个类中 | √       | √       | √         | √      |
| 同一个包中 |         | √       | √         | √      |
| 子类中     |         |         | √         | √      |
| 全局范围内 |         |         |           | √      |

如果一个Java源文件里定义的所有类都没有使用public修饰，则这个Java源文件的文件名可以是一切合法的文件名；但如果一个Java源文件里定义了一个public修饰的类，则这个源文件的文件名必须与public修饰的类的类名相同。

一个类通常是一个小模块，模块设计应当追求高内聚（尽可能把模块的内部数据、功能实现细节隐藏在模块内部独立完成，不允许外部直接干预）、低耦合（仅暴露少量的方法给外部使用）

关于访问控制符的使用，存在如下几条基本原则。

- 类里的绝大部分成员变量都应该使用private修饰，只有一些static修饰的、类似全局变量的成员变量，才可能考虑使用public修饰。除此之外，有些方法只用于辅助实现该类的其他方法，这些方法被称为工具方法，工具方法也应该使用private修饰。
- 如果某个类主要用做其他类的父类，该类里包含的大部分方法可能仅希望被其子类重写，而不想被外界直接调用，则应该使用protected修饰这些方法。
- 希望暴露出来给其他类自由调用的方法应该使用public修饰。因此，类的构造器通过使用public修饰，从而允许在其他地方创建该类的实例。因为外部类通常都希望被其他类自由使用，所以大部分外部类都使用public修饰。

### package, import和import static

package：包

import：导包（导入类），可以省略写包名

import static：导包（导入指定类的某个静态成员变量、方法或全部的静态成员变量、方法），可以连类名都省略

## 构造方法

如果不写构造方法，系统会自动创建一个空的构造方法。

如果写了构造方法，系统则不会自动创建构造方法。

构造方法可以重载。

```java
public class Constructor {
    public String name;
    public int size;

    public Constructor(String name) {
        this.name = name;
    }

    public Constructor(String name, int size) {
        this(name);
        this.size = size;
    }
}
```

## 继承

### 继承的特点

继承通过extends关键字实现。

子类不能获得父类的构造函数。

Java中没有多继承。

Java中只能有一个直接父类，可以有无限多个间接父类。

java.lang.Object类时所有类的父类。

```java
public class Fruit {
    public double weight;

    public void info() {
        System.out.println("Fruit, weight: " + weight);
    }
}

public class Apple extends Fruit {
    public static void main(String[] args) {
        var a = new Apple();
        a.weight = 56;
        a.info();
    }
}
```

### 重写父类方法

```java
public class Fruit {
    public double weight;

    public void info() {
        System.out.println("Fruit, weight: " + weight);
    }
}

public class AppleOverride extends Fruit {
    public void info() {
        System.out.println("Apple, weight: " + weight);
    }

    public static void main(String[] args) {
        var a = new AppleOverride();
        a.weight = 56;
        a.info();
    }
}
```

方法的重写要遵循“两同两小一大”规则:

- “两同”即方法名相同、形参列表相同；
- “两小”指的是子类方法返回值类型应比父类方法返回值类型更小或相等，子类方法声明抛出的异常类应比父类方法声明抛出的异常类更小或相等；
- “一大”指的是子类方法的访问权限应比父类方法的访问权限更大或相等。

覆盖方法和被覆盖方法要么都是类方法，要么都是实例方法，不能一个是类方法，一个是实例方法。

子类无法重写父类的private方法，因为访问不到。

重载是overload，重写是overwrite。

重载发生在一个类中的同名方法，重写发生在父类和子类的同名方法。

子类中也可以重载父类的方法。

### super限定

如果需要在子类中调用父类中被重写的实例方法，可以使用super限定。

super不能出现在子类的static方法中。（static方法属于类，该方法的调用者可能是一个类，而不是对象，因而super限定也就失去了意义。）

### 调用父类的构造方法

子类不会获得父类的构造方法，但是子类可以调用父类的构造方法。

在同一个类中，一个构造方法调用另一个重载的构造方法通过this完成。

在父类和子类中，子类构造方法调用父类的构造方法通过super完成。使用super调用父类的构造方法必须在子类构造方法的第一行。

不管子类构造方法中是否显式使用super调用，子类构造方法都会调用父类的构造方法。

如果C继承自B，B继承自A，那么初始化C时，先初始化A，再初始化B，再初始化C。

## 多态

### 多态性

Java引用变量有两个类型：一个是编译时类型，一个是运行时类型。

编译时类型由声明该变量时使用的类型决定，运行时类型由实际赋给该变量的对象决定。

如果编译时类型和运行时类型不一致，就可能出现多态（Polymorphism）。

实例方法有多态性，实例变量没有多态性。

```java
class BaseClass {
    public int book = 6;

    public void base() {
        System.out.println("BaseClass::base()");
    }

    public void test() {
        System.out.println("BaseClass::test()");
    }
}

public class SubClass extends BaseClass {
    // 隐藏父类的book
    public String book = "SubClass book";

    // 重写父类的test
    public void test() {
        System.out.println("SubClass::test()");
    }

    public void sub() {
        System.out.println("SubClass::sub()");
    }

    public static void main(String[] args) {
        //父类
        BaseClass bc = new BaseClass();
        System.out.println(bc.book); // 6
        bc.base();
        bc.test();
        //子类
        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.base(); // 调用父类方法
        sc.test(); // 调用子类重写的方法

        // 多态，编译时类型和运行时类型不一样
        BaseClass ploymophicBc = new SubClass();
        System.out.println(ploymophicBc.book); // 父类的book
        ploymophicBc.base(); // 父类的base()
        ploymophicBc.test(); // 子类的test()
        // 因为ploymophicBc的编译类型是BaseClass，
        // BaseClass类没有提供sub方法,所以下面代码编译时会出现错误。
        // ploymophicBc.sub();
        // 编译器推断v1是SubClass类型
        var v1 = new SubClass();
        // 由于ploymophicBc的编译时类型是BaseClass
        // 因此编译器推断v2是BaseClass类型
        var v2 = ploymophicBc;
        // 由于BaseClass类没有提供sub方法,所以下面代码编译时会出现错误。
        // v2.sub();
    }
}
```

引用变量在编译阶段只能调用其编译时类型所具有的方法，但运行时则执行它运行时类型所具有的方法。

通过引用变量访问其包含的实例变量时，访问的是编译时定义的成员变量，而不是运行时定义的成员变量。

### 引用变量的强制类型转换

