package com.wdtecn.mytest.common.query;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
* 测试类查询
*
* @author wdtecn wdtecn@163.com
* @since 1.0.0 2023-09-10
*/
@Data
@EqualsAndHashCode(callSuper = false)
public class DemoQuery {

    private String colA;

    private Boolean colB;

    private LocalDateTime colC;

    Integer page;

    Integer limit;
}