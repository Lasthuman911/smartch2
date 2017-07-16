package org.smart.framework.helper;

import org.smart.ch2.util.PropsUtil;
import org.smart.framework.ConfigConstant;

import java.util.Properties;

/**
 * 属性文件助手类-frameWork
 * Created by lszhen on 2017/7/16.
 */
public final class Confighelper {

    private static final Properties CONFIG_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取jdbc驱动
     * @return
     */
    public static String getJdbcDriver(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.DRIVER);
    }

    /**
     * 获取jdbc url
     * @return
     */
    public static String getJdbcUrl(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.URL);
    }

    /**
     * 获取jdbc userName
     * @return
     */
    public static String getJdbcUserName(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.USERNAME);
    }

    /**
     * 获取jdbc password
     * @return
     */
    public static String getJdbcPassword(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.PASSWORD);
    }

    /**
     * 获取应用基础包名
     * @return
     */
    public static String getBasePackage(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.BASE_PACKAGE);
    }

    /**
     * 获取jsp 路径
     * @return
     */
    public static String getJspPath(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JSP_PATH);
    }

    /**
     * 获取应用资源目录
     * @return
     */
    public static String getAssetPath(){
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.ASSET_PATH);
    }
}
