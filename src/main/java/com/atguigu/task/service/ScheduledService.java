package com.atguigu.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Mr.Z
 * @create 2019/8/12 14:39
 */
@Service
public class ScheduledService {

    /**
     * second(秒), minute（分）, hour（时）, day of month（日）, month（月）, day of week（周几）.
     * 0和7都是星期日 L：最后 W：工作日 #：第几个
     * 0 * * * * MON-FRI
     *  【0 0/5 14,18 * * ?】 每天14点整，和18点整，每隔5分钟执行一次
     *  【0 15 10 ? * 1-6】 每个月的周一至周六10:15分执行一次
     *  【0 0 2 ? * 6L】每个月的最后一个周六凌晨2点执行一次
     *  【0 0 2 LW * ?】每个月的最后一个工作日凌晨2点执行一次
     *  【0 0 2-4 ? * 1#1】每个月的第一个周一凌晨2点到4点期间，每个整点都执行一次；
     */
    //@Scheduled(cron = "0 * * * * MON-SAT") 每一秒启动一次
    //@Scheduled(cron = "0,1,2,3 * * * * MON-SAT") 每一分钟的0，1，2，3秒启动一次
    //@Scheduled(cron = "0-4 * * * * MON-SAT") 每一分钟的0，1，2，3秒启动一次
    @Scheduled(cron = "40/4 * * * * MON-SAT") //每一分钟的第四十秒开始，间隔四秒执行一次
    public void hello(){
        System.out.println("Hi!!!");
    }
}
