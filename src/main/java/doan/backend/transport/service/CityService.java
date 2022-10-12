package doan.backend.transport.service;

import doan.backend.transport.entity.TicketappCity;
import doan.backend.transport.repository.TicketappCityRepository;
import doan.backend.transport.repository.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService implements dao<TicketappCity> {
    @Autowired
    TicketappCityRepository cityRepository;

    public List<TicketappCity> getList() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<TicketappCity> findById(int id) {
        return cityRepository.findById(id);
    }

    public void insert(TicketappCity route) {
        cityRepository.save(route);
    }

    public void update(TicketappCity route) {
        cityRepository.save(route);
    }

    public void delete(int id) {
        cityRepository.deleteById(id);
    }
}
