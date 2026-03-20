#### 双列集合的特点

![img.png](document.image/双列集合的特点.png)

**键和值 它们是一一对应的关系**

#### Map常见的API

![img.png](document.image/Map常见的API.png)

#### Map的遍历方式

![img.png](document.image/Map的遍历方式.png)

#### Map的遍历方式(Lambda表达式)

![img.png](document.image/Map的遍历方式(Lambda表达式).png)  

**HashMap的特点**  
![img.png](document.image/HashMap的特点.png)  
**HashMap的底层原理**  
**HashMap小结**  
![img.png](document.image/HashMap小结.png)  

**LinkedHashMap**  
![img.png](document.image/LinkedHashMap.png)  
****  
## TreeMap  
* TreeMap跟TreeSet底层原理一样，都是红黑树结构  
* 由键决定特性: 不重复 无索引 可排序 
* 可排序:对键进行排序
* 注意:默认按键的从小到大进行排序 也可也自己规定键的排序规则  
**TreeMap小结**  
![img.png](document.image/TreeMap小结.png)
****  

## 代码书写的两种排序规则  
* 实现Comparable接口 ，指定比较规则
* 创建集合时传递Comparator 比较器对象，指定比较规则  
****  
## 可变参数  
![img.png](document.image/可变参数.png)  
****  
## Collections  
![img.png](document.image/Collections.png)  
**Collections常用的API**  
![img.png](document.image/Collections常用的API.png)  
****  
## 不可变集合
### 创建不可变集合  
*不可变集合:不可以被修改的集合*  
### 不可变集合的应用场景  
*如果某个数据不能被修改，把它防御性的拷贝到不可变集合中是个很好的实践*  
*或者集合对象被不可信的库调用时，不可变形式是安全的*  
*简单理解:不想让别人修改集合里的内容*  
## 创建不可变集合的书写格式  
![img.png](创建不可变集合的书写格式%20.png)  
### 不可变集合的特点  
![img.png](document.image/不可变集合的特点.png)  
****  
## Stream流  
### Stream流的思想  
![img.png](document.image/Stream流的思想.png)  
### Stream流的作用  
*结合了Lambda表达式，简化集合，数组操作*  
### Stream流的使用步骤  
![img.png](document.image/Stream流的使用步骤.png)  
*Stream流的使用步骤第一步*  
![img.png](document.image/Stream流的使用步骤第一步.png)  
**注意**  
Stream 接口中静态方法 of 的细节  
方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组  
但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当做一个元素，放到 Stream 当中。  
#### Stream流的中间方法  
![img.png](document.image/Stream流的中间方法.png)  
#### Stream流的终结方法  
![img.png](document.image/Stream流的终结方法.png)  
#### Stream流总结  
![img.png](document.image/Stream流总结mg.png)  
****  
## 方法引用  
![img.png](document.image/方法引用.png)  
#### 方法引用的总结  
![img.png](document.image/方法引用的总结.png)  
#### 方法引用的分类  
![img.png](document.image/方法引用的分类.png)  
**引用静态方法**  
![img.png](document.image/引用静态方法.png)  
**引用成员方法**  
![img.png](document.image/引用成员方法.png)  
**引用构造方法**  
![img.png](document.image/引用构造方法.png)  
**使用类名引用成员方法**  
![img.png](document.image/使用类名引用成员方法.png)  
**引用数组的构造方法**  
![img.png](document.image/引用数组的构造方法.png)  
**方法引用总结**  
![img.png](document.image/方法引用总结.png)  
**方法引用有哪几种**  
![img.png](document.image/方法引用有哪几种.png)  
****  
## 异常  
### Error  
![img.png](document.image/Error.png)  
### Exception  
![img.png](document.image/Exception.png)  
### 异常小结  
![img.png](异常小结%20.png)  
### 运行时异常和编译时异常的区别  
![img.png](document.image/运行时异常和编译时异常的区别.png)  
### 异常的作用  
![img.png](document.image/异常的作用.png)  
### 异常的处理方式  
![img.png](document.image/异常的处理方式.png)  
**JVM默认的处理方式**  
![img.png](document.image/JVM默认的处理方式.png)  
### 自己处理(捕获异常)  
**格式**  
![img.png](document.image/自己捕获异常的格式.png)  
**目的**  
当代码出现异常时，可以让程序继续执行下去  
### 自己处理(灵魂四问)  
![img.png](document.image/自己处理(灵魂四问).png)  
### Throwable成员方法  
![img.png](document.image/Throwable成员方法.png)  
### 抛出处理  
![img.png](document.image/抛出处理.png)  
### 异常的三种处理方式  
![img.png](document.image/异常的三种处理方式.png)  
### 自定义异常  
![img.png](自定义异常%20.png)  
****
## File  
**file对象就表示一个路径，可以是文件的路径，也可以是文件夹的路径**
**这个路径可以是存在的，也允许是不存在的**  
### File创建对象的方法  
![img.png](document.image/File创建对象的方法.png)  
### File方法的小结  
![img.png](document.image/File方法的小结.png)  
### File常见的成员判断方法(判断、获取)  
![img.png](File常见的成员判断方法(判断、获取).png)  
### File常见的成员判断方法(创建，删除)  
![img.png](File常见的成员判断方法(创建，删除).png)  
### File常见的成员判断方法(获取并遍历)  
![img.png](document.image/File常见的成员判断方法(获取并遍历).png)  
****  
## IO流  
![img.png](document.image/IO流.png)  
### IO流的分类  
![img.png](document.image/IO流的分类.png)  
**纯文本文件**  
![img.png](document.image/纯文本文件.png)  
### IO流小结  
![img.png](document.image/IO流小结.png)  
### IO流体系  
![img.png](document.image/IO流体系.png)  
### 字节流  
![img.png](document.image/字节流.png)  
### FileOutputStream  
![img.png](document.image/FileOutputStream.png)  
### FileOutputStream书写细节  
![img.png](document.image/FileOutputStream书写细节.png)  
### FileOutputStream写数据的3钟方式  
![img.png](document.image/FileOutputStream写数据的3钟方式.png)  
###  FileOutputStream写数据的两个小问题  
![img.png](document.image/FileOutputStream写数据的两个小问题.png)  
###  FileOutputStream小结  
![img.png](document.image/FileOutputStream小结.png)  
### FileInputStream  
![img.png](document.image/FileInputStream.png)  
### FileInputStream书写细节  
![img.png](document.image/FileInputStream书写细节.png)  
### FileInputStream循环读取  
![img.png](document.image/FileInputStream循环读取.png)  
### FileInputStream读取的问题  
![img.png](document.image/FileInputStream读取的问题.png)  
### FileInputStream一次读取多个字节  
![img.png](document.image/FileInputStream一次读取多个字节.png)  
****  
### Java中的编码和解码  
![img.png](document.image/Java中的编码和解码.png)  
### 为什么会有乱码  
![img.png](document.image/为什么会有乱码.png)  

### 字符流  
![img.png](document.image/字符流.png)  
### FileReader  
![img.png](document.image/FileReader.png)  
### FileReader构造方法  
![img.png](document.image/FileReader构造方法.png)  
### FileReader成员方法  
![img.png](document.image/FileReader成员方法.png)  
### FileReader书写细节  
![img.png](document.image/FileReader书写细节.png)  
###  字节流和字符流的使用场景  
![img.png](document.image/字节流和字符流的使用场景.png)  
****
## 字节缓冲流  
![img.png](document.image/字节缓冲流.png)  
### 字节缓冲流的方法  
![img.png](document.image/字节缓冲流的方法.png)  
****  
## 字符缓冲流  
### 字符缓冲流的构造方法  
![img.png](document.image/字符缓冲流的构造方法.png)  
### 字符缓冲流特有的方法  
![img.png](document.image/字符缓冲流特有的方法.png)  
### 缓冲流小结  
![img.png](document.image/缓冲流小结.png)  
### 转换流  
![img.png](document.image/转换流.png)  
### 转换流小结  
![img.png](document.image/转换流小结.png)  
****  
## 序列化流  
**可以把Java中的对象写到本地文件当中**  
**也叫做对象操作输出流**  
### 序列化流的构造方法以及成员方法  
![img.png](document.image/序列化流的构造方法以及成员方法.png)  
### 序列化流的小细节  
![img.png](document.image/序列化流的小细节.png)  
## 反序列化流  
![img.png](document.image/反序列化流.png)  
### 序列化流/反序列化流的细节汇总  
![img.png](序列化流反序列化流的细节汇总%20.png)  
****  
## 打印流  
![img.png](document.image/打印流.png)  
### 字节打印流  
![img.png](document.image/字节打印流.png)  
### 字节打印流的成员方法  
![img.png](document.image/字节打印流的成员方法.png)  
### 字符打印流  
![img.png](字符打印流%20.png)  
### 字符打印流的成员方法  
![img.png](document.image/字符打印流的成员方法.png)  
### 打印流的总结  
![img.png](document.image/打印流的总结.png)  
****  
## 解压缩流/压缩流  
### 解压缩流  
![img.png](解压缩流%20.png)  
****  
## Commons-io  
![img.png](document.image/Commons-io.png)  
### Commons-io的使用步骤  
![img.png](document.image/Commons-io的使用步骤.png)  
### Commons-io常见方法  
![img.png](Commons-io常见方法%20.png)  
### Commons-io流相关的方法  
![img.png](document.image/Commons-io流相关的方法.png)  
****  
## Hutool  
### Huttol工具包  
![img.png](document.image/Huttol工具包.png)  
****  
## 配置文件  
![img.png](document.image/配置文件.png)  
### properties配置文件    
****  
## 多线程  
###  线程  
**线程是操作系统能够进行运算调度最小的单位，它被包含在进程之中，是进程中实际的运作单位**  
*简单理解:应用软件中互相独立，可以同时运行的功能*  
### 多线程小结  
![img.png](document.image/多线程小结.png)