package com.imooc.demo.pattern.singleton;

public class LazyDoubleCheckSingleton {

    private  volatile  static LazyDoubleCheckSingleton lazyDoubleCheckSingleton ;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance(){

        if (lazyDoubleCheckSingleton == null)
        {
            //synchronized给目标对象上一个同步锁
            synchronized (LazyDoubleCheckSingleton.class)  //给这个类对象本身上同步锁，该class对象有且仅有一个放在jvm的classloader内
            {
                //1 memery  = allocate();  分配对象内存空间
                //2 instance(memory)   初始化对象
                //3 instance = memory   设置instance指向刚分配的内存，此时instance ！=null
                //1 2 3 的顺序有可能会变化
                if(lazyDoubleCheckSingleton == null)
                {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }



}
