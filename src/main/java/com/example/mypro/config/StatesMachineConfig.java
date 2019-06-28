package com.example.mypro.config;

import com.example.mypro.dao.entity.Events;
import com.example.mypro.dao.entity.States;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineConfigurationConfigurer;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

import java.util.EnumSet;

@Configuration
@EnableStateMachine
@Slf4j
public class StatesMachineConfig extends EnumStateMachineConfigurerAdapter<States,Events>{
    @Override
    public void configure(StateMachineStateConfigurer<States, Events> states) throws Exception {
        states.withStates().initial(States.NEWBILL).states(EnumSet.allOf(States.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<States, Events> transitions) throws Exception {
        transitions.withExternal().source(States.NEWBILL).target(States.INBATCH).event(Events.NEWBATCH).and()
                .withExternal().source(States.INBATCH).target(States.DOWN).event(Events.ACCOUNT);
    }

}
