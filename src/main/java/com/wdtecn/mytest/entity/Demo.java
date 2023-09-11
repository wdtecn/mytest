package com.wdtecn.mytest.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 测试类
 * </p>
 *
 * @author wdtecn
 * @since 2023-09-07
 */
public class Demo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String colA;

    private Boolean colB;

    private LocalDateTime colC;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColA() {
        return colA;
    }

    public void setColA(String colA) {
        this.colA = colA;
    }

    public Boolean getColB() {
        return colB;
    }

    public void setColB(Boolean colB) {
        this.colB = colB;
    }

    public LocalDateTime getColC() {
        return colC;
    }

    public void setColC(LocalDateTime colC) {
        this.colC = colC;
    }
}