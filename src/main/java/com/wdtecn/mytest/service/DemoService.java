package com.wdtecn.mytest.service;

import com.wdtecn.mytest.entity.Demo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wdtecn
 * @since 2023-09-07
 */
public interface DemoService {

    /**
     * 查询全部
     * @return
     */
    List<Demo> selectAll(Integer colA, Boolean colB);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Demo getDemoInfo(int id);

    /**
     * 新增
     * @param demo
     * @return
     */
    Demo save(Demo demo);

    /**
     * 修改
     * @param demo
     * @return
     */
    int update(Demo demo);

    /**
     * 删除
     * @param id
     * @return
     */
    int deleteById(int id);
}
