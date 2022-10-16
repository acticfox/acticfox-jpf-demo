package com.github.acticfox.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidateUtil {
    private static final Logger logger = LoggerFactory.getLogger(ValidateUtil.class);
    /** 错误代码 */
    private static final int ERROR_CODE = 400;
    /** 重复数据的错误代码 */
    public static final int REPEAT_ERROR_CODE = 406;
    /** 重复数据的错误代码 */
    public static final int OTHER_ERROR_CODE = 200;
    /** 错误信息 */
    public static final String ERROR_MESSAGE = "数据效验失败";

    /**
     * 效验状态，如果错误的话则抛出异常
     *
     * @since 1.0 Created by lipangeng on 2018/2/6 下午5:54. Email:lipg@outlook.com
     */
    public static void checkState(boolean expression, String message, Object... formatArgs) {
        if (!expression) {
            throw new RuntimeException("Check State Failed" + message);
        }
    }

    /**
     * 效验状态，如果错误的话则抛出异常
     *
     * @since 1.0 Created by lipangeng on 2018/2/6 下午5:54. Email:lipg@outlook.com
     */
    public static void checkState(boolean expression, int code, String desc, String message, Object... formatArgs) {
        if (!expression) {
            throw new RuntimeException("Check State Failed." + desc + message);
        }
    }

    /**
     * 效验状态，如果错误的话则抛出异常
     *
     * @since 1.0 Created by lipangeng on 2018/2/6 下午5:54. Email:lipg@outlook.com
     */
    public static void checkStateByMsg(boolean expression, int code, String message) {
        if (!expression) {
            throw new RuntimeException("Check State Failed." + code + message);
        }
    }
}
