package com.example.mypro.config;

import com.example.mypro.dao.entity.States;
import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;

@WithStateMachine
@Slf4j
public class EventConfig {

    @OnTransition(source = "NEWBILL")
    public void create(){
        log.info("新建");
    }

    @OnTransition(source = "NEWBILL",target ="INBATCH" )
    public void batch(){
        log.info("组批");
    }
    @OnTransition(source = "INBATCH",target ="DOWN" )
    public void account(){
        log.info("记账");
    }

}
