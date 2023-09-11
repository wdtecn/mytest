package com.wdtecn.mytest.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
* 测试类
*
* @author wdtecn wdtecn@163.com
* @since 1.0.0 2023-09-10
*/
@Data
public class DemoVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private String colA;

	private Integer colB;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime colC;


}