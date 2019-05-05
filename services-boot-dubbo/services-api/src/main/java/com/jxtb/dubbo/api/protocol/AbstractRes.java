package com.jxtb.dubbo.api.protocol;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by jxtb on 2019/4/30.
 */
@Data
@ToString
public abstract class AbstractRes implements Serializable{
    /**
     * 返回码
     */
    private String code;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 请求流水号
     */
    private String requestId;

}
