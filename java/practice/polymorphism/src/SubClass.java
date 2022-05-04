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
