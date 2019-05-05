package com.jxtb.dubbo.api.protocol;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by jxtb on 2019/4/30.
 */
@Data
@ToString
public abstract class AbstractReq implements Serializable{
    /**
     * 交易服务码
     */
    private String serviceId;
    /**
     * 请求流水号
     */
    private String requestId;
}
