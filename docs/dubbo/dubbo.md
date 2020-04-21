参考：http://dubbo.apache.org/en-us/docs/user/quick-start.html

### 一、RPC

> RPC：指远程过程调用，是一种进程间通信方式，允许程序调用另一个地址空间（通常是共享网络的另一台机器上）的过程或函数，而不是程序员显示编码这个远程调用的细节，即程序员无论是调用本地的还是远程的函数，本质上编写的调用代码基本相同

RPC基本原理

![image](../../assets/dubbo/RPC基本原理.jpg)

决定RPC框架的性能：
> - 通信：socket连接效率
> - 序列化与反序列化的方式（xml、JSON、二进制流）

dubbo角色图：

![image](../../assets/dubbo/dubbo角色.jpg)

dubbo-admin/dubbo-monitor安装：https://github.com/apache/dubbo

