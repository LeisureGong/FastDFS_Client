package com.github.tobato.fastdfs;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

/**
 * 测试常量定义
 *
 * @author tobato
 */
@SuppressWarnings("unused")
public class TestConstants {
    private static String ip_home = "47.98.192.149";
    //Tracker和Storage不在一个机器的环境下
//    private static String ip_work = "47.98.192.149";
//    private static String ip_work_store = "47.98.192.149";
    public final static int PORT = 22122;//22122
    public final static int STORE_PORT = 23000; //23000
    //初始化Tracker地址
    public static InetSocketAddress address = new InetSocketAddress(ip_home, PORT);
    //初始化Storage地址
    public static InetSocketAddress store_address = new InetSocketAddress(ip_home, STORE_PORT);

    public static final int soTimeout = 550;
    public static final int connectTimeout = 500;
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    public static final String DEFAULT_GROUP = "group1";
    public static final String DEFAULT_STORAGE_IP = ip_home;

    public static final String PERFORM_FILE_PATH = "/images/gs.jpg";
    public static final String CAT_IMAGE_FILE = "/images/cat.jpg";
    public static final String FLY_IMAGE_FILE = "/images/fly.png";

}
