package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappRoute;
import doan.backend.transport.repository.TicketappRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteService {
    @Autowired
    TicketappRouteRepository routeRepository;

    public List<TicketappRoute> getList() {
        return routeRepository.findAll();
    }

    public Optional<TicketappRoute> findById(int id) {
        return routeRepository.findById(id);
    }

    public TicketappRoute insert(TicketappRoute route) {
        return routeRepository.save(route);
    }

    public TicketappRoute update(TicketappRoute route) {
        return routeRepository.save(route);
    }

    public void delete(int id) {
        routeRepository.deleteRoute(id);
    }
}
