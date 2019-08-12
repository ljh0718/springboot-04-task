package com.atguigu.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Mr.Z
 * @create 2019/8/12 14:30
 */
@Service
public class AsyncService {

    //告诉spring这是一个异步的方法
    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     System.out.println("数据处理中");
    }
}
