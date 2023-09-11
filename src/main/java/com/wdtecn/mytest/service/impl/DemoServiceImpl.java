package com.wdtecn.mytest.service.impl;

import com.wdtecn.mytest.entity.Demo;
import com.wdtecn.mytest.mapper.DemoMapper;
import com.wdtecn.mytest.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wdtecn
 * @since 2023-09-07
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    DemoMapper demoMapper;

    @Override
    public List<Demo> selectAll(Integer colA, Boolean colB) {
        return demoMapper.selectAll(colA, colB);
    }

    @Override
    public Demo getDemoInfo(int id) {
        return demoMapper.getDemoInfo(id);
    }

    @Override
    public Demo save(Demo demo) {
        int save = demoMapper.save(demo);
        return demo;
    }

    @Override
    public int update(Demo demo) {
        return demoMapper.update(demo);
    }



    @Override
    public int deleteById(int id) {
        return demoMapper.deleteById(id);
    }

}
