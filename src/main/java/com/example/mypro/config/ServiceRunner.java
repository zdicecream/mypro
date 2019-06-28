package com.example.mypro.config;

import com.example.mypro.dao.entity.Events;
import com.example.mypro.dao.entity.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.statemachine.StateMachine;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * 实际在springCloud里mina ----------- 应该 ------不会使用
 */
@Component
@Order(2)
public class ServiceRunner implements CommandLineRunner{

    /**
     * 临时触发下状态机
     */
    @Resource
    private StateMachine<States,Events> stateMachine;
    @Override
    public void run(String... args) throws Exception {
        stateMachine.start();
        stateMachine.sendEvent(Events.NEWBATCH);
        stateMachine.sendEvent(Events.ACCOUNT);
    }
}
