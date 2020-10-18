## 课后 p121 java练习代码
1．判断题(叙述正确的﹐在括号内打√，否则打×）
(1）类是最重要的"数据类型”，类声明的变量被称为对象变量﹐简称对象。         (√)
(2）构造方法没有类型。                                                                                       (√)
(3）类中的实例变量在用该类创建对象的时候才会被分配内存空间。                   (√)
(4）类中的实例方法可以用类名直接调用。                                                         （×）
(5）局部变量没有默认值。                                                                                     (√)
(6）构造方法的访问权限可以是 public ,protected ,private或友好的。.                   (√)
(7）方法中声明的局部变量不可以用访问修饰符public , proteced , private修饰。  (√)
(8） this可以出现在实例方法和构造方法中。                                                         (√)
(9）成员变量的名字不可以和局部变量的相同。                                                   （×）
(10) static方法不可以重载.                                                                                    （×）
2．单选题
(1)对于下列 Dog类,（ D）是错误的。
	A.Dog(int m)与 DogCdouble m)互为重载的构造方法。
	B.int Dog(int m) void Dog(double m）互为重载的非构造方。
	C.Dog类只有两个构造方法﹐而且没有无参数的构造方法。
	D.Dog类有3个构遣方法。

```java
class Dog {
	Dog( int m){
    }
Dog( double m){
	int Dog( int m){
		return 23;
	}
	void Dog( double m){
	}
}
```

(2）当用new运算符和构毒方法创建对象时,(A )是正确的。
	A.①为成员变量分配内存.并指定默认值。
   	②初始化成员变量，即用户声明成员变量时给定的歌认值。
		③执行构造方法。
		④计算出一个引用值。
	B.①计算出一个引用值。
		②为成员变量分配内存，并指定默认值。
		③初始化成员变量，即用户声明成员变量时给定的默认值。
		④执行构造方法。
	C.①执行构造方祛。
		②为成员变量分配内存，并指定默认值.
		③初始化成员变量,即用户声明成员变量时给定的默认值。
		④计算出一个引用值。
	D.①为成员变量分配内存，并指定默认值。
		②初始化成员变量，即用户声明虚员变量时给定的默认值。
		③计算出一个引用值。
		④执行构造方法。
(3）对于下列Tom类.(C )是正确的。
	A.程序运行时输出rok.
	B.没有构造方法。
	C.有编译错误,因为创建对象cat使用的不是构造方怯.java编评器已能不提供默认的构造方法了.
	D.程序运行时无任何输出.

```java
public class Teat{
publie static void main(String args){
	Tom cat = new Tomt();
	}
}
class Tom {
	void Tom(){
		System.out.println("ok");
	}
	Tom(int m〕{
		System.out.println("你好");
	}
}
```

(4)下对叙述正确的是(A ).
	A.成员变量有默认值。
	B.this可以出现在static方法中。
	C.类中的实例方法可以用类名调用。
	D.局部变量也可以访问修饰符public,proteced,private修饰.
(5)下列叙述正确的是(C )
	A.源文件可以有两条包语句(package)。
	B.源文件不可以有多条import语。
	C.如果源文件有package语句,该语句也可以是源文件的第2条语句。
	D.类中的类方法(static方法)只能操作类变量(static变量),不可以操作实例变量。
3.挑错题(ABCD注释标注的哪行代码有错误）

（1）

```java
public class people{
	int m = 10,n;        //A
    n = 200;             //B
    void f(){
        if(m == n){
            n = + m;     //C 
        else
            n = n - m;   //D
        }
    }
}      //错误的是：B
```

（2）

```java
class E{
    int x;
    public void f(int n){
        int m;                //A
        int t = x + n;        //B
        int y = x + m;        //C
        m = 10;
        y = x + m;            //D
    }
}      //错误的是：B
```

(3)

```java
class Tom{
    int x;
    static int y;
    void showXY(){
        System.out.printf(" %d, %d\n", x, y);
    }
    static void showY(){
        System.out.printf("%d\n",y);
    }
}
public class E{
    public static void main(String[] args) {
        Tom.y = 100;                             //A
        Tom cat = new Tom();
        cat.x = 100;
        cat.y = 200;                             //B
        Tom.x = 300;                             //C
        cat.showXY();
        Tom.showY();                             //D
    }
}      //错误的是：B
```

4.阅读程序题（给出【代码】注释标注的代码的输出结果）

(1)

```java
class Lake{
    Fish fish;
    void setFish(Fish s){
        fish = s;
    }
    void foodFish(int m){
        fish.weight = fish.weight + m;
    }
    Fish getFish() {
        fish.weight -= 10;
    }
}
public class E {
    public static void main(String[] args) {
        Fish redFish = new Fish();
        Lake lake = new Lake();
        lake.setFish(redFish);
        lake.foodFish(120);
        int w = lake.fish.weight;
        Fish fishOk = lake.getFish();
        System.out.printf("%d:%d:%d", w, lake.fish.weight, fishOk.weight);
    }
}    //结果： 121 111 111
```

(2)

```java
class B{
    int x = 100, y =200;
    public  void  setX(int x){
        x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getXYSum() {
        return x + y;
    }
}
public class E {
    public static void main(String[] args) {
        B b = new B();
        b.setX(-100);
        b.setY(88);
        System.out.printf("%d:%d:%d", b.x, b.y, b.getXYSum());
    }
}       //结果：100 88 188
```

(3)

```java
class Tom{
    static  int sum;
    int getSum(int ... item){
        for (int n:item){
            sum += n;
        }
        return sum;
    }
}
public class E {
    public static void main(String[] args) {
        Tom cat1 = new Tom();
        Tom cat2 = new Tom();
        int resultOne = cat1.getSum(1,2,3,4);
        int resultTwo = cat2.getSum(10,30);
        System.out.printf("%d:%d", resultOne, resultTwo);
    }
}     //结果： 10 50
```

(4)

```java
class Circle{
    int radius = 1;
    void setRadius(int radius){
        if (radius > 0)
            this.radius = radius;
    }
}
class Geometry{
    Circle c;
    void setCircle(Circle c){
        c.radius += 10;
        this.c = c;
    }
}
public class E {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        Geometry geometry = new Geometry();
        geometry.setCircle(circle);
        Circle circleTwo = new Circle();
        geometry.setCircle(circleTwo);
        System.out.printf("%d%d",circle.radius,geometry.c.radius);
    }
}    //结果： 20 11
```

5.编程题

（1）类的字节码进入内存时，类中的静态块会被立刻被执行。实习下列程序，了解静态块。

```java
class AAA{
    static int m;
    static {
        m = 888;
    }
}
public class E {
    public static void main(String[] args) {
        AAA a = null;
        System.out.printf("%d:%d",AAA.m,a.m);
    }
}
```

(2)用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC、CPU、HardDisk和Test。其中，Test是主类。CPU类有int型 speed成员变量,提供getSpeed()方法返回speed 的值：setSpeedCint m)方法设置speed的值。HardDisk类有int型amount成员变量,提供get.AmountO)方法返回amount的值， setAmount(int m)方法设置amount的值。PC类组合CPU 和HardDisk类的对象，即PC类有CPU类型的成员变量cpu和HardDisk类型的成员变量HD。PC类提供setCUP(CPU c)方法和setHardDisk（HardDisk h)方法。对主类Test的要求:
①在main方法中创建一个CPU对象cpu.cpu将自己的speed设置为2200。
②在main方法中创建一个HardDisk对象disk ,disk将自己的amount设置为200。
③在main方法中创建一个PC对象 pc。
④pc调用setCUP(CPUc)方法,调用时实参是cpu。
⑤pc调用setHardDisk(HardDisk h)方法，调用时实参是disk。
⑥pc调用show()方祛。可以输出 CPU 的速度和HD的容量。

CPU.java

```java
public class CPU {
   int speed;  
   int getSpeed() {
      return speed;
   }
   public void setSpeed(int speed) {
      this.speed = speed; 
   }
}
```

HardDisk.java

```java
public class HardDisk {
   int amount;  
   int getAmount() {
      return amount;
   }
   public void setAmount(int amount) {
      this.amount = amount; 
   }
} 
```

PC.java

```java
public class PC { 
    CPU cpu;
    HardDisk HD;
    void setCPU(CPU cpu) {
        this.cpu = cpu;
    } 
     void setHardDisk(HardDisk HD) {
        this.HD = HD;
    } 
    void show(){
       System.out.println("CPU速度:"+cpu.getSpeed());
       System.out.println("硬盘容量:"+HD.getAmount());
    }
} 
```

Test.java

```java
public class Test {
   public static void main(String args[]) {
       CPU cpu = new CPU();
       HardDisk HD=new HardDisk();
       cpu.setSpeed(2200);
       HD.setAmount(200);
       PC pc = new PC();
       pc.setCPU(cpu);
       pc.setHardDisk(HD);
       pc.show();
    }
}

```