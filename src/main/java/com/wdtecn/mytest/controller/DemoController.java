package com.wdtecn.mytest.controller;


import com.wdtecn.mytest.common.utils.R;
import com.wdtecn.mytest.entity.Demo;
import com.wdtecn.mytest.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wdtecn
 * @since 2023-09-07
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/list")
    public R<List<Demo>> list(Integer colA, Boolean colB){
        List<Demo> list = demoService.selectAll(colA, colB);

        return R.ok(list);
    }

    @GetMapping("{id}")
    public R<Demo> get(@PathVariable("id") Integer id){
        Demo demo = demoService.getDemoInfo(id);

        return R.ok(demo);
    }

    @PostMapping("/add")
    public R<?> save(@RequestBody Demo demo){
        demoService.save(demo);

        return R.ok();
    }

    @PostMapping("/edit")
    public R<?> update(@RequestBody Demo demo){
        demoService.update(demo);

        return R.ok();
    }

    @GetMapping("/del")
    public R<?> delete(@RequestParam Integer id){
        demoService.deleteById(id);

        return R.ok();
    }
}