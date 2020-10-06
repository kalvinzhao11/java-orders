package com.kalvinzhao.orders.services;

import com.kalvinzhao.orders.models.Agent;
import com.kalvinzhao.orders.repositories.AgentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional //anytime if any method is transactional, make the whole class transactional
@Service(value = "agentServices")
public class AgentServiceImp implements AgentService{

    @Autowired
    AgentRepo Agentrepos;

    @Transactional
    @Override
    public Agent save(Agent agent) {
        return Agentrepos.save(agent);
    }
}
