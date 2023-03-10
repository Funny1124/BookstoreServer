package com.guet_unknown.bookstoreserver.util;

import lombok.extern.slf4j.Slf4j;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 统一返回对象R
 *
 * @author cyan
 * @since 2022-12-17 11:06:36
 */
@Slf4j
@Data
@ApiModel("统一返回对象R")
public class R implements Serializable {
    private static final long serialVersionUID = -59518715338201812L;
    @ApiModelProperty(value = "响应编码")
    private int code;
    @ApiModelProperty(value = "响应信息")
    private String message;
    @ApiModelProperty(value = "响应数据")
    private Object data;

    /**
     * 设置数据
     *
     * @param data 数据
     * @return R
     */
    public R setData(Object data) {
        this.data = data;
        return this;
    }

    /**
     * 操作成功
     *
     * @return R
     */
    public static R success() {
        R r = new R();
        r.code = 200;
        r.message = "success";
        return r;
    }

    /**
     * 认证授权失败。 包括密钥信息不正确；数字签名错误；授权已超时
     *
     * @return R
     */
    public static R failure() {
        R r = new R();
        r.code = 401;
        r.message = "failure";
        return r;
    }

    /**
     * 系统异常
     *
     * @return R
     */
    public static R exp() {
        R r = new R();
        r.code = 500;
        r.message = "exception";
        return r;
    }
}


