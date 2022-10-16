package com.github.acticfox.demo.util;

import java.util.Set;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class ValidateUtil {
    /** 错误代码 */
    private static final int ERROR_CODE = 400;
    /** 重复数据的错误代码 */
    public static final int REPEAT_ERROR_CODE = 406;
    /** 重复数据的错误代码 */
    public static final int OTHER_ERROR_CODE = 200;
    /** 错误信息 */
    public static final String ERROR_MESSAGE = "数据效验失败";
    /** 验证 */
    private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

    /**
     * 获取验证器
     *
     * @since 1.0 Created by lipangeng on 2018/2/4 下午6:48. Email:lipg@outlook.com
     */
    public static Validator getValidator() {
        return validatorFactory.getValidator();
    }

    /**
     * 效验对象，如果效验失败的话则抛出异常
     *
     * @param t 需要验证的对象
     *
     * @since 1.0 Created by lipangeng on 2018/2/6 下午5:38. Email:lipg@outlook.com
     */
    public static <T> T validate(T t) {
        Validator validator = getValidator();
        Set<ConstraintViolation<T>> validate = validator.validate(t);
        // 如果参数效验失败,则抛出效验失败异常
        if (validate != null && !validate.isEmpty()) {
            ConstraintViolation<T> violation = validate.iterator().next();
            throw new RuntimeException(
                String.format("Validate Fail,Field:%s,%s", violation.getPropertyPath(), violation.getMessage()));
        }
        return t;
    }

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
