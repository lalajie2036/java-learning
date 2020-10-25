1.判断题(叙述正确的,在括号内打√,否则打X)
(1)子类继承父类的构造方法。                          （×）
(2)子类中想使用被子类隐藏的实例成员变量或实例方法,就需要使用关键字super。（√）
(3）可以用 final 修饰构造方法。              （×）
(4）如果在子类的构造方法中,没有显式地写出super关键字来调用父类的某个构造方法,那么编译器默认地有“super();”调用父类的无参数的构造方法﹔如果父类没有这样的构造方法,代码将出现编译错误。（√）
(5）可以同时用final和 abstract修饰同一个方法。 （×）
(6）子类继承的方法所操作的成员变量一定是被子类继承或隐藏的成员变量。（√）
(7)如果一个类的所有构造方法的访问权限都是 private的,意味着这个类不能有子类,理由是:一个类的private方法不能在其他类中被使用,但子类的构造方法中一定会调用父类的某个构造方法。（√）
(8)子类在方法重写时,不可以把父类的实例方法重写为类(static)方法,也不可以把父类的类(static)方法重写为实例方法。（√）
(9) abstract类中只可以有abstract方法。 （×）
(10）接口中的方法也可以用 private或 protected修饰。 （×）
2．单选题
(1)下列代码中,( D )是正确的。

```java
interface Com{
int MAX;
public void stop();
void start();
abstract void loop();
}
```

A.“void start();”会导致编译出错。
B.“public void stop():”会导致编译出错。
C. “abstract void loop();”会导致编译出错。
D.“int MAX;”会导致编译出错。
(2)下列选项中,( A )代码替换源文件Com.java中的【代码】不会导致编译错误。

```java
public interface Com{
int M =200;
int f();
class InpCom inplenents Com {
【代码】
}
```

A. public int f(){
return 100＋M;
}
B. int f(){
return 100;
}
C. public double f(){
return 2.6;
}
D. public abstract int f();
(3）下列选项中,( B )代码放人程序中标注的【代码】处将导致编译错误。
A. public float getNum(){return 4.0f;}
B. public void getNum(){}
C. public void getNum(double d){}
D. public double getNum(float d){return 4.0d;}

```java
class A{
publie float getNun(){
return 3.0f;
public class B extends A{
【代码】
}
```

(4）下列选项中,( C )是正确的。
A.final类不可以有父类
B.可以用new运算符和abstract类的构造方法创建对象
C.如果一个类中有abstract方法,这个类必须是abstract类
D.static方法也可以同时是abstract方法
(5）假设C是B的子类,B是A的子类,cat是C类的一个对象, bird是B类的一个对象.下列选项中,(  D )是错误的。
A.cat instanceof B的值是true
B.bird instanceof A的值是true
C.cat instanceof A的值是true
D.bird instanceofC的值是true
(6)下列选项中,( A )是正确的。
A.final类不可以有子类
B.abstract类中只可以有abstract方法
C.abstract类中可以有非abstract方法,但该方法不可以用final修饰
D.bird instanceofC的值是true