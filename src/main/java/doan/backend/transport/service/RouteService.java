package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappRoute;
import doan.backend.transport.repository.TicketappRouteRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class RouteService implements dao<TicketappRoute> {
    @Autowired
    TicketappRouteRepository routeRepository;

    public List<TicketappRoute> getList() {
        return routeRepository.findAll();
    }

    public Optional<TicketappRoute> findById(int id) {
        return routeRepository.findById(id);
    }

    public void insert(TicketappRoute route) {
        route.setCreatedDate(new Date());
        routeRepository.save(route);
    }

    public void update(TicketappRoute route) {
        route.setCreatedDate(new Date());
        routeRepository.save(route);
    }

    public void delete(int id) {
        routeRepository.deleteById(id);
    }
}
