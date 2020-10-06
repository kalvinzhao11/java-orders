package com.kalvinzhao.orders.repositories;

import com.kalvinzhao.orders.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepo extends CrudRepository<Agent, Long> {
}
