package com.wdtecn.mytest.mapper;

import com.wdtecn.mytest.entity.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wdtecn
 * @since 2023-09-07
 */
@Mapper
public interface DemoMapper {

    /**
     * 查询所有
     * @return
     */
    List<Demo> selectAll (@Param("colA") Integer colA, @Param("colB") Boolean colB);

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
    int save (Demo demo);

    /**
     * 更新
     * @param demo
     * @return
     */
    int update (Demo demo);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteById (int id);

}
