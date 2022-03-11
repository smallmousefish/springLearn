package org.simpleframework.util;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

@Slf4j
public class ClassUtil {

    public static final String FILE_PROTOCOL = "file";

    /**
     * 获取包下面的类集合
     */

    public  static Set<Class<?>> extractPackageClass(String packageName){
        //1. 获取类加载器
        ClassLoader classLoader = getClassLoader();
        //2 。通过类加载器获取加载的资源
        URL url = classLoader.getResource(packageName.replace(".","/"));
        if (url == null)
        {
            log.warn("get nothing form packageName " + packageName);
            return null;
        }
        //3. 依据不同的资源类型，采用不同的方式获取资源集合
        Set<Class<?>> classSet = null;
        if(url.getProtocol().equalsIgnoreCase(FILE_PROTOCOL))
        {
            classSet = new HashSet<Class<?>>();

            File packageDirectory = new File(url.getPath());

            extractClassFile(classSet,packageDirectory,packageName);
        }
        return  classSet;
    }

    /**
     * 递归获取目标package里面的所有class文件 包括子目录下的class
     * @param emptyClassSet
     * @param fileSource
     * @param packageName
     */
    private static void extractClassFile(Set<Class<?>> emptyClassSet, File fileSource, String packageName) {
        if(!fileSource.isDirectory())
        {
            return;
        }
        //如果是一个文件夹，使用listfiles方法获取文件夹下的文件或者文件夹
        File[] files = fileSource.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.isDirectory())
                {
                    return true;
                }
                else
                {
                    //获取文件的绝对值路径
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath.endsWith(".class"))
                    {
                        addToCLassSet(absolutePath);
                    }

                }
                return false;
            }
            //根据class文件的绝对值路径，获取并生成class对象，并放入classSet中
            private void addToCLassSet(String absolutePath) {
                //1.从class文件的绝对值路径中提取出包含了package的类名
                //2.通过反射机制获取对应class对象并加入classset
                absolutePath = absolutePath.replace(File.separator,".");
                String className = absolutePath.substring(absolutePath.indexOf(packageName));
                className = className.substring(0,className.lastIndexOf("."));
                Class targetClass =  loadClass(className);
                emptyClassSet.add(targetClass);

            }
        });
        if (files != null){
            for (File file : files) {
                extractClassFile(emptyClassSet,file,packageName);
            }
        }

    }

    public static Class<?> loadClass(String className){
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            log.error("load class error",e);
            e.printStackTrace();
            throw  new RuntimeException(e);
        }
    }

    /**
     * 返回类加载器
     * @return
     */
    public static ClassLoader getClassLoader()
    {
        return Thread.currentThread().getContextClassLoader();
    }

    public static void main(String[] args) {
        extractPackageClass("com.imooc.demo.reflect");
    }
}
