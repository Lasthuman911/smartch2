package org.smart.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

/**
 * 类操作工具类
 * Created by lszhen on 2017/7/16.
 */
public final class ClassUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassUtil.class);

    /**
     * 获取类加载器
     * @return
     */
    public static ClassLoader getClassLoader(){
        return Thread.currentThread().getContextClassLoader();
    }

    /**
     * 加载类
     * @param className
     * @param isInitialized
     * @return
     */
    public static Class<?> loadClass(String className, boolean isInitialized){
        //TODO
        return null;
    }

    /**
     * 获取指定包下的所有类
     * @param packageName
     * @return
     */
    public static Set<Class<?>> getClassSet(String packageName){
        //TODO
        return null;
    }
}
