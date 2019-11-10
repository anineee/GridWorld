# GridWorld 阶段一学习报告

## vi/vim 编辑器

### 简介

vi 编辑器是所有 Unix 及 Linux 系统下标准的编辑器， vim 编辑器是 vi 的升级版，增加了一些功能，同时完全兼容 vi 命令。

在命令行下通过 `vi 文件名` 或 `vim 文件名` 指令打开 vi/vim 编辑器。

### vi/vim 编辑器的三种模式

(1) 一般模式

打开 vi/vim 编辑器后的默认模式。

在一般模式中可以进行删除、复制、粘贴，但是无法编辑文件内容。

(2) 编辑模式

在一般模式下输入` i | I | o | O | a | A | r | R` 切换到编辑模式。

在编辑模式中可以编辑文件内容。

按 `Esc` 键返回一般模式。

(3) 命令行模式

在一般模式下输入`: | / | ?` 切换到命令行模式。

在命令行模式下可以进行查找数据、读取、保存、大量替换字符、离开编辑器、显示行号等操作。

按 `Esc` 键返回一般模式。

### vi/vim 编辑器的常用命令

(1) 移动光标

`[Ctrl]+[f]` ：屏幕向下移动一页。

`[Ctrl]+[b]` ：屏幕向上移动一页。

`0` ：移动到本行第一个字符处。

`$` ：移动到本行最后一个字符处。

`G` ：移动到此文件最后一行。

`gg | 1G` ：移动到此文件第一行。

`N+[Enter]` ：N 为数字，光标向下移动 N 行。

(2) 查找与替换

`/word` ：向下寻找一个名称为 word 的字符串。

`?word` ：向上寻找一个名称为 word 的字符串。

`:n1,n2s/word1/word2/g` ：在第 n1 行和 n2 行之间寻找 word1 这个字符串，并且将其替换为 word2。

`:1,$s/word1/word2/g` ：从第一行到最后一行寻找 word1 这个字符串，并且将其替换为 word2。

`:1,$s/word1/word2/gc` ：从第一行到最后一行寻找 word1 这个字符串，并且将其替换为 word2。且在替换前显示提示字符给用户确认是否需要替换。

(3) 删除、复制和粘贴：

`x,X` ：在一行字中，`x` 为向后删除一个字符（相当于 `[Del]` 键），`X` 为向前删除一个字符（相当于 `[Backspace]` 键）。

`dd` ：删除光标所在的一整行。

`ndd` ：删除光标所在的向下n行。

`yy` ：复制光标所在的一行。

`nyy` ：复制光标所在的向下n行。

`p,P` ：`p` 为将已复制的内容在光标的下一行粘贴，`P` 则为粘贴在光标的上一行。

`u` ：复原前一个操作。

`[Ctrl]+r` ：重做上一个操作。

`.` ：小数点，重复前一个操作。

(4) 编辑模式

`i,I` ：进入插入模式，`i` 为从目前光标所在处插入。`I` 为在目前所在行的第一个非空格字符处开始插入。

`a,A` ：进入插入模式。`a` 为从目前光标所在处的下一个字符处开始插入。`A` 为从所在行的最后一个字符处开始插入。

`o,O` ：进入插入模式。`o` 为在下一行插入。`O` 为在上一行插入。

`r,R` ：进入替换模式。`r` 只替换光标所在那个字符一次。`R` 会一直替换光标所在字符，直到按下 `Esc` 键。

(5) 保存和退出

`:w` ：将编辑的数据写入到硬盘中。

`:q` ：离开vi。后面加 `!` 为强制离开。

`:wq` ：保存后离开。`:wq!` 为强制保存后离开。



## JAVA 语言

### 简介

java是一门面向对象编程语言，吸收了C/C++的优点，摒弃了C/C++复杂的指针等内容，也不需要用户手动释放内存空间。java本身还具备了很强的可移植性，通过将源代码编译成二进制字节码，然后通过不同平台的java虚拟机来解释执行字节码，从而实行了“一次编译，到处执行”的跨平台特性。

 Java的应用领域非常广泛。可以做应用系统、互联网网站、以及移动端的安卓等。 

### JAVA 语法重难点

(1) 显式初始化

声明数据成员同时，提供数据成员的初始值。

(2) 方法重载

 Java 会同时根据方法名和参数列表来决定所要调用的方法，即可以存在方法名相同、参数列表不同的两个或多个方法。

(3) 接口

在interface中，我们 

-  不需要定义方法的主体 
-  方法默认为public 

形如：

```java
implements interface1, interface2, ...
```

(4) 继承

代码复用的一种方式，区别于 C++ ，Java 的每个衍生类只能有一个基类。形如：

```java
class derived_class extends base_class
```

用`super`关键字来指代基类对象，使用`super.member`的方式来表示基层的(public)成员。

由于在创建衍生对象的时候，基类对象先被创建和初始化，所以，基类的构造方法应该先被调用。我们可以使用`super(argument list)`的语句，来调用基类的构造方法。 

(5) 方法覆盖

如果方法名和参数列表都相同 ，Java会呈现衍生层的方法，而不是基层的方法。

(6) 类数据/类方法

利用`static`关键字，来声明类数据成员，表示类的所有对象共享的成员

 如果一个方法声明为`static`，那么它只能调用`static`的数据和方法，而不能调用非`static`的数据和方法。 事实上，在static方法中，将没有隐式传递的this和super参数。我们无从引用属于对象的数据和方法 .

 调用类方法时，我们可以通过`class.method()`的方式调用，也可以通过`object.method()`的方式调用。 

 对象方法可以访问类数据。

(7) `final` 关键字

` final`关键字的基本含义是: 这个数据/方法/类不能被改变了。 

-  `final`基本类型的数据: 定值 (constant value)，只能赋值一次，不能再被修改。 
-  `final`方法: 该方法不能被覆盖。`private`的方法默认为`final`的方法。 
-  `final`类: 该类不能被继承。 

(8) 多重继承

 在Java类的继承中，一个衍生类只能有一个基类，然而，interface可以同时继承多于一个interface。

(9) 抽象类

 Java中提供了抽象类(abstract class)的语法，用于说明类及其方法的抽象性。  一个abstract类不能用于创建对象。形如：

```java
abstrct class classname
```

(10) 引用

当我们将一个引用赋值给另一个引用时，我们实际上复制的是对象的地址。两个引用将指向同一对象。 

(11) 参数传递

 Java的参数传递为值传递。也就是说，当我们传递一个参数时，方法将获得该参数的一个拷贝。引用的值传递，意味着对象的地址被复制，并传递给Java方法。Java方法根据该引用的访问将会影响对象。 

(12) 类型转换

从一个高精度类型转换到低精度类型，比如从float转换到int，那么我们有可能会损失信息。这样的转换叫做收缩变换(narrowing conversion)。这种情况下，我们需要显示的声明类型转换 。

 如果我们从低精度类型转换成高精度类型，则不存在信息损失的顾虑。这样的变换叫做宽松变换(widening conversion)。我们不需要显示的要求类型转换，Java可以自动进行 。

 我们可以将一个衍生类引用转换为其基类引用，这叫做向上转换(upcast)或者宽松转换。  即使我们经过upcast，将引用的类型宽松为其基类，Java依然能正确的识别对象本身的类型，并调用正确的方法。Java可以根据当前状况，识别对象的真实类型，这叫做多态(polymorphism)。 

(13) `Object` 类

 Java中，所有的类实际上都有一个共同的继承祖先，即`Object`类。`Object`类提供了一些方法，比如`toString()`。我们可以在自己的类定义中覆盖这些方法。 

(14) GUI

图形树 `JFrame` -> `Content Pane` -> `JButton`。

` Content Pane`的`setLayout()`方法决定了元素的布局(layout)方式。布局决定了元素的位置。 

 除了按钮之外，我们还可以在GUI中增加更多的元素，这些元素大都是`JComponent`的衍生类。 



## Ant 环境

### 简介

Ant 是 JAVA 的生成工具，是 Apache 的核心项目。

Ant 类似于与 Unix 中的 Make 工具，都是用来编译、生成。

### 配置 Ant 环境

(1) 配置好 JAVA 环境；

(2) 新建环境变量 `ANT_HOME` ，值为 Ant 的主目录；

(3) 在 `path` 中配置 `%ANT_HOME%/bin` ；

(4) 配置完成后，在命令行输入 `ant`。若出现 “ Buildfile: build.xml does not exist! Build failed ”时说明配置完成。

### Ant 生成文件

Ant 的默认生成文件为 `build.xml`，可以通过 `ant -f a.xml` 指定生成文件为 `a.xml` 。

Ant 的生成文件是 xml 文件，整体结构为：

```xml
<?xml version="1.0" encoding="GBK"?>  
<project default="targetname">  
    <target name="name">  
    </target>  
</project>
```

(1) `<project>` 元素

Ant 生成文件的根元素，形如：

```xml
<project default="targetname" [basedir="."][name="projectname"]>
</project>
```

`default` 是默认执行的 target 名；

`basedir` 是指定基准目录；

`name` 是工程名。

(2) `<target>` 元素

`<project>` 元素的子元素，在`<project>` 元素下可以有多个 `<target>`，形如：

```xml
<target name="projectname" [depends=""] [if="prop1"] [unless="prop2"]>
</target>
```

`name` 表示 target 名称；

`depends` 为依赖 target 名称(可以有多个依赖，以逗号分割)。只有在依赖 target 完成后，才能做该 target；

`if` 值为一个属性名，只有设置了该属性，才能执行该 target；

`unless` 值为一个属性名，只有没有设置该属性，才能执行该 target。

(3) `<property>` 元素

`<project>` 元素的子元素，用于定义属性，形如：

```xml
<property name="pname" value="pvalue"/>
```

通过 `${pname}` 使用此 `<property>` 元素。

通过属性文件 `a.properties` 导入属性，如下：

```xml
<property file="a.properties"/>
```

(4) Task

`<target>` 元素的子元素，以下介绍一些常用的核心 Task。

a. `<echo>`

用于输出，形如：

```xml
<echo>string</echo>
```

b.`<javac>`

用于编译 java 文件，形如：

```xml
<javac srcdir="src" destdir="class" [classpath=" "]/>
```

`srcdir` 表示编译此文件夹下全部 java 文件；

`destdir` 表示编译后的 class 文件存储路径；

`classpath` 指定第三方类库。

c. `<java>`

运行 java 类，形如：

```xml
<java classname="" fork="yes">
	[<arg line="param1 param2 param3"/>]
</java>
```

`classname` 用于指定运行的类的名称；

`fork="yes"` 表示另起一个 JVM 来执行 java 命令，而不是中断 Ant 命令。

d. `<jar>`

打包成 jar 包，形如：

```xml
<jar destfile="main.jar" basedir="">
	<manifest>
        <!--指定主类-->
    	<attribute name="Main-Class" value="classname"/>
    </manifest>
</jar>
```

`destfile` 指定 jar 包的名称，一般为 `${dest}/main.jar`；

`basedir` 指定需要打包的目录，一般为 `${class}`；

`manifest` 表示设置 META-INF。

e. `<mkdir>`

创建目录，形如：

```xml
<mkdir dir="a\b\c" />
```

f. `<delete>`

删除目录，形如：

```xml
<delete dir="a\b"/>
```

删除文件，形如：

```xml
<delete file="1.txt"/>
```

g. `<tstamp>`

时间戳，形如：

```xml
<tstamp/>
```

接下来可以使用 `${DSTAMP}` 调用当前时间。

h. `<copy>`

复制文件，形如：

```xml
<copy file="file1" tofile="file2"/>
```

`file` 是源文件；

`tofile` 是目标文件。

i. `<move>`

移动文件，形如：

```xml
<move file="file1" tofile="file2"/>
```

`file` 是源文件；

`tofile` 是目标文件。

j. `<replace>`

用于替换字符串，形如：

```xml
<replace file="filename" token="old" value="new"/>
```

`file` 表示要执行替换的文件；

`token` 表示被替换的字符串；

`value` 表示替换的字符串。

### 一般项目中的 Ant 结构

```xml
<project default="init">  
    <property name="src" value="src"/>  
    <property name="classes" value="classes"/>  
    <property name="dest" value="dest"/>  
    <path id="classpath">  
        <pathelement path="${classes}"/>  
    </path>  
    <target name="help">  
        <echo>help -打印帮助信息</echo>  
        <echo>compile -编译java源文件</echo>  
        <echo>run -运行程序</echo>  
        <echo>build -打成jar包</echo>  
        <echo>clean -清除全部编译生成文件</echo>  
    </target>  
    <target name="compile">  
        <delete dir="${classes}"/>  
        <mkdir dir="${classes}"/>  
        <javac srcdir="${src}" destdir="${classes}"/>  
    </target>  
    <target name="run" depends="compile">  
        <java classname="org.xiazdong.Test" fork="yes">  
            <classpath path="${classes}"/>  
        </java>  
    </target>  
    <target name="build" depends="run">  
        <delete dir="${dest}"/>  
        <mkdir dir="${dest}"/>  
        <jar destfile="${dest}/Test.jar" basedir="${classes}">  
            <manifest>  
                <attribute name="Main-Class" value="org.xiazdong.Test"/>  
            </manifest>  
        </jar>  
    </target>  
    <target name="clean">  
        <delete dir="${classes}"/>  
        <delete dir="${dest}"/>  
    </target>  
</project>
```

### 运行 Ant

在当前目录下的 `build.xml` 运行 Ant ，执行缺省的 target。

```
ant
```

在当前目录下的 `build-test.xml` 运行 Ant，执行缺省的 target。

```
ant -buildfile build-test.xml
```

在当前目录下的 `build-test.xml` 运行 Ant，执行名称为 clean 的 target。

```
ant -buildfile build-test.xml clean
```

在当前目录下的 `build-test.xml` 运行 Ant，执行名称为 clean 的 target，设定属性 build 的值为 build/classes。

```
ant -buildfile build-test.xml -Dbuild=build/classes clean
```

### 在 Eclipse 中使用 Ant

(1) 点击 window->preferences->General->editors->file associations；

(2)  在 File types 中创建一个 build.xml ，并将 associated editor 的默认项设置为 ant editor 即可；当在项目中创建一个 build.xml 时，这个文件就是 ant 的生成文件。



## Junit

### 简介

Junit 是一个单元测试的工具，可以用来检验程序中的方法是否符合预期。

### 在 Eclipse 导入 Junit

下载 eclipse 的 Junit 插件，放置在 eclipse 安装文件夹下的 plugins 文件夹中。

右键待测试的项目 -> Properties -> build path -> Junit，将 Junit 导入工程。

### 编写测试类

```java
import org.junit.Test;

public class Test {
    @Test
    public void test1() {
        assertEquals(expected_result, new test_class().test_method(args));
    }
}
```

### 运行测试类

右键测试类 -> Run As -> JUnit Test

### 测试结果分析

(1) Runs：表示总共有几个测试方法，已经运行了几个；
(2) Errors：表示抛出异常的测试方法的个数；
(3) Failures：表示失败的测试方法的个数；
(4) 打钩：表示通过测试方法。 

### Eclipse 自动生成测试类

右键被测试的类 -> New -> Other ->JUnit Test Case -> 选择要测试的方法 -> 自动生成测试类。



## 参考资料

[1] [【Linux入门学习之】vi/vim编辑器必知必会]( https://blog.csdn.net/xiajun07061225/article/details/7039413 )

[2] [Ant是什么?]( https://blog.csdn.net/qq997404392/article/details/76986978 )

[3] [Junit使用的超简单介绍]( https://blog.csdn.net/u014294166/article/details/52454392 )

[4] [java基础入门（一）]( https://blog.csdn.net/man_zuo/article/details/80033833 )